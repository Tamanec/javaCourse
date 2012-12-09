package com.epam.edu;

import java.util.GregorianCalendar;

/**
 * Хранит данные и методы для управления человеком
 * 
 * @author Denis
 */
public class Human {
	
	static private int id;
	final private int personalId;
	final private String name;
	final private String lastName;	
	final private GregorianCalendar birthDay;
	private Address address;
	
	public Human(String name, String lastName, GregorianCalendar birthDay, Address address) {		
		this.name = name;
		this.lastName = lastName;
		this.birthDay = birthDay;		
		this.address = address;
		personalId = id++;
	}

	public String getName() {
		return name;
	}

	public String getLastName() {
		return lastName;
	}	

	public GregorianCalendar getBirthDay() {
		return birthDay;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public String getCity() {
		return address.getCity();
	}

	public String getStreet() {
		return address.getStreet();
	}

	public String getHouse() {
		return address.getHouse();
	}

	public String getRoom() {
		return address.getRoom();
	}
	
	public int getPersonalId() {
		return personalId;
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", lastName=" + lastName + ", address=" + address + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + personalId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (obj == null) {
			return false;
		}
		
		if (getClass() != obj.getClass()) {
			return false;
		}
		
		Human other = (Human) obj;
		
		if (personalId != other.personalId) {
			return false;
		}
		
		return true;
	}
	
}
