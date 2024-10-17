package com.hexaware.petPals.entity;

import java.util.List;

public class Adoptionevent {
	private List<Participants> allparticipants;
	int EventID;
	String Eventname;
	String Eventlocation;

	public Adoptionevent(List<Participants> availableparticipants) {
		super();
		this.allparticipants = availableparticipants;
	}

	public Adoptionevent(int eventID, String eventname, String eventlocation) {
		super();
		this.EventID = eventID;
		this.Eventname = eventname;
		this.Eventlocation = eventlocation;
	}

	public int getEventID() {
		return EventID;
	}

	public void setEventID(int eventID) {
		EventID = eventID;
	}

	public String getEventname() {
		return Eventname;
	}

	public void setEventname(String eventname) {
		Eventname = eventname;
	}

	public String getEventlocation() {
		return Eventlocation;
	}

	public void setEventlocation(String eventlocation) {
		Eventlocation = eventlocation;
	}

	@Override
	public String toString() {
		return "Adoptionevent [EventID=" + EventID + ", Eventname=" + Eventname + ", Eventlocation=" + Eventlocation
				+ "]";
	}

	
    
}
