/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.robotconnection;

/**
 *
 * @author viktor
 */
 public class RobotConnectionException extends RuntimeException {
    
    public RobotConnectionException(String message){
        super(message);
    }
    
    public RobotConnectionException(String message, Throwable caues){
        super(message, caues);
    }
 }