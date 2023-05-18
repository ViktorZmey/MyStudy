/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.separatorcharacter;

import java.io.*;

/**
 *
 * @author viktor
 */
public class SeparatorCharacter {
    public static void run() {      
        test1();
        test2();
        test3();
    }
    
    static void test1() {
        byte[] test1 = new byte[] {65, 13, 10, 10, 13};        
        var outputStream = new ByteArrayOutputStream(20);
        var inputStream = new ByteArrayInputStream(test1);
        tryConvert(inputStream, outputStream);
        for (int i : outputStream.toByteArray()) {
            System.out.println(i);
        }
        System.out.println();
    }
    
    static void test2() {
        byte[] test2 = new byte[] {65, 13, 10, 16, 30, 10, 10, 13, 13, 10, 20};        
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream(20);        
        tryConvert(new ByteArrayInputStream(test2), outputStream);
        byte[] out = outputStream.toByteArray();       
        for (int i: out) {
            System.out.println(i);
        }
        System.out.println();
    }
    
    static void test3() {
        byte[] test1 = new byte[] {65, 13, 10, 10, 13, 13, 10};        
        var outputStream = new ByteArrayOutputStream(20);
        var inputStream = new ByteArrayInputStream(test1);
        tryConvert(inputStream, outputStream);
        for (int i : outputStream.toByteArray()) {
            System.out.println(i);
        }
        System.out.println();
    }
    
    static void tryConvert(InputStream inputStream, OutputStream outputStream) {
        try {
            convertOrExeption(inputStream, outputStream);
        } catch (IOException ex) { }
    }
    
    static void convertOrExeption(InputStream inputStream, OutputStream outputStream) throws IOException {
        int tmp1 = inputStream.read();
        
        while (tmp1 != -1) {
            int tmp2 = inputStream.read();
            if (!(tmp1 == 13 && tmp2 == 10)) {
                outputStream.write(tmp1);
            }
            tmp1 = tmp2;
        }
        outputStream.flush();
    }  
}
