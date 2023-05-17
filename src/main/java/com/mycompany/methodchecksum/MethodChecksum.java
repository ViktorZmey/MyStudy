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
    public  static void run() throws IOException {
        test();
    }
    
    public static void test() throws IOException {
        InputStream stream;
        int result;
        stream = getStream( new byte[] { 0x33, 0x45, 0x01});

        result = checkSumOfStream(stream);
        System.out.print(result);
    }
       
    public static InputStream getStream(byte [] data)  {
        return new ByteArrayInputStream (data);
    }
    
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
