/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epam.education;

/**
 *
 * @author Denis_Sidorov
 */
public class StudentNotFoundExeption extends Exception {

    /**
     * Creates a new instance of
     * <code>StudentNotFoundExeption</code> without detail message.
     */
    public StudentNotFoundExeption() {
    }

    /**
     * Constructs an instance of
     * <code>StudentNotFoundExeption</code> with the specified detail message.
     *
     * @param msg the detail message.
     */
    public StudentNotFoundExeption(String msg) {
        super(msg);
    }
}
