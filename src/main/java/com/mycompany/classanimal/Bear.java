/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classanimal;

/**
 *
 * @author viktor
 */
public abstract class Bear extends Animal{
    
    public Bear(String name) {
        super(name);
    }

    @Override
    public abstract void getDescription();

    @Override
    public abstract void eat();

    @Override
    public abstract void makeNoise();
    
    
}
