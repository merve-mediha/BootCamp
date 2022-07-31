package entities.concretes;

import entities.abstracts.IEntity;

public class Person implements IEntity {
	private int id;
	private String nationalIdentity;
	private String fistName;
	private String lastName;
	private int yearOfBirth;
	
	
	
	public Person() {
		super();
	}
	public Person(int id, String nationalIdentity, String fistName, String lastName, int yearOfBirth) {
		super();
		this.id = id;
		this.nationalIdentity = nationalIdentity;
		this.fistName = fistName;
		this.lastName = lastName;
		this.yearOfBirth = yearOfBirth;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNationalIdentity() {
		return nationalIdentity;
	}
	public void setNationalIdentity(String nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}
	public String getFistName() {
		return fistName;
	}
	public void setFistName(String fistName) {
		this.fistName = fistName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getYearOfBirth() {
		return yearOfBirth;
	}
	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}
	
	
	

}
