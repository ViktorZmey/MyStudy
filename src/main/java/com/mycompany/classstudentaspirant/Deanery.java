/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classstudentaspirant;

/**
 *
 * @author viktor
 */
public class Deanery {
    
    double scholarshipFor(Student student) {
        if (student.getClass() == Aspirant.class) {
            return scholarshipFor((Aspirant) student);
        }
        
        if (student.getAverageMark() == 5){
            return 2000;           
        } else {
            return 1900;
        }   
    }
    
    double scholarshipFor(Aspirant aspirant) {
        if (aspirant.getAverageMark() == 5){
            return 2500;           
        } else {
            return 2200;
        }   
    }
}
