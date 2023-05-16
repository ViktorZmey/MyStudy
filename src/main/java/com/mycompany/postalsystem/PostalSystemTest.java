/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.postalsystem;


import static com.mycompany.postalsystem.Cosntants.AUSTIN_POWERS;
import static com.mycompany.postalsystem.Cosntants.WEAPONS;
import static com.mycompany.postalsystem.Cosntants.BANNED_SUBSTANCE;
import java.util.logging.Logger;

/**
 *
 * @author viktor
 */
public class PostalSystemTest {
    
    static Sendable[] testMails = {
        new MailMessage("bbdjb", "zvjto", "xdhh"),
        new MailMessage(AUSTIN_POWERS, "bfdjdj", "bkdk"),
        new MailPackage("dbdbn", "dbndnd", new Package("bdbdb", 60)),
        new MailPackage("bddb", "dbndnd", new Package("bvsvsb", 5)),
        new MailPackage(AUSTIN_POWERS, "dbndnd", new Package(WEAPONS, 9)),
        new MailPackage("fgmgju", "dbndnd", new Package(BANNED_SUBSTANCE, 21)),
        new MailPackage(AUSTIN_POWERS, "dbndnd", new Package("skvskv stones", 7))
    };

    public static void run() {
        System.out.println("Test1");
        test1();
        System.out.println("");
        System.out.println("Test2");
        test2();
    }
    
    static void test1() {
        Spy spy = new Spy(Logger.getGlobal());
        Thief thief = new Thief(100);
        Inspector inspector = new Inspector();
        MailService[] services = {spy, thief, inspector};
        UntrustworthyMailWorker untrustworthyMailWorker = new UntrustworthyMailWorker(services);
        
        for (Sendable mail : testMails) {
            try {
                untrustworthyMailWorker.processMail(mail);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
    
    static void test2() {
        Spy spy = new Spy(Logger.getGlobal());
        Thief thief = new Thief(10);
        Inspector inspector = new Inspector();
        MailService[] services = {spy, thief, inspector};
        UntrustworthyMailWorker untrustworthyMailWorker = new UntrustworthyMailWorker(services);
        
        for (Sendable mail : testMails) {
            try {
                untrustworthyMailWorker.processMail(mail);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}


