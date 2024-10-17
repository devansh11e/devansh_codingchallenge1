package com.hexaware.petPals.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hexaware.petPals.entity.Adoptionevent;
import com.hexaware.petPals.entity.Donation;
import com.hexaware.petPals.entity.Participants;
import com.hexaware.petPals.entity.Pet;
import com.hexaware.petPals.util.DBConnUtil;

public class Petdaoimpl implements Petdao{
	private Connection conn;

	public Petdaoimpl() {

		this.conn = DBConnUtil.getDBConnection();
	    if (this.conn == null) {
	        throw new RuntimeException("Failed to establish a database connection");
	    }
	}

	@Override
	public int AddPet(Pet pet) {
		// TODO Auto-generated method stub
        int count=0;
		
		String insert="insert into pets(PetID,Name,Age,Breed,AvailableforAdoption) values(?,?,?,?,?)";
		try {
			PreparedStatement pstmt=conn.prepareStatement(insert);
		
			pstmt.setInt(1, pet.getPetId());
			pstmt.setString(2, pet.getName());
			pstmt.setInt(3, pet.getAge());
			pstmt.setString(4, pet.getBreed());
			pstmt.setInt(5, pet.getAvailableOrNot());
			
			
			count=pstmt.executeUpdate();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
	}

	@Override
	public int RemovePet(Pet pet) {
		// TODO Auto-generated method stub
        int count=0;
		
		String delete="delete from pets where PetId=?";
		
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(delete);
			pstmt.setInt(1,pet.getPetId());
			
			count=pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		return count;
	}

	@Override
	public List<Pet> AvailablePets() {
      List<Pet> list=new ArrayList<Pet>();
		
		String selectAll="select * from pets where AvailableforAdoption=1";
		try {
			PreparedStatement pstmt=conn.prepareStatement(selectAll);
			
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()) {
				int PetID=rs.getInt("PetID");
				String Name=rs.getString("Name");
				int Age=rs.getInt("Age");
				String Breed=rs.getString("Breed");
				int AvailableOrNot=rs.getInt("AvailableforAdoption");
				
				Pet pe=new Pet(PetID,Name,Age, Breed,AvailableOrNot);
				list.add(pe);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public int RecordDonation(Donation don) {
       int count=0;
		
		String insert="insert into donations(DonorName,Amount,DonationDate,ItemType) values(?,?,?,?)";
		try {
			PreparedStatement pstmt=conn.prepareStatement(insert);
		
			pstmt.setString(1, don.getDonorName());
			pstmt.setDouble(2, don.getAmount());
			pstmt.setDate(3, don.getDonationDate());
			pstmt.setString(4, don.getItemType());
			
			
			count=pstmt.executeUpdate();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;

	}

	@Override
	public List<Participants> AllParticipants() {
		 List<Participants> list=new ArrayList<Participants>();
			
			String selectAll="select * from participants ";
			try {
				PreparedStatement pstmt=conn.prepareStatement(selectAll);
				
				ResultSet rs=pstmt.executeQuery();
				while(rs.next()) {
					int ParticipantID=rs.getInt("ParticipantID");
					String ParticipantName=rs.getString("ParticipantName");
					String Type=rs.getString("Type");
					
					Participants pa=new Participants(ParticipantID,ParticipantName,Type);
					list.add(pa);
					
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return list;
	}

	@Override
	public List<Adoptionevent> HostEvent() {
		List<Adoptionevent> list=new ArrayList<Adoptionevent>();
		
		String selectAll="select * from adoptionevents ";
		try {
			PreparedStatement pstmt=conn.prepareStatement(selectAll);
			
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()) {
				int EventID=rs.getInt("EventID");
				String Eventname=rs.getString("EventName");
				String Eventlocation=rs.getString("EventLocation");
				
				Adoptionevent eve1=new Adoptionevent(EventID,Eventname,Eventlocation);
				list.add(eve1);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public int RecordParticipant(Participants pa1) {
       int count=0;
		
		String insert="insert into participants(ParticipantID,ParticipantName,Type) values(?,?,?)";
		try {
			PreparedStatement pstmt=conn.prepareStatement(insert);
		
			pstmt.setInt(1, pa1.getParticipantID());
			pstmt.setString(2, pa1.getParticipantname());
			pstmt.setString(3, pa1.getType());
			
			
			count=pstmt.executeUpdate();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
	}

	@Override
	public int addevents(Adoptionevent eve) {
int count=0;
		
		String insert="insert into adoptionevents(EventID,EventName,EventLocation) values(?,?,?)";
		try {
			PreparedStatement pstmt=conn.prepareStatement(insert);
		
			pstmt.setInt(1, eve.getEventID());
			pstmt.setString(2, eve.getEventname());
			pstmt.setString(3, eve.getEventlocation());
			
			
			count=pstmt.executeUpdate();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
	}

}
