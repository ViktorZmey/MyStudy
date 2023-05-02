/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.robotconnection;

/**
 *
 * @author viktor
 */
class RobotConnectionMock implements RobotConnection {
    
    int moveRobotToInvokedCount = 0;
    int[] invokedXParameters = new int[100];
    int[] invokedYParameters = new int[100];
    RuntimeException[] moveRobotToRuntimeExceptionStub = new RuntimeException[100];
    
    @Override
    public void moveRobotTo(int x, int y) {
        invokedXParameters[moveRobotToInvokedCount] = x;
        invokedYParameters[moveRobotToInvokedCount] = y;
        moveRobotToInvokedCount++;
        RuntimeException t = moveRobotToRuntimeExceptionStub[moveRobotToInvokedCount - 1];
        if (t != null) {
            throw t;
        }   
    }
    
    int closeInvokedCount = 0;
    
    @Override
    public void close() {
        closeInvokedCount++;
    }
}
