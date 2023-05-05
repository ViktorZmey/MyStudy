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
public class InternetShopTest {
    public static void run() {
        test();
    }
    
    static void test() {
        Product product1 = new Product("icecream", 50.5, 7.2);
        Product product2 = new Product("cake", 100, 8.7);
        Product product3 = new Product("pear", 47.6, 5);
        Product product4 = new Product("bluebell", 30, 6.2);
        Product product5 = new Product("fanta", 100, 9.1);
        Product[] arrProducts1 = {product1, product2};
        Product[] arrProducts2 = {product3, product4, product5};
        Product[] arrProducts3 = {product3, product1, product5}; 
        Product[] arrProducts4 = {product1, product2, product3, product4, product5}; 
        Category category1 = new Category("desserts", arrProducts1);
        Category category2 = new Category("potables", arrProducts2);               
        Basket basket1 = new Basket(arrProducts3);
        Basket basket2 = new Basket(arrProducts4);
        User user1 = new User("Vasi", 15645, basket1);
        User user2 = new User("Vani", 1111, basket2);
        System.out.println(Arrays.toString(category1.getProducts()));
        System.out.println(Arrays.toString(category2.getProducts()));
        System.out.println(user1.getBasket());
        System.out.println(user2.getBasket());
    }
}
