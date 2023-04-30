/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.callerclassandmethodname;

/**
 *
 * @author viktor
 */
public class CallerClassAndMethodName {
    
    public static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
    }

    public static String getCallerClassAndMethodName() {
        StackTraceElement[] stackTraceElements = (new Throwable()).getStackTrace();
        
        if (stackTraceElements.length <= 2) {
            return null;
        }
        
        StackTraceElement stackTraceElement = stackTraceElements[2];
        return stackTraceElement.getClassName() + "#" + stackTraceElement.getMethodName();
    }
}
