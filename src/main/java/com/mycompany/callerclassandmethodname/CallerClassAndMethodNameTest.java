/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.callerclassandmethodname;

/**
 *
 * @author viktor
 */
public class CallerClassAndMethodNameTest {
    
    public static void run() {
        test();
    }
    
    static void test() {
        System.out.println(CallerClassAndMethodName.getCallerClassAndMethodName());
        anotherMethod();
    }
    
    public static void anotherMethod() {
        System.out.println(CallerClassAndMethodName.getCallerClassAndMethodName());
    }
}
