/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pseudorandomstream;

import java.util.stream.IntStream;

/**
 *
 * @author viktor
 */
public class PseudoRandomStreamTest {
    public static void run() {
        test();
    }
    
    static void test() {
        IntStream intStream = pseudoRandomStream(13);       
        intStream.limit(10).forEach(e -> System.out.print(e + " "));
    }
    
    public static IntStream pseudoRandomStream(int seed) {
        return IntStream.iterate(  seed, n -> ((n * n) / 10) % 1000);
    }   
}
