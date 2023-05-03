/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figures;

/**
 *
 * @author viktor
 */
public class FiguresTest {


    public static void run() {
        test();
    }
    
    static void test() {
        Shape circlShape = new Circle(50, 50, 50, "red");
        Shape rectShape = new Rectangle(200, 200, 100, 100, "red");
        Shape [] figureShapes = {circlShape, rectShape};
        Drawing dr = new Drawing("Hz");
        dr.setVisible(true);
    }
}
