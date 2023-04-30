/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.details;

/**
 *
 * @author viktor
 */
public class Engine {
    private double power;
    private String company;

    public Engine(double power, String company) {
        this.power = power;
        this.company = company;
    }
    
    @Override
    public String toString() {
        return "Engine{" + "power=" + power + ", company=" + company + '}';
    }
}
