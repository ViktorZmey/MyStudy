/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.Main.textanalyzermain;

import java.util.Arrays;

/**
 *
 * @author viktor
 */
public class TextAnalyzerMain {

    public static void main(String[] args) {
        String[] testStrings = {
            "Ani :(", 
            "Sam win", 
            "Joe kfk ekkv ekwk krkwe",
            "kvk 11"
        };
        
        String[] spamKeywords = {"win"};
        
        TextAnalyzer[] textAnalyzers = {
            new TooLongTextAnalyzer(10),
            new NegativeTextAnalyzer1(),
            new SpamAnalyzer(spamKeywords)
        };
        
        KeywordAnalyzer a = new SpamAnalyzer(spamKeywords);
//        a.foo();
        
        TextAnalyzer textAnalyzer = new CombinedTextAnalyzer(textAnalyzers);
               
        for (String testString : testStrings) {
            TextAnalyzerLabel label = textAnalyzer.processText(testString);
            System.out.println(testString + " " + label);
        }
        
        System.out.println(Arrays.deepToString(testStrings));
    }
}
