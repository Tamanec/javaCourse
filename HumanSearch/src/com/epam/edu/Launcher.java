package com.epam.edu;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Launcher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Register register = new Register();
		
		register.registrate(new Human("Вася", "Пупкин", new GregorianCalendar(1990, Calendar.JULY, 16), new Address("Moscow", "xxx", "66", "99")));
		register.registrate(new Human("Петя", "Зубкин", new GregorianCalendar(1990, Calendar.JULY, 17), new Address("New York", "xxx", "77", "88")));
		
		Human human = register.getHumanByCity("New York");
		
		if (human == null) {
			System.out.println("В указанном городе никто не зарегистрирован.");
		} else {
			System.out.println(human);
		}
			
		System.out.println(register.getYoungestHuman());
		System.out.println(register.getOldestHuman());
		System.out.println(register.getHumansByStreet());
		System.out.println(register.getHumansbyDateRange(new GregorianCalendar(1990, Calendar.JULY, 1), new GregorianCalendar(1990, Calendar.JULY, 30)));
	}

}
