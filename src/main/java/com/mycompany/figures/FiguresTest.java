/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figures;

import java.awt.Color;

/**
 *
 * @author viktor
 */
public class FiguresTest {


    public static void run() {
        test();
    }
    
    static void test() {
        Shape circleShape = new Circle(50, 50, 50, Color.green);
        Shape rectShape = new Rectangle(200, 200, 100, 100, Color.red);
        Shape [] figureShapes = {circleShape, rectShape};
        Drawing dr = new Drawing("Hz", figureShapes);
        dr.setVisible(true);
    }
}
