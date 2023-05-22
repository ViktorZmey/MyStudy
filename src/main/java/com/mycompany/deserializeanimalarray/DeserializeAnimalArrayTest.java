/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deserializeanimalarray;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author viktor
 */
public class DeserializeAnimalArrayTest {

    private static Animal[] animals;
    public static void run()  {
        test();
    }
    
    static void test()  {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream kit = null;      
        try {
            kit = new ObjectOutputStream(byteArrayOutputStream);
        } catch (IOException ex) {
            Logger.getLogger(DeserializeAnimalArrayTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        Integer quantity = 5;
        try {
            kit.writeInt(quantity);
        } catch (IOException ex) {
            Logger.getLogger(DeserializeAnimalArrayTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        Animal animal1 = new Animal("AAA");
        Animal animal2 = new Animal("BBB");
        Animal animal3 = new Animal("CCC");
        Animal animal4 = new Animal("DDD");
        Animal animal5 = new Animal("EEE");
        try {
            kit.writeObject(animal1);
            kit.writeObject(animal2);
            kit.writeObject(animal3);
            kit.writeObject(animal4);
            kit.writeObject(animal5);
        } catch (IOException ex) {
            Logger.getLogger(DeserializeAnimalArrayTest.class.getName()).log(Level.SEVERE, null, ex);
        }
             
        try {
            animals = deserializeAnimalArray(byteArrayOutputStream.toByteArray());
        } catch (IOException ex) {
            Logger.getLogger(DeserializeAnimalArrayTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (Animal animal : animals) {            
            System.out.println(Arrays.toString(animals));
        }
        
    }
    
    public static Animal[] deserializeAnimalArray(byte[] data) throws IOException {
        Animal[] animals = null;
        try (ObjectInputStream newThread = new ObjectInputStream(new ByteArrayInputStream(data))) {
            Integer numAnimalsInteger = newThread.readInt();
            animals = new Animal[numAnimalsInteger];
            for(int i = 0; i < numAnimalsInteger; i++) {
                animals[i] = (Animal) newThread.readObject();
               
            }            
        } catch (EOFException | ClassNotFoundException e) {
            throw new IllegalArgumentException(e);
        } catch(IOException | ClassCastException e) {
            throw new IllegalArgumentException(e);
        }              
    return animals;
    }
}
