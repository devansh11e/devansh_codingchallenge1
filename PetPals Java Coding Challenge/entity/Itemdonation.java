package com.hexaware.petPals.entity;

import java.sql.Date;

public class Itemdonation extends Donation{
     String ItemType;

	public Itemdonation(String donorName,double amount,String itemType) {
		super(donorName,amount);
		this.ItemType = itemType;
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
