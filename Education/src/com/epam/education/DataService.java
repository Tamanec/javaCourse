/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epam.education;

import java.io.File;


/**
 *
 * @author Denis_Sidorov
 */
public interface DataService<T> {

    public void save(T object, File file);
    public T load(File file) throws Exception;

}
