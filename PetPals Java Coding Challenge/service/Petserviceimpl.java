package com.hexaware.petPals.service;

import java.util.List;
import com.hexaware.petPals.dao.Petdao;
import com.hexaware.petPals.dao.Petdaoimpl;
import com.hexaware.petPals.entity.Adoptionevent;
import com.hexaware.petPals.entity.Donation;
import com.hexaware.petPals.entity.Participants;
import com.hexaware.petPals.entity.Pet;
import com.hexaware.petPals.exception.InsufficientFundsException;
import com.hexaware.petPals.exception.InvalidPetAge;

public class Petserviceimpl implements Petservice{
	private Petdao dao;
    public Petserviceimpl()
    { dao= new Petdaoimpl();}
	@Override
	public int AddPet(Pet pet) {
		// TODO Auto-generated method stub
		return dao.AddPet(pet);
	}

	@Override
	public int RemovePet(Pet pet) {
		// TODO Auto-generated method stub
		return dao.RemovePet(pet);
	}

	@Override
	public List<Pet> AvailablePets() {
		// TODO Auto-generated method stub
		return dao.AvailablePets();
	}

	@Override
	public int RecordDonation(Donation don) {
		// TODO Auto-generated method stub
		return dao.RecordDonation(don);
	}

	@Override
	public List<Participants> AllParticipants() {
		// TODO Auto-generated method stub
		return dao.AllParticipants();
	}

	@Override
	public List<Adoptionevent> HostEvent() {
		// TODO Auto-generated method stub
		return dao.HostEvent();
	}

	@Override
	public int RecordParticipant(Participants pa1) {
		// TODO Auto-generated method stub
		return dao.RecordParticipant(pa1);
	}

	@Override
	public int addevents(Adoptionevent eve) {
		// TODO Auto-generated method stub
		return dao.addevents(eve);
	}

	public static boolean validateage (Pet p2) throws InvalidPetAge
	{ boolean flag=false;
	   if(p2.getAge()>0)
	   { flag=true;}
	   else
	   { throw new InvalidPetAge("Age can not be negative");}
	   return flag;
	}

public static boolean validateamount (Donation d2) throws InsufficientFundsException
{ boolean flag=false;
   if(d2.getAmount()>800)// 10$ to rupees
   { flag=true;}
   else
   { throw new InsufficientFundsException("Donation Amount is less than 800");}
   return flag;
}
}
