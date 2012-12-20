/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epam.education;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Denis_Sidorov
 */
public class Education {

    private static Logger logger = Logger.getLogger(Group.class.getName());
    
    public static void main(String[] args) {
        try {
            /*SortedSet<Student> students = new TreeSet<Student>();

            students.add(new Student("testov323", "test1", new Date(), 5f));
            students.add(new Student("Petrov", "Vacya2", new Date(), 4.5f));
            students.add(new Student("testov55", "test3", new Date(), 4.5f));
            students.add(new Student("testov444", "test4", new Date(), 3.5f));

            for (Student s : students) {
                System.out.println(s.getName() + " " + s.getAvgMark());
            }*/


            File file1 = new File(System.getProperty("user.dir") + "\\group1.cvs");
            Group group1 = new Group("gr1");
            ReadFilesThread getGroup1 = new ReadFilesThread(file1, group1);
            getGroup1.start();
            
            File file2 = new File(System.getProperty("user.dir") + "\\group2.cvs");
            Group group2 = new Group("gr2");
            ReadFilesThread getGroup2 = new ReadFilesThread(file2, group2);
            getGroup2.start();


            getGroup1.join();
            getGroup2.join();

            File serializedFile1 = new File(System.getProperty("user.dir") + "\\serialized1.txt");
            File serializedFile2 = new File(System.getProperty("user.dir") + "\\serialized2.txt");
            SerializeService<Journal> serializer = new SerializeService<Journal>();

            Journal journal = group2.getJournal();

            serializer.save(journal, serializedFile1);
            //serializer.save(group2, serializedFile2);

            Journal journal2 = serializer.load(serializedFile1);

            System.out.println(journal2.getGroup().getName());

            //Group group3 = serializer.getGroup(serializedFile2);

            /*SortedSet<Student> students = group3.getStudents();
            System.out.println(group3.getName());
            for (Student student : students) {
                System.out.println(student.getName() + " " + student.getLastName());
            }*/

            /*students = group2.getStudents();
            System.out.println(group2.getName());
            for (Student student : students) {
                System.out.println(student.getName() + " " + student.getLastName());
            }*/
            
            System.out.println(">>>>>>>>>>>>>>>hello world<<<<<<<<<<<<<<<<<");
        } catch (InterruptedException ex) {
            logger.log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            logger.log(Level.SEVERE, "Файл не найден", ex);
        } catch (IOException ex) {
            logger.log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            logger.log(Level.SEVERE, null, ex);
        }


    }
}
