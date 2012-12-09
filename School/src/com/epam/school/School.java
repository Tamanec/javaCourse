package com.epam.school;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class School {
	
	private List<Course> courses = new ArrayList<Course>();
	private List<Tutor> tutors = new ArrayList<Tutor>();

	/**
	 * @param args
	 */
	public static void main(String[] args) {	
		School jSchool = new School();
		
		Tutor riz = new Tutor("John Rizzo");
		Tutor kolya = new Tutor("Nicolas Brasseur");
		Tutor vacya = new Tutor("Vincent Delvaux");
		
		Course java = new Course("Java & OO", 1000);
		Course jpa = new Course("JPA", 1500);
		Course js = new Course("JavaScript", 700);
		
		Classroom a = new Classroom("A");
		Classroom b = new Classroom("B");
		
		Student fedya = new Student("Frederic", 10000);
		Student muri = new Student("Murielle", 10000);
		Student james = new Student("James", 10000);
		Student emma = new Student("Emmanuel", 10000);
		
		java.setTutor(riz);
		java.setClassroom(a);
		java.addStudent(fedya);
		java.addStudent(muri);
		java.addStudent(emma);
		
		jpa.setTutor(kolya);
		jpa.setClassroom(b);
		jpa.addStudent(muri);
		jpa.addStudent(james);
		jpa.addStudent(emma);
		
		js.setTutor(vacya);
		js.setClassroom(b);
		js.addStudent(james);
		js.addStudent(emma);
		
		
		jSchool.addCourse(java);
		jSchool.addCourse(jpa);
		jSchool.addCourse(js);
		
		jSchool.addTutor(riz);
		jSchool.addTutor(kolya);
		jSchool.addTutor(vacya);
		
		jSchool.showStudentsByClassRoom(a);
		System.out.println();
		jSchool.showTutorsWithStudents();
		System.out.println("");
		jSchool.showSharedStudents(a, b);
	}
	
	public void showStudentsByClassRoom(Classroom classroom) {
		Set<Student> students;
		try {
			students = getStudentsOf(classroom);
			
			System.out.println("РЎРїРёСЃРѕРє СЃС‚СѓРґРµРЅС‚РѕРІ РёР· РєРѕРјРЅР°С‚С‹ " + classroom);
			
			for (Student student : students) {
				System.out.println(student);
			}
		} catch (WrongeSearchParamException e) {
			System.out.println("РќРµ СѓРґР°Р»РѕСЃСЊ РЅР°Р№С‚Рё СЃС‚СѓРґРµРЅС‚РѕРІ.");
			System.err.println(e.getMessage());			
		}
	}
	
	public void showSharedStudents(Classroom first, Classroom second) {
		Set<Student> studentsFirst;
		Set<Student> studentsSecond;
		Set<Student> sharedStudents;
		
		try {
			studentsFirst = getStudentsOf(first);
			studentsSecond = getStudentsOf(second);
			
			if (studentsFirst.isEmpty() || studentsSecond.isEmpty()) {
				System.out.println("РќРµС‚ РѕР±С‰РёС… СЃС‚СѓРґРµРЅС‚РѕРІ.");
				return;
			}
			
			sharedStudents = new HashSet<Student>(studentsFirst);
			sharedStudents.retainAll(studentsSecond);
			System.out.println("РћР±С‰РёРµ СЃС‚СѓРґРµРЅС‚С‹:");
			
			for (Student student : sharedStudents) {
				System.out.println(student);
			}
		} catch (WrongeSearchParamException e) {
			System.out.println("РќРµ СѓРґР°Р»РѕСЃСЊ РЅР°Р№С‚Рё СЃС‚СѓРґРµРЅС‚РѕРІ.");
			System.err.println(e.getMessage());	
		}
	}
	
	public void showTutorsWithStudents() {
		Set<Student> students;
		
		System.out.println("РЎРїРёСЃРѕРє РїСЂРµРїРѕРґР°РІР°С‚РµР»РµР№ Рё РёС… СЃС‚СѓРґРµРЅС‚РѕРІ:");
		
		for (Tutor curTutor : tutors) {			
			System.out.print(curTutor + ": ");
			
			try {				
				students = getStudentsOf(curTutor);				
				
				for (Student student : students) {
					System.out.print(student + "; ");
				}
			} catch (WrongeSearchParamException e) {
				System.err.println(e.getMessage());
			}
			
			System.out.println("");
		}
	}
	
	private <T> Set<Student> getStudentsOf(T searchParam) throws WrongeSearchParamException {
		Set<Student> students = new HashSet<Student>();
		
		for (Course curCourse : courses) {
			T compareParam = curCourse.getCompareParam(searchParam);
			
			if (compareParam.equals(searchParam)) {
				students.addAll(curCourse.getStudents());
			}
		}
		
		return students;
	}
	
	public void addCourse(Course course) {
		courses.add(course);
	}
	
	public List<Course> getCourses() {
		return courses;
	}
	
	public void addTutor(Tutor tutor) {
		tutors.add(tutor);
	}
	
	public List<Tutor> getTutors() {
		return tutors;
	}

}
