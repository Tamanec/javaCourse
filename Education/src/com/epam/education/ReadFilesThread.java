/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epam.education;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Denis_Sidorov
 */
public class ReadFilesThread extends Thread{

    private static Logger logger = Logger.getLogger(Teacher.class.getName());

    //формат данных в файле
    private final int LASTNAME = 0;
    private final int NAME = 1;
    private final int DATEIN = 2;

    private BufferedReader reader;
    private Group group;
    
    private SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");

    public ReadFilesThread(File file, Group group) throws FileNotFoundException {
        reader = new BufferedReader(new FileReader(file));
        this.group = group;
    }

    @Override
    public void run() {
        try {
            String line = "";
            String row[];

            while ((line = reader.readLine()) != null) {
                row = line.split(";");                
                group.addStudent(new Student(row[LASTNAME], row[NAME], dateFormatter.parse(row[DATEIN]), group));
            }
        } catch (IOException ex) {
            logger.log(Level.SEVERE, "Ошибка при чтении файла.", ex);
        } catch (ParseException ex) {
            logger.log(Level.SEVERE, "Неправильный формат даты", ex);
        } finally {
            try {
                reader.close();
            } catch (IOException ex) {
                logger.log(Level.SEVERE, "Ошибка при закрытии файла", ex);
            }
        }

    }



}
