/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classstudentaspirant;

/**
 *
 * @author viktor
 */
public class StudentAndAspirantTest {
      
    public static void run() {
        test();
    }
    
    static  void test(){
        Student  a = new Student("ghdshd", "bdcndf", "fist", 4.5);
        Student  a1 = new Student("ghdshd", "bdcndf", "fist", 5);
        Aspirant b = new Aspirant("Ivan", "Rogov", "5", 3, "bnxn dhgh");
        Aspirant b1 = new Aspirant("Vasilii", "Rogov", "5", 5, "bnxn dhgh");
        Deanery deanery = new Deanery();
                
        Student[] students = {a, a1, b, b1};
        for (Student student : students) {
            System.out.println(deanery.scholarshipFor(student));
        }
    }
    
}
