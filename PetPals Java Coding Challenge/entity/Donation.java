package com.hexaware.petPals.entity;

import java.sql.Date;

public abstract class Donation {
    String DonorName;
    Double Amount;
	public Donation() {
		super();
	}
	public Donation(String donorName,Double Amount) {
		super();
		this.DonorName = donorName;
		this.Amount = Amount;
	}
	
	public void setDonorName(String donorName) {
		DonorName = donorName;
	}
	public void setAmount(Double amount) {
		Amount = amount;
	}
	public abstract String getDonorName();
	public abstract double getAmount();
	public abstract Date getDonationDate();
	public abstract String getItemType();
	public abstract void setItemType(String next);
    
}
