/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classphone;

/**
 *
 * @author viktor
 */
public class ClassPhoneTests {
    
    public static void run() {
        //test_Phone_receiveCall();
        test_2();
    }
    
    static void test_Phone_receiveCall() {
        // given
//        Phone phone = new Phone(...)
        
        // then - выполнение проверочного сценария
//        phone.receiveCall(...)
        
        // when - проверка, что сценарий отработал корректно
        
    }
    
    static void test_2() {
        Phone motorolaPhone = new Phone( 10,  "fghf",  30);
        Phone iPhone = new Phone( 100,  "dhd",  30);
        Phone samsungPhone = new Phone(1000,  "dhd",  300);
        Phone zvoniljaPhone = new Phone(1000,  "dhd");
        Phone smartPhone = new Phone();
        
        smartPhone.getModel().chars();
        
        System.out.println( motorolaPhone.getNumber() + " " + motorolaPhone.getModel() + " " + motorolaPhone.getWeight());
        System.out.println( iPhone.getNumber() + " " + iPhone.getModel() + " " + iPhone.getWeight());
        System.out.println( samsungPhone.getNumber() + " " + samsungPhone.getModel() + " " + samsungPhone.getWeight());
        motorolaPhone.receiveCall("мама");
        iPhone.receiveCall("Лена");
        System.out.println( zvoniljaPhone.getNumber() + " " + zvoniljaPhone.getModel());
        smartPhone.receiveCall("Маша");
        System.out.println( smartPhone.getNumber() + " " + smartPhone.getModel() + " " + smartPhone.getWeight());
        smartPhone.receiveCall("Маша", 4684846);
        zvoniljaPhone.sendMessage(556496, 48648684, 35383858);
    }
}
