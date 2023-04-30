/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehicles;

import com.mycompany.professions.Driver;
import com.mycompany.details.Engine;

/**
 *
 * @author viktor
 */
public class SportCar extends Car {
    private  double speed;

    public SportCar(String carClass, String marka, Engine engine, Driver driver, double weight, double speed) {
        super(carClass, marka, engine, driver, weight);
        this.speed = speed;
    }
    
    public String _toString() {
        return toString() + " : " + super.toString();
    }

//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        sb.append("SportCar{");
//        sb.append("speed=").append(speed);
//        sb.append('}');
//        sb.append(":");
//        sb.append(super.toString());
//        return sb.toString();
//    }
}
