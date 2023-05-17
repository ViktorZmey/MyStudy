/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.methodchecksum;

import java.io.*;
/**
 *
 * @author viktor
 */
public class CheckSum {
    public static int checkSumOfStream(InputStream inputStream) throws IOException {
    int checkSum = 0;
    int peremennaya = inputStream.read();
    while (peremennaya != -1) {            
        checkSum = Integer.rotateLeft(checkSum,1) ^ peremennaya;
        peremennaya = inputStream.read();
        }
    return checkSum;
    }
}
