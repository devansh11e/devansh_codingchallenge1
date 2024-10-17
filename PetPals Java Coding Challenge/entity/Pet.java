package com.hexaware.petPals.entity;

public class Pet {
private int PetId;
   private String name;
   private int age;
   private String breed;
   private int AvailableOrNot;
public Pet() {
	super();
}
public Pet(int PetID,String name, int age, String breed,int AvailableOrNot) {
	super();
	this.PetId=PetID;
	this.name = name;
	this.age = age;
	this.breed = breed;
	this.AvailableOrNot=AvailableOrNot;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getBreed() {
	return breed;
}
public void setBreed(String breed) {
	this.breed = breed;
}

public int getAvailableOrNot() {
	return AvailableOrNot;
}
public void setAvailableOrNot(int availableOrNot) {
	AvailableOrNot = availableOrNot;
}


public int getPetId() {
	return PetId;
}
public void setPetId(int petId) {
	PetId = petId;
}
@Override
public String toString() {
	return "Pet [PetId=" + PetId + ", name=" + name + ", age=" + age + ", breed=" + breed + ", AvailableOrNot="
			+ AvailableOrNot + "]";
}

}
