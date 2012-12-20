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
class Course implements Serializable{

    /**
	 *  
	 */
	private static final long serialVersionUID = -3510643647269875997L;
	
	private static Logger logger = Logger.getLogger(Course.class.getName());
    private String name;    
    private List<Subject> subjects;
    private List<Group> groups;

    public Course(String name, List<Subject> subjects) {
        this.name = name;        
        this.subjects = subjects;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    public void addGroup(Group group) {
        groups.add(group);
    }

    public void removeGroup(Group group) {
        try {
            groups.remove(group);
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Can't remove group.", e);
        }
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public void addSubject(Subject subject) {
        subjects.add(subject);
    }

    public void removeSubjects(Subject subject) {
        try{
            subjects.remove(subject);
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Can't remove subject.", e);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
