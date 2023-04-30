/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.complexnumber;

import java.util.Random;

/**
 *
 * @author viktor
 */
public class ComplexNumberTest {
    
    public static void run() {
        test();
    }
    
    static void test() {
        ComplexNumber a = new ComplexNumber(1, 1);
        ComplexNumber b = new ComplexNumber(1, 1);
        a.getIm();
        System.out.println(a.equals(b));
        System.out.println("a.hashCode():"+a.hashCode()+ " " + a.superHashCode() +" b.hashCode():"+b.hashCode() + " " + b.superHashCode());
    }
    
    public static ComplexNumber makeRandomComplexNumber() {
        Random r = new Random();
        double re = r.nextDouble();
        double im = r.nextDouble();
        return new AdvancedComplexNumber(re, im);
    }
}
