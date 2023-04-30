/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.professions;

/**
 *
 * @author viktor
 */
public class Driver extends Person{
    private int experience;

    public Driver(int age, String fullName, int experience) {
        super(age, fullName);
        this.experience = experience;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Driver{");
        sb.append("experience=").append(experience);
        sb.append('}');
        sb.append(":");
        sb.append(super.toString());
        return sb.toString();
    }
}
