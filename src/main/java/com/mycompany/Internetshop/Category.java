/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Internetshop;

/**
 *
 * @author viktor
 */
public class Category {
    private String denomination;
    Product[] produktProducts;

    public Category(String denomination, Product[] poduktProducts) {
        this.denomination = denomination;
        this.produktProducts = poduktProducts;
    }

    public String getDenomination() {
        return denomination;
    }

    public Product[] getPoduktProducts() {
        return produktProducts;
    }
    
    
}
