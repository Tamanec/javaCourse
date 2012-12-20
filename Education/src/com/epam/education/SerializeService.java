/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epam.education;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Denis_Sidorov
 */
public class SerializeService<T> implements DataService<T>{

    private static Logger logger = Logger.getLogger(Subject.class.getName());


    @Override
    public void save(T object, File file) {
        try {
            ObjectOutputStream serializer = new ObjectOutputStream(new FileOutputStream(file));
            serializer.writeObject(object);
            serializer.close();
        } catch (IOException ex) {
            logger.log(Level.SEVERE, "Ошибка при сохранении объекта", ex);
        }
    }

    @Override
    public T load(File file) throws Exception{
        try {
            ObjectInputStream unserializer = new ObjectInputStream(new FileInputStream(file));
            return (T) unserializer.readObject();
        } catch (IOException ex) {
            logger.log(Level.SEVERE, "Ошибка при чтении объекта", ex);
        } catch (ClassNotFoundException ex) {
            logger.log(Level.SEVERE, "Класс не найден", ex);
        }
        throw new Exception("Ошибка при загрузке объекта из файла");
    }



}
