package com.hexaware.petPals.main;

import java.util.List;
import java.util.Scanner;

import com.hexaware.petPals.entity.Adoptionevent;
import com.hexaware.petPals.entity.Participants;
import com.hexaware.petPals.service.Petserviceimpl;

public class AdoptionEventData {
	static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
	Petserviceimpl service=new Petserviceimpl();
	System.out.println("***Welcome To Adoption Event Data***");
	System.out.println("1.Add a Participant");
	System.out.println("2.List of Events");
	System.out.println("3.List of Participants");
	System.out.println("4.Add an Event");
	int choice=scanner.nextInt();
	switch(choice)
	{ case 1: Participants p1=readpartdata();
       int count =	service.RecordParticipant(p1);
	   if(count>0) {
		System.out.println("Participant Added");
	}
	else{
		System.err.println("Participant Added failed");}
		 break;
		 
		 
	case 2: List<Adoptionevent> list = service.HostEvent();
    for (Adoptionevent eve1 : list) {
        System.out.println(eve1);
          }
		break;
		
		
	case 3: List<Participants> list1 = service.AllParticipants();
    for (Participants p2 : list1) {
        System.out.println(p2);
          }
		break;
		
		
		
	case 4: Adoptionevent eve1=readadopdata();
    int count1 =	service.addevents(eve1);
	   if(count1>0) {
		System.out.println("Event Added");
	}
	else{
		System.err.println("Event Added failed");}
		break;
		
		
		
		
		
	default:System.out.println("Invalid Choice");
	   break;
	}
}
	public static Participants readpartdata() 
	{ Participants p2=new Participants();
	System.out.println("Enter ParticipantID=");
	p2.setParticipantID(scanner.nextInt());
    System.out.println("Enter Participant  Name");
	p2.setParticipantname(scanner.next());
    System.out.println("Enter Participant Type");
	p2.setType(scanner.next());
	return p2;
	}
	
	public static Adoptionevent readadopdata()
	{ Adoptionevent eve2= new Adoptionevent(null);
	System.out.println("Enter EventID=");
	eve2.setEventID(scanner.nextInt());
    System.out.println("Enter Event  Name");
    eve2.setEventname(scanner.next());
    System.out.println("Enter Event Location");
	eve2.setEventlocation(scanner.next());
	return eve2;
	}
}
