/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classanimal;

/**
 *
 * @author viktor
 */
public class AnimalTest {
    
    public static void run() {
        Cat cat = new Cat("Devers") {
            @Override
            public String getDescription() {
                return "dbndnd"; 
            }

            @Override
            public void eat() {
                System.out.println("mouse");
            }

            @Override
            public void makeNoise() {
                System.out.println("Му");
            }
        };
        
        Dog dog = new Dog("Reks") {
            @Override
            public String getDescription() {
                return "ddnwww";
            }

            @Override
            public void eat() {
                 System.out.println("dog food");
            }

            @Override
            public void makeNoise() {
                System.out.println("Gav");
            }
        };
        
        Bear bear = new Bear("Balu") {
            @Override
            public String getDescription() {               
                return " fbhdxhndhjn";
            }

            @Override
            public void eat() {
                 System.out.println("Мeat");
            }

            @Override
            public void makeNoise() {
                System.out.println("RRRrrr");
            }
        };
        
        Animal[] animals = {cat, dog, bear};
        
        for (Animal animal : animals) {
            animal.makeNoise();
            animal.eat();
        }
        
        for (Animal animal : animals) {
            Vet.treatAnimal(animal);
        }
    }
}
