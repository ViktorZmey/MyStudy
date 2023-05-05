/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Internetshop;

import java.util.Arrays;
/**
 *
 * @author viktor
 */
public class Basket {
    Product[] purchasedProducts;

    public Basket(Product[] purchasedProducts) {
        this.purchasedProducts = purchasedProducts;
    }

    public Product[] getPurchasedProducts() {
        return purchasedProducts;
    }

    @Override
    public String toString() {
        return "Basket{" + "purchasedProducts=" + Arrays.toString(purchasedProducts) + '}';
    }  
}
