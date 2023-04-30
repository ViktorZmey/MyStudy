/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.middleofthelinkedlist;
import java.lang.*;

/**
 *
 * @author viktor
 */

enum ResultCases {
    SUCCESS, ERROR
}

class Result {
    final Throwable error;
    ResultCases type;
    
    private Result(ResultCases type, Throwable error) {
        this.type = type;
        this.error = error;
    }
    
    static Result success() {
        return new Result(ResultCases.SUCCESS, defaultError);
    }
    
    static Result error(Throwable error) {
        if (error == null) {
            error = defaultError;
        }
        return new Result(ResultCases.ERROR, error);
    }
    
    private static Throwable defaultError = new Throwable("There are next");
}

public class ListNode {
   final int val;
   ListNode next;

   ListNode(int val) { this(val, null); }
   
   ListNode(int val, ListNode next) { this.val = val; this.next = next; }
   
   ListNode getNext() {
       return next;
   }
   
   Result addNext(ListNode next) {
       if (this.next != null) {
           return Result.error(new Throwable("There are next"));
       }
       this.next = next;
       return Result.success();
   }
}
