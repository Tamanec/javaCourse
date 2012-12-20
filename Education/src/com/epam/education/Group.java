/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epam.education;

import java.io.Serializable;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Denis_Sidorov
 */
public class Group implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = -4307591070892478739L;
	private static Logger logger = Logger.getLogger(Group.class.getName());
    private String name;
    private SortedSet<Student> students = new TreeSet<Student>();
    private Journal journal;
    private Course course;

    public Group(String name) {
        this.name = name;        
        
        journal = new Journal(this);
    }

    //курс
    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        if (this.course != null){
            this.course.removeGroup(this);
        }
        
        if (course != null) {
            course.addGroup(this);
        }

        this.course = course;
    }

    //журнал
    public Journal getJournal() {
        return journal;
    }

    public void addJournalItem(Student student, Subject subject, int mark) {
        journal.addItem(student, subject, mark);        
    }

    //название группы
    public String getName() {
        return name;
    }
    
    public void setName(String Name) {
        this.name = Name;
    }

    //список студентов
    public SortedSet<Student> getStudents() {
        return students;
    }

    public void setStudents(SortedSet<Student> students) {
        this.students = students;
    }

    //выдергиваем студента
    public Student getStudent(int id) throws StudentNotFoundExeption {
        for (Student stud : students) {
            if (stud.getId() == id) {
                return stud;
            }
        }

        throw new StudentNotFoundExeption("В группе" + name + " нет такого студента.");
    }   

    //добавляем студента к группе
    public void addStudent(Student stud) {        
        students.add(stud);        
    }

    //исключаем студента
    public void removeStudent(Student stud) {
        try{
            students.remove(stud);
            stud.setGroup(null);
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Can't remove student.", e);
        }
    }

}
