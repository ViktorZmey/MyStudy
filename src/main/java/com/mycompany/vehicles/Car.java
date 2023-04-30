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
public class Car {   
    protected String carClass;
    protected String marka;
    protected Engine engine;
    protected Driver driver;
    protected double weight;

    public Car(String carClass, String marka, Engine engine, Driver driver, double weight) {
        this.carClass = carClass;
        this.marka = marka;
        this.engine = engine;
        this.driver = driver;
        this.weight = weight;
    }
       
    public void start(){
        System.out.println("Поехали");
    }
    
    public void stop(){
        System.out.println("Останавливаемся");       
    }
    
    public void turnRight(){
        System.out.println("Поворот направо");
    }
    
    public void turnLeft(){
        System.out.println("Поворот налево");        
    }

//    @Override
//    public String toString() {
//        return "Car{" + "\n  carClass=" + carClass + ",\n  marka=" + marka + "\n, engine=" + engine + ",\n  driver=" + driver + ",\n  weight=" + weight + "\n}";
//    }             
}
