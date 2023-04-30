/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.textanalyzer;

/**
 *
 * @author viktor
 */
public interface TextAnalyzer {
//    public TextAnalyzerLabel processText(String text);
    
    public default TextAnalyzerLabel processText(String text) {
        return TextAnalyzerLabel.OK;
    }     
}
