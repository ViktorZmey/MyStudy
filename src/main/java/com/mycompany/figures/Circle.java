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

public class Circle extends Shape{

    private int x;
    private int y;
    private int radius;

    public Circle(int x, int y, int radius, Color color) {
        super(color);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getRadius() {
        return radius;
    }

    public Color getColor() {
        return color;
    }
    
    @Override
    public void draw(Graphics g) {
       g.setColor(color);
       g.drawOval(x, y, radius, radius);
    }
}
