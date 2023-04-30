/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.textanalyzer;

/**
 *
 * @author viktor
 */
public class TooLongTextAnalyzer implements TextAnalyzer {
    
    private int maxLength;

    public TooLongTextAnalyzer(int maxLength) {
        this.maxLength = maxLength;
    }

    @Override
    public TextAnalyzerLabel processText(String text) {
        return text.length() > maxLength ? TextAnalyzerLabel.TOO_LONG : TextAnalyzerLabel.OK;
    }
}
