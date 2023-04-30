/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Main.textanalyzermain;

import java.util.*;

/**
 *
 * @author viktor
 */
public class NegativeTextAnalyzer1 extends NegativeTextAnalyzer {

    private String[] keywords = {"=|"};
    
    @Override
    protected String[] getKeywords() {
        String[] superKeywords = super.getKeywords();
        String[] result = new String[superKeywords.length + keywords.length];
        for(int i = 0; i < superKeywords.length; i++) {
            result[i] = superKeywords[i];
        }
        for(int i = 0; i < keywords.length; i++) {
            result[i + superKeywords.length] = keywords[i];
        }
        return result;
    }

    
//    @Override
//    protected TextAnalyzerLabel getLabel() {
//        return TextAnalyzerLabel.OK;
//    }
}
