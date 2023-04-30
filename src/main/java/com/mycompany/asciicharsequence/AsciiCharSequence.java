/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.asciicharsequence;

import java.lang.*;

/**
 *
 * @author viktor
 */
public class AsciiCharSequence implements CharSequence {
    private byte[] content;

    public AsciiCharSequence(byte[] content) {
        this.content = content;
    }

    @Override
    public int length() {
        return content.length;
    }

    @Override
    public char charAt(int index) {
        return (char)content[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        byte[] result = new byte[end-start];
        for(int i = start; i < end; i++ ){
            result[i-start] = content[i];
        }
        return new AsciiCharSequence(result);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(content.length);
        for(int i = 0; i < content.length; i++){
            result.append((char)content[i]);
        }
        return result.toString();
    }
}