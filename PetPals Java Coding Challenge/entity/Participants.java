package com.hexaware.petPals.entity;

public class Participants {
    int ParticipantID;
    String Participantname;
    String Type;
	public Participants() {
		super();
	}
	public Participants(int participantID, String participantname, String type) {
		super();
		this.ParticipantID = participantID;
		this.Participantname = participantname;
		this.Type = type;
	}
	public int getParticipantID() {
		return ParticipantID;
	}
	public void setParticipantID(int participantID) {
		ParticipantID = participantID;
	}
	public String getParticipantname() {
		return Participantname;
	}
	public void setParticipantname(String participantname) {
		Participantname = participantname;
	}
	
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	@Override
	public String toString() {
		return "Participants [ParticipantID=" + ParticipantID + ", Participantname=" + Participantname + ", Type=" + Type + "]";
	}
    
}
