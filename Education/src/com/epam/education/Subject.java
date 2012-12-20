/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epam.education;

import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Denis_Sidorov
 */
public abstract class Subject implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static Logger logger = Logger.getLogger(Subject.class.getName());
    private String name;
    private int hours;
    private List<Teacher> teachers;
        
    public Subject(String name, int hours) {
        this.name = name;
        this.hours = hours;        
    }

    //преподаватели предмета
    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void removeTeacher(Teacher teacher) {
        try {
            teachers.remove(teacher);
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Can't remove teacher.", e);
        }
    }

    //количество часов на предмет
    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    //название предмета
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //тип итоговой проверки знаний
    public abstract ExamType getExType();

}
