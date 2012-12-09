package com.epam.edu;

import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Поиск людей
 * 
 * @author Denis
 */
public class Register {
		
	/**
	 * Реестр людей 
	 */
	private Set<Human> humans = new HashSet<Human>();
	
	/**
	 * Регистрирует человека
	 * 
	 * @param human человек
	 */
	public void registrate(Human human) {
		humans.add(human);
	}
	
	/**
	 * Поиск в реестре по фамилии
	 * 
	 * @param  lastName  фамилия
	 * @return найденный человек или null
	 */
	public Human getHumanByLastName(String lastName) {		 
		for (Human human : humans) {
			if (human.getLastName().equals(lastName)) {
				return human;
			}
		}
		
		return null;
	}
	
	/**
	 * Поиск в реестре по городу
	 * 
	 * @param  city фамилия
	 * @return      найденный человек или null
	 */	
	public Human getHumanByCity(String city) {
		for (Human human : humans) {
			if (human.getCity().equals(city)) {
				return human;
			}
		}
		
		return null;
	}
	
	/**
	 * Находит людей с датой рождения больше minDate и меньше maxDate
	 * 
	 * @param  minDate минимальный возраст
	 * @param  maxDate максимальный возраст
	 * @return         список людей
	 */
	public Set<Human> getHumansbyDateRange(GregorianCalendar minDate, GregorianCalendar maxDate) {
		Set<Human> inRange = new HashSet<Human>(); 
		
		for (Human human : humans) {
			if (human.getBirthDay().after(minDate) && human.getBirthDay().before(maxDate)) {
				inRange.add(human);
			}
		}
		
		return inRange;
	}
	
	/**
	 * Находит самого молодого
	 * 
	 * @return самый молодой человек
	 */
	public Human getYoungestHuman() {
		Iterator<Human> humansIterator = humans.iterator();		
		Human youngestHuman = humansIterator.next();
		Human currentHuman;
		
		while (humansIterator.hasNext()) {
			currentHuman = humansIterator.next();
			
			if (currentHuman.getBirthDay().after(youngestHuman.getBirthDay())) {
				youngestHuman = currentHuman;
			}
		}
		
		return youngestHuman;
	}
	
	/**
	 * Находит самого старикана
	 * 
	 * @return самый старый человек
	 */
	public Human getOldestHuman() {
		Iterator<Human> humansIterator = humans.iterator();		
		Human oldestHuman = humansIterator.next();
		Human currentHuman;
		
		while (humansIterator.hasNext()) {
			currentHuman = humansIterator.next();
			
			if (currentHuman.getBirthDay().before(oldestHuman.getBirthDay())) {
				oldestHuman = currentHuman;
			}
		}
		
		return oldestHuman;
	}
	
	/**
	 * Возвращает список людей, живущих на одной улице
	 * 
	 * @param  street название улицы
	 * @return        список людей
	 */
	public Map<String, Set<Human>> getHumansByStreet() {
		Map<String, Set<Human>> inStreet = new HashMap<String, Set<Human>>();
		String street;
		
		// раскладываем людей по улицам
		for (Human human : humans) {
			street = human.getStreet();
			Set<Human> humansOnStreet;
			
			if (inStreet.containsKey(street)) {
				humansOnStreet = inStreet.get(street);				
				humansOnStreet.add(human);													
			} else {
				humansOnStreet = new HashSet<Human>();
				humansOnStreet.add(human);
				inStreet.put(street, humansOnStreet);
			}
		}		
		
		// убираем людей которые живут одни	
		Iterator<String> streetIterator = inStreet.keySet().iterator();
		
		while (streetIterator.hasNext()) {
			String currentStreet = streetIterator.next();
			
			if (inStreet.get(currentStreet).size() < 2) {
				streetIterator.remove();
			}
		}
		
		return inStreet;
	}

}
