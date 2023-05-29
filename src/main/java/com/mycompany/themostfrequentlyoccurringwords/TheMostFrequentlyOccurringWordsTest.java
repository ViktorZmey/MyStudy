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
        
        Pattern pattern = Pattern.compile("\\P{L}+");
        
        var outputStream = list.stream()
            .map(String::toLowerCase)
            .map(pattern::split)
            .flatMap(Arrays::stream)
            .collect(Collectors.groupingBy((e)->e, Collectors.reducing(0, (e) -> 1, Integer::sum)))
//            .reduce(
//                new HashMap<String, Integer>(),
//                (map, word) -> { 
//                    Integer count = map.getOrDefault(word, 0);
//                    map.put(word, count + 1);
//                    return map;
//                },
//                (lhs, rhs) -> {
//                    rhs.forEach((key,value) -> lhs.merge(key, value, Integer::sum));
//                    return lhs;
//                }
//            )
            .entrySet()
            .stream()
            .sorted(
                Comparator
                .comparing(Map.Entry<String,Integer>::getValue, Comparator.reverseOrder())
                .thenComparing(Comparator.comparing(Map.Entry<String,Integer>::getKey))
            )
//            .sorted(Comparator.comparing(Map.Entry<String,Integer>::getKey))
//            .sorted(Comparator.comparing(Map.Entry<String,Integer>::getValue, Comparator.reverseOrder()))
//            .sorted((lhs, rhs) -> {
//                if (lhs.getValue() == rhs.getValue()) {
//                    return lhs.getKey().compareTo(rhs.getKey());
//                } else {
//                    return rhs.getValue() - lhs.getValue();
//                }
//            })
            .limit(10);
        
        outputStream.forEach((entry) -> {
            System.err.println(entry.getKey() + ": " + entry.getValue());
        });
    }
}
