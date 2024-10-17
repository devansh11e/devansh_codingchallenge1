package com.hexaware.petPals.main;

import java.util.Scanner;

import com.hexaware.petPals.entity.Donation;
import com.hexaware.petPals.entity.Pet;
import com.hexaware.petPals.exception.InsufficientFundsException;
import com.hexaware.petPals.exception.InvalidPetAge;
import com.hexaware.petPals.service.Petserviceimpl;

public class DonationData {
	static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
	Petserviceimpl service=new Petserviceimpl();
	System.out.println("***Welcome To Donation Data***");
	System.out.println("1.Record a Donation");
	int choice=scanner.nextInt();
	switch(choice)
	{ case 1: try { Donation d1=readdonData();
	  boolean isValid;
	  isValid = Petserviceimpl.validateamount(d1);
	   if(isValid) {
	      int count =	service.RecordDonation(d1);
	      if(count>0) {
		System.out.println("Donation Added");
	       }
	else{
		System.err.println("Donation Added failed");
		}	
	 }}
    catch (InsufficientFundsException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
    }
		 break;
	default:System.out.println("Invalid Choice");
	   break;
	}
}

	public static Donation readdonData()
	{
		 Donation d2=new Donation();
		
		System.out.println("Enter Donor Name=");
			d2.setDonorName(scanner.next());
		System.out.println("Enter Amount");
			d2.setAmount(scanner.nextDouble());
		System.out.println("Enter ItemType");
			d2.setItemType(scanner.next());
		
		return d2;
	}
}
