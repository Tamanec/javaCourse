/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epam.education;


/**
 *
 * @author Denis_Sidorov
 */
public class Setoff extends Subject {

    public Setoff(String name, int hours) {
        super(name, hours);
    }

    @Override
    public ExamType getExType() {
        return ExamType.SETOFF;
    }

}
