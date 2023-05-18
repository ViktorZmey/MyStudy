/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.convertsthemtoastring;


import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.nio.charset.Charset;

/**
 *
 * @author viktor
 */
public class ConvertsThemToAStringTest {
    public static void run() throws IOException {
        test1();
        test2();
    }
    
    static void test1() throws IOException {
        ByteArrayInputStream inputStream = new ByteArrayInputStream(new byte[]{48, 49, 50, 51});
        String str1 = readAsString(inputStream, Charset.forName("ASCII"));
        System.out.println(str1);
        System.out.println();
    }
    
    static void test2() throws IOException {
        ByteArrayInputStream inputStream = new ByteArrayInputStream(new byte[]{55, 39, 44, 61});
        String str2 = readAsString1(inputStream, Charset.forName("ASCII"));
        System.out.println(str2);
        System.out.println();
        
    }
    
    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        String resulString = null;
        Reader reader = new InputStreamReader(inputStream, charset);
        StringWriter stringWriter = new StringWriter();
        int x = 0;
        
        while ((x = reader.read()) != -1) {            
            stringWriter.write(x);
        }
        resulString = stringWriter.toString();        
        return resulString;
    }
    
    public static String readAsString1(InputStream inputStream, Charset charset) throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        byte[] buffer = new byte[4096];
        int nRead;
        while ((nRead = inputStream.read(buffer)) != -1) {
            out.write(buffer, 0, nRead);
        }
        return new String(out.toByteArray(), charset);
    }       
}
