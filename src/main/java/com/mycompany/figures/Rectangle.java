/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figures;

/**
 *
 * @author viktor
 */

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

public class Rectangle extends Shape{

    private int x;
    private int y;
    private int width;
    private int height;

    public Rectangle(int x, int y, int width, int height, String color) {
        super(color);
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    
    
    public  void  draw(){
        return;
    }
    
}
