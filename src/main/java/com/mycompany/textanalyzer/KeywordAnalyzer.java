/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.textanalyzer;

/**
 *
 * @author viktor
 */
public abstract class KeywordAnalyzer implements TextAnalyzer {
    
    protected abstract String[] getKeywords();
    
    protected abstract TextAnalyzerLabel getLabel();
    
//    void foo() {
//        processText("");
//    }
    
    @Override
    public final TextAnalyzerLabel processText(String text) {
        for (String keyword : getKeywords()) {
            if (text.contains(keyword)) {
                return getLabel();
            }
        }
        return TextAnalyzerLabel.OK;
    }
}
