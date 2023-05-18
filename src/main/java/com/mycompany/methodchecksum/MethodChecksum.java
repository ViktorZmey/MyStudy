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
public class MethodChecksum {
    public  static void run() {
        test();
    }
    
    static void test() {        
        int result = 0;
        InputStream stream = getStream(new byte[] {0x33, 0x45, 0x01});
        try {
            result = checkSumOfStream(stream);           
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.print(result);        
    }
       
    static InputStream getStream(byte[] data) {
        return new ByteArrayInputStream(data);
    }
    
    static int checkSumOfStream(InputStream inputStream) throws IOException {
        int checkSum = 0;
        for(int byteValue = inputStream.read(); byteValue > -1; byteValue = inputStream.read()) {
            checkSum = Integer.rotateLeft(checkSum,1) ^ byteValue;
        }
        return checkSum;
    }
}
