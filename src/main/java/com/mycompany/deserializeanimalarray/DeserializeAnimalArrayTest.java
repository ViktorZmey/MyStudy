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

    private static Animal[] animals = {
        new Animal("AAA"),
        new Animal("BBB"),
        new Animal("CCC"),
        new Animal("DDD"),
        new Animal("EEE")
    };
    
    private static Logger LOGGER = Logger.getLogger(DeserializeAnimalArrayTest.class.getName());
    
    
    public static void run()  {
        test();
    }
    
    static void test() {   
        try {
            String[] strs = {"a", "b"};
            var deserializeAnimals = deserializeAnimalArray(serialize(strs));
            for (Animal deserializeAnimal : deserializeAnimals) {
                System.out.println(deserializeAnimal);
            }
        } catch (Exception ex) {
            LOGGER.log(Level.SEVERE, null, ex);
        }  
    }
    
    static <T> byte[] serialize(T[] objects) throws Exception {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream); 
        objectOutputStream.writeInt(animals.length);
        for (T obj : objects) {            
            objectOutputStream.writeObject(obj);
        }
        return byteArrayOutputStream.toByteArray();
    }
    
    static Animal[] deserializeAnimalArray(byte[] data) throws Exception {
        ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(data));
        Integer animalsCount = objectInputStream.readInt();
        Animal[] result = new Animal[animalsCount];
        for(int i = 0; i < animalsCount; i++) {
            result[i] = (Animal)objectInputStream.readObject();
        }  
        return result;
    }
}
