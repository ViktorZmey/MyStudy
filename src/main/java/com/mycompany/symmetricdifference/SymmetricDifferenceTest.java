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
//        test();
        testPerformance();
    }
    
    static void test() {
        String[] strs1 = {"1", "2", "3"};
        Set<String> set1 = new HashSet<>(Arrays.asList(strs1));
        
        String[] strs2 = {"0", "1", "2"};
        Set<String> set2 = new HashSet<>(Arrays.asList(strs2));
                
        System.out.println(symmetricDifference(set1, set2));
    }
    
    static void testPerformance() {
        int count = 100000;
        var randomIntStreamIterator = (new Random()).ints(0, 10 * count).iterator();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int i = 0; i < count; i++) {
            set1.add(randomIntStreamIterator.next());
            set2.add(randomIntStreamIterator.next());
        }
        
        long start = System.nanoTime();
        symmetricDifference(set1, set2);
        long finish = System.nanoTime();
        long timeElapsed = finish - start;
        System.out.println(timeElapsed / 1000);
    }
    
    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        if (set1.size() > set2.size()) {
            var tmp = set1;
            set1 = set2;
            set2 = tmp;
        }
        var result = new HashSet<T>(set2);
        set1.iterator().forEachRemaining((value) -> {
            if (result.contains(value)) {
                result.remove(value);
            } else {
                result.add(value);
            }
        });
        return result;
        
//        var _set1 = new HashSet<T>(set1);
//        var _set2 = new HashSet<T>(set2);
//        _set1.removeAll(set2);
//        _set2.removeAll(set1);
//        _set1.addAll(_set2);
//        return _set1;
        
//        Set<T> set = new HashSet<>();
//        set.addAll(set1);
//        set.addAll(set2);
//        Iterator<T> iterator = set.iterator();
//        while (iterator.hasNext()) {
//            T value = iterator.next();
//            if (set1.contains(value) && set2.contains(value)) {
//                iterator.remove();        
//            }            
//        }                      
//        return set;
    }
}

