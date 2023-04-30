/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.complexnumber;

/**
 *
 * @author viktor
 */
public class ComplexNumber {

    private final double re;
    private final double im;

    ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }
    
    public String description() {
        return String.format("%f + i * %f", re, im);
    }
    
    int superHashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        ComplexNumber that = (ComplexNumber) obj;
        return this.im == that.im && that.re == this.re;
    }
    
    @Override
    public int hashCode() {
        int reint = Double.hashCode(re);
        int imint = Double.hashCode(im);  
        return 31 * reint + imint;
    }
}
