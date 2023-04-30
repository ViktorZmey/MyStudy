/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classperson;

import java.util.Objects;
import java.util.logging.Logger;

/**
 *
 * @author viktor
 */
public class Person {
    private String fullName;
    private Double age;

    public Person() {
    }

    public Person(String fullName, Double age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public Double getAge() {
        return age;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAge(Double age) {
        this.age = age;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.fullName);
        hash = 79 * hash + Objects.hashCode(this.age);
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
        final Person other = (Person) obj;
        if (!Objects.equals(this.fullName, other.fullName)) {
            return false;
        }
        return Objects.equals(this.age, other.age);
    }

    @Override
    public String toString() {
        return "Person{" + "fullName=" + fullName + ", age=" + age + '}';
    }
    
    void move() {
        System.out.println(getFullName() + " is move");
    }
    
    void talk(String speech) {
        System.out.println(getFullName() + " voiced: " + speech);
    }    
}
