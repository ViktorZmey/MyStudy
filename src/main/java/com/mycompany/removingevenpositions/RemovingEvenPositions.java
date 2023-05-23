/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.removingevenpositions;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 *
 * @author viktor
 */
public class RemovingEvenPositions {
    public static void run() {
        test();
    }
    
    static void test() {
        File initialFile = new File("./src/main/java/com/mycompany/removingevenpositions/test.txt");                
        InputStream targetStream;
        try {
            targetStream = new FileInputStream(initialFile);
        } catch (Exception ex) {
            return;
        }
    }
}
