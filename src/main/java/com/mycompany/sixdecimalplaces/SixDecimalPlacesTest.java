/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sixdecimalplaces;

import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author viktor
 */
public class SixDecimalPlacesTest {
    public static void run() {
        test1();

    }
    
    static void test1() {        
        Scanner sc = new Scanner(System.in);
        double number = 0;
        double sumdouble = 0.0;
        
        while(sc.hasNext()==true){
            if(sc.hasNextDouble()) {
                number = sc.nextDouble();
                sumdouble += number;
            } else {
                sc.next();
            }        
        }
        sc.close();
        System.out.printf(Locale.UK, "%.6f", sumdouble);
        
    }
    
    
}
