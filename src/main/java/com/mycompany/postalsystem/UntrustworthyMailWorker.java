/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.postalsystem;

/**
 *
 * @author viktor
 */
public class UntrustworthyMailWorker implements MailService {
    
    private final MailService realMailService = new RealMailService();
    private MailService[] mailServices;
    
    public UntrustworthyMailWorker(MailService[] services) {
        mailServices = services;
    }
    
    public MailService getRealMailService(){
        return realMailService;
    }
    
    @Override
    public Sendable processMail(Sendable mail) {
        for(MailService mailService : mailServices) {
            mail = mailService.processMail(mail);
        }
        return realMailService.processMail(mail);
    }
}
