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
public class CarTest {
    
    public static void run(){
        test();
    }
    
    static void test() {
        Driver driver1Driver = new Driver(20, "Savov Sergey", 2);
        Driver driver2Driver = new Driver(30, "Victor Zmey", 10);        
        Engine engine1 = new Engine(450, "susuki");
        Engine engine2 = new Engine(138, "subaru");
        Lorry bybyshkaLorry = new Lorry("poluprizep", "scania", engine1, driver1Driver, 5000, 12);
        System.out.println(bybyshkaLorry);
        bybyshkaLorry.start();  
        SportCar foric = new SportCar("suv", "subaru", engine2, driver2Driver, 1450, 180);
        System.out.println(foric);
        System.out.println(foric._toString());
        foric.turnLeft();
    }
}
