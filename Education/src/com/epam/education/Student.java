package com.epam.education;

import java.io.Serializable;
import java.util.Date;
import java.util.SortedSet;


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Denis_Sidorov
 */
public class Student implements Comparable<Student>, Serializable {

    private static int count = 0;

    private String lastName;
    private String name;
    private Date datein;
    private int id;    
    private Group group;

    public Student(String lastName, String name, Date datein, Group group) {
        this.lastName = lastName;
        this.name = name;
        this.datein = datein;        
        this.id = count++;
        this.group = group;
    }

    //группа
    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        if (this.group != null){
            this.group.removeStudent(this);
        }
        
        if (group != null) {
            group.addStudent(this);
        }
        
        this.group = group;
    }  

    public void setDatein(Date datein) {
        this.datein = datein;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return name;
    }

    public Date getDatein() {
        return datein;
    }

    public float getAvgMark() {
        float avgMark = 0;
        int count = 0;

        SortedSet<JournalItem> jourItems = group.getJournal().getItems();

        if (jourItems.size() > 0){
            for (JournalItem item : jourItems) {
                if (item.getStudent().getId() == this.id) {
                    avgMark = avgMark + item.getMark();
                    count++;
                }
            }
        }

        if (count > 0) {
            return avgMark / count;
        } else {
            return Float.NaN;
        }
    }

    public int getId() {
        return id;
    }
    
    @Override
    public int compareTo(Student o) {  
        if (this.getAvgMark() == o.getAvgMark()){
            return 0;
        }else{
            return this.getAvgMark() > o.getAvgMark() ? 1 : -1;
        }
    }

}
