/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epam.education;

import java.io.Serializable;
import java.util.Date;


/**
 *
 * @author Denis_Sidorov
 */
public class JournalItem implements Serializable {
    
    private Student student;
    private Subject subject;
    private Date date;
    private int mark;
    
    public JournalItem(Student student, Subject subject, Date date, int mark) {
        this.student = student;
        this.subject = subject;
        this.date = date;
        this.mark = mark;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
    
}
