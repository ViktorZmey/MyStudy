/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.postalsystem;

import java.util.logging.*;
import static com.mycompany.postalsystem.Cosntants.AUSTIN_POWERS;

/**
 *
 * @author viktor
 */
public  class Spy implements MailService {
    
    private Logger LOGGER;
    
    public Spy(Logger logger) {
        LOGGER = logger;
    }
    
    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailMessage) {
            var mailMessage = (MailMessage)mail;
            if (mailMessage.getFrom() == AUSTIN_POWERS || mailMessage.getTo() == AUSTIN_POWERS) {
                var msg = String.format(
                    "Detected target mail correspondence: from %s to %s \"%s\"",
                    mailMessage.getFrom(), 
                    mailMessage.getTo(), 
                    mailMessage.getMessage()
                );
                LOGGER.warning(msg);
//                String[] params = {mailMessage.getFrom(), mailMessage.getTo(), mailMessage.getMessage()};
//                LOGGER.log(
//                    Level.WARNING,
//                    "Detected target mail correspondence: from {0} to {1} \"{2}\"",
//                    params
//                );
            } else {
                String[] params = {mailMessage.getFrom(), mailMessage.getTo()};
                LOGGER.log(
                    Level.INFO,
                    "Usual correspondence: from {0} to {1}",
                    params
                );
            }
        }
        
        return mail;
    }
}
