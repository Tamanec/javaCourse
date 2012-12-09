package com.epam.edu;

public class Adress {

	final private String city;
	final private String street;
	final private String house;
	final private String room;
	
	public Adress(String city, String street, String house, String room) {		
		this.city = city;
		this.street = street;
		this.house = house;
		this.room = room;
	}

	public String getCity() {
		return city;
	}

	public String getStreet() {
		return street;
	}

	public String getHouse() {
		return house;
	}

	public String getRoom() {
		return room;
	}

}
