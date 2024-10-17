package com.hexaware.petPals.entity;

import java.sql.Date;

public class Cashdonation extends Donation{
  Date DonationDate;

public Cashdonation(String donorName, double amount,Date donationDate) {
	super(donorName,amount);
	this.DonationDate = donationDate;
}

@Override
public String getDonorName() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public double getAmount() {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public Date getDonationDate() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public String getItemType() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void setItemType(String next) {
	// TODO Auto-generated method stub
	
}
  
}
