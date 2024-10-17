package com.hexaware.petPals.service;

import java.util.List;

import com.hexaware.petPals.entity.Adoptionevent;
import com.hexaware.petPals.entity.Donation;
import com.hexaware.petPals.entity.Participants;
import com.hexaware.petPals.entity.Pet;

public interface Petservice {
	int AddPet(Pet pet);
	   int RemovePet(Pet pet);
	   List<Pet> AvailablePets();
	   int RecordDonation(Donation don);
	   List<Participants> AllParticipants();
	   List<Adoptionevent> HostEvent();
	   int RecordParticipant(Participants pa1);
	   int addevents(Adoptionevent eve);
}
