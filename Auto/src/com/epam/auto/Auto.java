package com.epam.auto;

public class Auto {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Car merin = new Car();
		Car taz = new Vaz();
		Car supertaz = new Kalina();
				
		merin.move();
		taz.move();
		supertaz.move();		

	}

}
