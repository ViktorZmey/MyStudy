/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.logging;

import java.util.Arrays;
import java.util.logging.*;
/**
 *
 * @author viktor
 */
public class ClassTest {
    
//    private static final Logger LOGGER = Logger.getLogger(ClassTest.class.getName());
    
    public static void run() {
//        test();
        configureLogging();
        Logger globalLogger = Logger.getGlobal();
        LogManager logManager = LogManager.getLogManager();
        logManager.getLoggerNames().asIterator().forEachRemaining(name -> {
            Logger logger = logManager.getLogger(name);
            System.out.println(logger.getName() + "; LEVEL : " + logger.getLevel());
            System.out.println(logger.getHandlers());
            for (Handler handler : logger.getHandlers()) {
                System.out.print( " " + handler + ",");
            }
            System.out.println("");
        });
    }
    
//    private static void test() {
//        LOGGER.log(Level.ALL, "Started with arguments: {0}", "test");
//        
//        try {
//            randomFailingAlgorithm();
//        } catch (IllegalStateException e) {
//            
//            System.exit(2);
//        }
//    }
//    
//    private static void randomFailingAlgorithm() {
//        double randomNumber = Math.random();
//        LOGGER.log(Level.FINE, "Generate random number {0}", randomNumber);
//        if (randomNumber < 0.5) {
//            throw new IllegalStateException("Invalid phase of the Moon");
//        }
//    } 
    
    private static void configureLogging() {
        Logger LOGGER_A = Logger.getLogger("org.stepic.java.logging.ClassA");
        LOGGER_A.setLevel(Level.ALL);
        Logger LOGGER_B = Logger.getLogger("org.stepic.java.logging.ClassB");
        LOGGER_B.setLevel(Level.WARNING);
        Logger LOGGER = Logger.getLogger("org.stepic.java");
        LOGGER.setUseParentHandlers(false);
//        LOGGER_A.setUseParentHandlers(false);
//        LOGGER_B.setUseParentHandlers(false);
        Formatter xmlFormatter = new XMLFormatter();
        Handler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.ALL);
        consoleHandler.setFormatter(xmlFormatter);   
//        LOGGER.addHandler(consoleHandler);
//        LOGGER_A.addHandler(consoleHandler);
//        LOGGER_B.addHandler(consoleHandler);
    }
}
