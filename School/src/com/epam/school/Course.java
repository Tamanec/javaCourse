package com.epam.school;

import java.util.ArrayList;
import java.util.List;

public class Course {
	
	private String name;
	private List<Student> students = new ArrayList<Student>();
	private Tutor tutor = null;
	private Classroom classroom = null;
	private float price = 0;
		
	public Course(String name, float price) {		
		this.name = name;
		this.price = price;
	}
	
	/**
	 * @param searchParam
	 * @return compareParam
	 * @throws WrongeSearchParamException
	 */
	public <T> T getCompareParam(T searchParam) throws WrongeSearchParamException {
		T compareParam;
		if (searchParam.getClass() == tutor.getClass()) {
			compareParam = (T) tutor;
		} else if (searchParam.getClass() == classroom.getClass()) {
			compareParam = (T) classroom;
		} else {
			throw new WrongeSearchParamException("РќРµРїСЂР°РІРёР»СЊРЅС‹Р№ РїР°СЂР°РјРµС‚СЂ " + searchParam + "(" + searchParam.getClass() + ")");
		}
		
		return compareParam;		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void addStudent(Student student) {
		float money = student.getMoney();
		
		if (money < price) {
			System.out.println("РЈ СЃС‚СѓРґРµРЅС‚Р° " + student + " РЅРµ РґРѕСЃС‚Р°С‚РѕС‡РЅРѕ СЃСЂРµРґСЃС‚РІ ($" + money + ") С‡С‚РѕР±С‹ Р·Р°РїРёСЃР°С‚СЊСЃСЏ РЅР° РєСѓСЂСЃ " + name + " ($" + price + ")");
			return;
		}
		
		student.setMoney(money - price);
		students.add(student);
	}
	
	public void addStudents(List<Student> students) {
		this.students = students;
	}
	
	public List<Student> getStudents() {
		return students;
	}
	
	public void setTutor(Tutor tutor) {
		this.tutor = tutor;
	}
	
	public Tutor getTutor() {
		return tutor;
	}

	public Classroom getClassroom() {
		return classroom;
	}

	public void setClassroom(Classroom classroom) {
		this.classroom = classroom;
	}
			
	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {		
		return name; 
	}
	
}
