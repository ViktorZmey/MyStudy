/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.themostfrequentlyoccurringwords;

import java.io.*;
import java.util.*;
import java.util.regex.*;
import java.util.stream.*;

/**
 *
 * @author viktor
 */
public class TheMostFrequentlyOccurringWordsTest {
    public static void run() {
        test();
    }
    
    static void test() {
        
//        try(BufferedReader br = new BufferedReader (new InputStreamReader(System.in)); 
//                BufferedWriter bw = new BufferedWriter(new FileWriter("notes5.txt")))
//        {
//           // чтение построчно
//            String text;
//            while(!(text=br.readLine()).equals("ESC")){
//                  
//                bw.write(text + "\n");
//                bw.flush();
//            }
//        }
//        catch(IOException ex){
//              
//            System.out.println(ex.getMessage());
//        } 
        

        File initialFile = new File("./src/main/java/com/mycompany/themostfrequentlyoccurringwords/test.txt");                
        InputStream targetStream;
        try {
            targetStream = new FileInputStream(initialFile);
        } catch (Exception ex) {
            return;
        }
        
        Scanner sc = new Scanner(targetStream);
        List<String> list = new ArrayList<>();
        sc.forEachRemaining(list::add);
        sc.close();
        
        Pattern pattern = Pattern.compile("[^\\p{L}\\p{Digit}]+");
        
        list.stream()
            .map(String::toLowerCase)
            .map(pattern::split)
            .flatMap(Arrays::stream)
            .collect(Collectors.groupingBy((e)->e, Collectors.reducing(0, (e) -> 1, Integer::sum)))
            .entrySet()
            .stream()
            .sorted(
                Comparator
                .comparing(Map.Entry<String,Integer>::getValue, Comparator.reverseOrder())
                .thenComparing(Comparator.comparing(Map.Entry<String,Integer>::getKey))
            )
            .limit(10)
            .forEach((entry) -> {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            });
    }
}
