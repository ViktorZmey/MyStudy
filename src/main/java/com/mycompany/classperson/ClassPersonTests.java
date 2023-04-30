/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classperson;

/**
 *
 * @author viktor
 */
public class ClassPersonTests {
    public static void run() {
        test();
    }
    
    static void test() {
        Person person1 = new Person();
        Person person2 = new Person("Dmitrii", 7.5);   
        person1.setFullName("Volodi");
        person1.move();
        person1.talk("kgdkhkhhd");    
        person2.move();
        person2.talk("Молодец");            
    }
    
}
