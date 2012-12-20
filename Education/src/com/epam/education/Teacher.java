/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epam.education;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Denis_Sidorov
 */
public class Teacher implements Serializable{

    private static Logger logger = Logger.getLogger(Teacher.class.getName());
    private String lastName;
    private String name;
    private List<Subject> subjects;

    public Teacher(String lastName, String name, ArrayList<Subject> subjects) {
        this.lastName = lastName;
        this.name = name;
        this.subjects = subjects;
    }

    //фамилия преподавателя
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //имя преподавателя
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //предметы
    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public void addSubjects(Subject subject) {
        subjects.add(subject);
    }

    public void removeSubjects(Subject subject) {
        try{
            subjects.remove(subject);
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Can't remove subject.", e);
        }
    }
    
}
