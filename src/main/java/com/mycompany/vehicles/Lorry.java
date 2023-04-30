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
public class Lorry extends Car{
    private int carrying;

    public Lorry(String carClass, String marka, Engine engine, Driver driver, double weight, int carrying) {
        super(carClass, marka, engine, driver, weight);
        this.carrying = carrying;
    }

//    @Override
//    public String toString() {
//        return "Грузовик{" + "класс авто=" + carClass + ", марка=" + marka + ", двигатель=" + engine + ", водитель=" + driver + ", грузоподьемность=" + carrying + '}';     
//    }

//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        sb.append("Lorry{");
//        sb.append("carrying=").append(carrying);
//        sb.append('}');
//        sb.append(":");
//        sb.append(super.toString());
//        return sb.toString();
//    }
}
