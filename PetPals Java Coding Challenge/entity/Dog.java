package com.hexaware.petPals.entity;

public class Dog extends Pet{
       private String DogBreed;

	public Dog() {
		super();
	}

	public Dog(String name,int age,String breed,String dogBreed) {
		super();
		this.DogBreed = dogBreed;
	}

	public String getDogBreed() {
		return DogBreed;
	}

	public void setDogBreed(String dogBreed) {
		DogBreed = dogBreed;
	}
 
}
