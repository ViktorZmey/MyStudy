/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rekursivnyyvyvodchisel;
import java.util.*;

/**
 *
 * @author viktor
 */
public class RecursiveNumberOutput {
    
    public static int [] recursion(int a, int b) {
        if (a == b) {
            return new int[]{a};
        }
        
        int[] nextRecursionResult;
        if (a > b) {
            nextRecursionResult = recursion(a - 1, b);
        } else {
            nextRecursionResult = recursion(a + 1, b);
        }
        
        int[] result = new int[nextRecursionResult.length + 1];
        result[0] = a;
        System.arraycopy(nextRecursionResult, 0, result, 1, nextRecursionResult.length);
        return result;
    }
      
//    public static int[] recursion(int a, int b) {
//        var result = new ArrayList<Integer>();
//        _recursion(a, b, result);
//        return result.stream().mapToInt((element)->element).toArray();
//    }
//    
//    private static void _recursion(int a, int b, List<Integer> toList) {
//        if (a == b) {
//            toList.add(a);
//        } else if (a < b) {
//            toList.add(a);
//            _recursion(a+1, b, toList);
//        } else {
//            _recursion(b, a, toList);
//            Collections.reverse(toList);
//        }
//    }
}
