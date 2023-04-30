/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classstudentaspirant;

import java.util.Objects;

/**
 *
 * @author viktor
 */
public class Aspirant extends Student {

    private String scientificWork;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String scientificWork) {
        super(firstName, lastName, group, averageMark);
        this.scientificWork=scientificWork;
    }
    
    public String getScientificWork() {
        return scientificWork;
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 43 * hash + Objects.hashCode(this.scientificWork);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Aspirant other = (Aspirant) obj;
        return Objects.equals(this.scientificWork, other.scientificWork);
    }
    
    @Override
    public int getScholarship() {
        if (averageMark == 5) {
            return 2500;           
        } else {
            return 2200;
        }       
    }
}
