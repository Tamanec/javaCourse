/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epam.education;

import java.io.Serializable;
import java.util.Date;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author Denis_Sidorov
 */
public class Journal implements Serializable {

    private SortedSet<JournalItem> items;
    private Group group;

    public Journal(Group group){
        items = new TreeSet<JournalItem>();
        this.group = group;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public void addItem(Student student, Subject subject, int mark){        
        items.add(new JournalItem(student, subject, new Date(), mark));
    }

    public SortedSet<JournalItem> getItems() {
        return items;        
    }
}
