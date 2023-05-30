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
    
    private static File initialFile = new File("./src/main/java/com/mycompany/themostfrequentlyoccurringwords/test.txt");
    
    public static void run() {
        test();
        System.out.println("");
        test1();
    }
    
    static void test() {
        try {
            var fileStream = new FileInputStream(initialFile);
            Scanner sc = new Scanner(fileStream);
            List<String> list = new ArrayList<>();
            sc.forEachRemaining(list::add);
            sc.close();
            printToSystemOutMostFrequentlyOccurringWords(list);
        } catch (Exception ex) { }
    }
    
    private static void test1() {
        try {
            // чтение построчно
            var fileStream = new FileInputStream(initialFile);
            var inputStreamReader = new InputStreamReader(fileStream);
            BufferedReader br = new BufferedReader(inputStreamReader);
            var list = br.lines().toList();
            printToSystemOutMostFrequentlyOccurringWords(list);
        }
        catch(Exception ex){ } 
    }
    
    private static void printToSystemOutMostFrequentlyOccurringWords(List<String> from) {
        Pattern pattern = Pattern.compile("[^\\p{L}\\p{Digit}]+");
        
        from.stream()
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
