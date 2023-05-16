/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.postalsystem;

/**
 *
 * @author viktor
 */
public  class Thief implements MailService { 
    
    private int minPrice = 0;
    private int sumPriceStolen = 0;

    public Thief(int minPrice) {
        this.minPrice = minPrice;
    }

    public int getStolenValue(){
        return sumPriceStolen;
    }
    
    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailPackage){
            Package parcel = ((MailPackage) mail).getContent();
            if (parcel.getPrice() >= minPrice) {
               sumPriceStolen += parcel.getPrice(); 
               mail = new MailPackage(mail.getFrom(), mail.getTo(), new Package("stones instead of " + parcel.getContent(), 0));
            }            
        }              
        return mail;
    }
}
