package com.hexaware.petPals.entity;

public class Cat extends Pet {
 String catcolor;

public Cat() {
	super();
}

public Cat(String name,int age,String breed, String catcolor) {
	super();
	this.catcolor = catcolor;
}

public String getCatcolor() {
	return catcolor;
}

public void setCatcolor(String catcolor) {
	this.catcolor = catcolor;
}
 
}
