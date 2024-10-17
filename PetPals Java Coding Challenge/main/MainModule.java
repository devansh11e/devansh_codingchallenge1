package com.hexaware.petPals.main;

import java.util.Scanner;

public class MainModule {
	static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		PetshelterData pe1=new PetshelterData();
		DonationData d1=new DonationData();
		AdoptionEventData a1=new AdoptionEventData();
		boolean flag=true;
		while(flag)
		{System.out.println("***Welcome To PetPals***");
		System.out.println("1.PetShelter Data");
		System.out.println("2.Donation Data");
		System.out.println("3.Adoption Events Data ");
		System.out.println("0.Exit");
		int choice=scanner.nextInt();
		switch (choice)
		{ case 1: pe1.main(args);
		    break;
		case 2: d1.main(args);
			break;
		case 3: a1.main(args);
			break;
		case 0:System.out.println("Exit");
	     break;
		default:System.out.println("Invalid Choice");
		     break;
		}
		
		}
		}
}
