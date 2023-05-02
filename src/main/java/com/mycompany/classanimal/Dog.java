/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classanimal;

/**
 *
 * @author viktor
 */
public abstract class Dog extends Animal{
    
    public Dog(String name) {
        super(name);
    }

    @Override
    public abstract String getDescription();

    @Override
    public abstract void eat();

    @Override
    public abstract void makeNoise();
    
   
}
