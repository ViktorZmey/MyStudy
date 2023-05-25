/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.removingevenpositions;

import java.io.*;
import java.util.*;
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
        
        Scanner sc = new Scanner(targetStream);
        int count = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        while (sc.hasNextInt()){
            if (count % 2 != 0){
                arrayList.add(sc.nextInt());
            }
            else sc.next();
            count++;
        }
        sc.close();
        
        Collections.reverse(arrayList);
//        Integer[] array = arrayList.toArray(new Integer[arrayList.size()]);
//        System.out.println(Arrays.toString(array)); 
        arrayList.forEach(e -> System.out.print(e + " "));
    }
}
