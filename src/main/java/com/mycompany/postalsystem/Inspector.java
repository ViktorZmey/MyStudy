/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.postalsystem;
import static com.mycompany.postalsystem.Cosntants.AUSTIN_POWERS;
import static com.mycompany.postalsystem.Cosntants.WEAPONS;
import static com.mycompany.postalsystem.Cosntants.BANNED_SUBSTANCE;

/**
 *
 * @author viktor
 */
public class Inspector implements MailService {
    
    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailPackage){
            Package parcel = ((MailPackage) mail).getContent();
            String content = parcel.getContent();
            if (content.indexOf("stones") > -1){
                throw new StolenPackageException();
            } else if (content.equals(WEAPONS) || content.equals(BANNED_SUBSTANCE)) {
                throw new IllegalPackageException();
            }
        }
        return mail;
    }
}
