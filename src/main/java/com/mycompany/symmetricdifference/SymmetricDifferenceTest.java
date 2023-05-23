/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.symmetricdifference;

import java.util.*;

/**
 *
 * @author viktor
 */
public class SymmetricDifferenceTest {
    public static void run() {
        test();        
    }
    
    static void test() {
        Set<String> set1 = new LinkedHashSet<>();
        set1.add("1");
        set1.add("2");
        set1.add("3");
                
        Set<String> set2 = new LinkedHashSet<>();
        set2.add("0");
        set2.add("1");
        set2.add("2");
                
        System.out.println(symmetricDifference(set1, set2));
    }
    
    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> set = new HashSet<>();
        set.addAll(set1);
        set.addAll(set2);
        
        Iterator<T> value = set.iterator();
        while (value.hasNext()) {            
            T values = value.next();
            if (set1.contains(values) && set2.contains(values)) {
                value.remove();                
            }            
        }                      
        return set;
    }
}

