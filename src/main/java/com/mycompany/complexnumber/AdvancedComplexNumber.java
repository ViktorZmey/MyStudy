/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.complexnumber;

import java.math.*;

/**
 *
 * @author viktor
 */
public class AdvancedComplexNumber extends ComplexNumber {
    
    public AdvancedComplexNumber(double re, double im) {
        super(re, im);
    }

    @Override
    public String description() {
        double module = Math.sqrt(getIm() * getIm() + getRe() * getRe());
        return super.description() + String.format("; module: %f",  module);
    }
}
