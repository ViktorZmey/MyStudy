/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figures;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author viktor
 */
public abstract class Shape {
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }
   
    public abstract void draw(Graphics g);
}
