/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Main.textanalyzermain;

/**
 *
 * @author viktor
 */
public class CombinedTextAnalyzer implements TextAnalyzer {
    
    private TextAnalyzer[] textAnalyzers;

    public CombinedTextAnalyzer(TextAnalyzer[] textAnalyzers) {
        this.textAnalyzers = textAnalyzers;
    }

    @Override
    public TextAnalyzerLabel processText(String text) {
        for (TextAnalyzer textAnalyzer : textAnalyzers) {
            TextAnalyzerLabel label = textAnalyzer.processText(text);
            if (label != TextAnalyzerLabel.OK) {
                return label;
            }
        }
        return TextAnalyzerLabel.OK;
    }
}
