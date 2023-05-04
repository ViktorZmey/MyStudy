/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figures;

import javax.swing.JFrame;

/**
 *
 * @author viktor
 */
public class Drawing extends JFrame {
    
    public Drawing(String name, Shape[] shapes){
        super(name);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(400, 400, 500, 500);
        add(new MyComponent(shapes));
    }
}
