package com.hexaware.petPals.main;

import java.util.List;
import java.util.Scanner;

import com.hexaware.petPals.entity.Pet;
import com.hexaware.petPals.exception.InvalidPetAge;
import com.hexaware.petPals.service.Petserviceimpl;

public class PetshelterData {
   
	static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
	Petserviceimpl service=new Petserviceimpl();
	System.out.println("***Welcome To Pet Shelter***");
	System.out.println("1.Add a Pet");
	System.out.println("2.Remove Pet");
	System.out.println("3.List of Available Pets");
	int choice=scanner.nextInt();
	switch(choice)
	{ case 1: try { Pet p1=readpetData();
	
	boolean isValid;
	
		isValid = Petserviceimpl.validateage(p1);
	 

     if(isValid) {
	int count =	service.AddPet(p1);
	
	if(count>0) {
		System.out.println("Pet Added");
	}
	else{
		System.err.println("Pet Added failed");
		
	}	
	
   }}
    catch (InvalidPetAge e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
    }
		 break;
	case 2: Pet p=new Pet();
	       System.out.println("Enter PetID=");
	       p.setPetId(scanner.nextInt());
	       int count1=service.RemovePet(p);
	       	if(count1>0) {
			System.out.println("Pet removed");	}
	       	else {
			System.err.println("Pet remove failed");
	       	}
	       	break;
	       	
	       	
	       	
	case 3: List<Pet> list = service.AvailablePets();
            for (Pet p1 : list) {
             System.out.println(p1);
               }
		break;
		
		
		
	default:System.out.println("Invalid Choice");
	   break;
	}
}
	public static Pet readpetData(){
		Pet p2= new Pet();
		
		System.out.println("Enter PetID=");
			p2.setPetId(scanner.nextInt());
		System.out.println("Enter Pet Name");
			p2.setName(scanner.next());
		System.out.println("Enter Age");
			p2.setAge(scanner.nextInt());
		System.out.println("Enter Breed");
			p2.setBreed(scanner.next());
		System.out.println("Enter Available Or Not");
			p2.setAvailableOrNot(scanner.nextInt());
		
		return p2;
	}	
}
