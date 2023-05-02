/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.robotconnection;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author viktor
 */

class RobotConnectionManagerMock implements RobotConnectionManager {
    
    RobotConnection getConnectionStub;
    RuntimeException[] getConnectionRuntimeExceptionStub = new RuntimeException[100];
    int getConnectionInvokedCount = 0;
    
    @Override
    public RobotConnection getConnection() {
        getConnectionInvokedCount++;
        RuntimeException t = getConnectionRuntimeExceptionStub[getConnectionInvokedCount - 1];
        if (t != null) {
            throw t;
        }
        return getConnectionStub;
    }
}
