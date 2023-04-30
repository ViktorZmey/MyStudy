/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Main.textanalyzermain;

/**
 *
 * @author viktor
 */
public class SpamAnalyzer extends KeywordAnalyzer  {
    
    private String[] keywords;

    public SpamAnalyzer(String[] keywords) {
        this.keywords = keywords;
    }

    @Override
    protected String[] getKeywords() {
        return keywords;
    }

    @Override
    protected TextAnalyzerLabel getLabel() {
        return TextAnalyzerLabel.SPAM;
    }
}
