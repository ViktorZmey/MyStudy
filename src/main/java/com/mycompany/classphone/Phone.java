/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classphone;

/**
 *
 * @author viktor
 */
public class Phone {
    private int number;
    private String model;
    private int weight;
    
    
    public Phone() {
        this(0, "", 0);
    }
    
    public Phone(int numberPhone, String modelPhone) {
        this(numberPhone, modelPhone, 0);
    }
    
    public Phone(int numberPhone, String modelPhone, int weightPhone) {
        number = numberPhone;
        model = (modelPhone != null) ? modelPhone : "";
        weight = weightPhone;
    }
  
    public int getNumber() {
        return number;
    }
    
    public String getModel() {
        return model;
    }
    
    public int getWeight() {
        return weight;
    }
    
    public void setNumber(int number) {
        this.number = number;
    }  
    
    void receiveCall(String name) {
        System.out.println("Имя звонящего: " + name);
    }
    
    void receiveCall(String name, int number) {
        System.out.println("Имя звонящего: " + name + ", " + "номер " + number);
    }
       
    void sendMessage(int ... numberSms) {
        System.out.println("Номера на которые отправится смс: ");
        for (int i = 0; i < numberSms.length; i++) {
            System.out.println(numberSms[i]);
        }
    }
    
}
