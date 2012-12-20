/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epam.education;


/**
 *
 * @author Denis_Sidorov
 */
public class Exam extends Subject {

    public Exam(String name, int hours) {
        super(name, hours);
    }

    @Override
    public ExamType getExType() {
        return ExamType.EXAM;
    }

}
