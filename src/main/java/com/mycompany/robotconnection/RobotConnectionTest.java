/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.robotconnection;

import java.util.*;

/**
 *
 * @author viktor
 */
public class RobotConnectionTest {
    
    public static void run() {
        test1();
        test2();
        test3();
        test4();
        test5();
    }
        
    static void test1() {
        // Given
        RobotConnectionManagerMock robotConnectionManagerMock = new RobotConnectionManagerMock();
        RobotConnectionMock robotConnectionMock = new RobotConnectionMock();
        robotConnectionManagerMock.getConnectionStub = robotConnectionMock;
        
        // When
        moveRobot(robotConnectionManagerMock, 10, 15);
        
        // Then
        if (robotConnectionManagerMock.getConnectionInvokedCount != robotConnectionMock.closeInvokedCount) {
            System.out.println("Соединение с роботом не было закрыто");
            return;
        }
        if (robotConnectionMock.moveRobotToInvokedCount != 1) {
            System.out.println("Больше одного движения");
            return;
        }
        if (robotConnectionMock.invokedXParameters[0] != 10 || robotConnectionMock.invokedYParameters[0] != 15) {
            System.out.println("Произошло изменение параметров");
            return;
        }
    }
    
    static void test2() {
        // Given
        RobotConnectionManagerMock robotConnectionManagerMock = new RobotConnectionManagerMock();
        RuntimeException expectedEception = new RuntimeException("My exeption");
        robotConnectionManagerMock.getConnectionRuntimeExceptionStub[0] = expectedEception;
        
        // When
        try {
            moveRobot(robotConnectionManagerMock, 10, 15);
        } catch(Exception ex) {
            // Then
            if (ex != expectedEception) {
                System.out.println("Проброшено неверное исключение");
                return;
            }
        } finally {
            if (robotConnectionManagerMock.getConnectionInvokedCount != 1) {
                System.out.println("Неверное количество попыток получить соеденение");
                return;
            }
        }
    }
    
    static void test3() {
        // Given
        RobotConnectionManagerMock robotConnectionManagerMock = new RobotConnectionManagerMock();
        RuntimeException expectedEception1 = new RobotConnectionException("My exeption1");
        RuntimeException expectedEception2 = new RobotConnectionException("My exeption1");
        RuntimeException expectedEception3 = new RobotConnectionException("My exeption1");
        robotConnectionManagerMock.getConnectionRuntimeExceptionStub[0] = expectedEception1;
        robotConnectionManagerMock.getConnectionRuntimeExceptionStub[1] = expectedEception2;
        robotConnectionManagerMock.getConnectionRuntimeExceptionStub[2] = expectedEception3;
        
        // When
        try {
            moveRobot(robotConnectionManagerMock, 10, 15);
        } catch(Exception ex) {
            // Then
            if (ex != expectedEception3) {
                System.out.println("Проброшено неверное исключение");
                return;
            }
        } finally {
            if (robotConnectionManagerMock.getConnectionInvokedCount != 3) {
                System.out.println("Неверное количество попыток получить соеденение");
                return;
            }
        }
    }
    
    static void test4() {
        // Given
        RobotConnectionManagerMock robotConnectionManagerMock = new RobotConnectionManagerMock();
        RobotConnectionMock robotConnectionMock = new RobotConnectionMock();
        robotConnectionManagerMock.getConnectionStub = robotConnectionMock;
        RuntimeException expectedEception1 = new RobotConnectionException("My exeption1");
        RuntimeException expectedEception2 = new RobotConnectionException("My exeption1");
        RuntimeException expectedEception3 = new RobotConnectionException("My exeption1");
        robotConnectionMock.moveRobotToRuntimeExceptionStub[0] = expectedEception1;
        robotConnectionMock.moveRobotToRuntimeExceptionStub[1] = expectedEception2;
        robotConnectionMock.moveRobotToRuntimeExceptionStub[2] = expectedEception3;
        
        // When
        try {
            moveRobot(robotConnectionManagerMock, 10, 15);
        } catch(Exception ex) {
            // Then
            if (ex != expectedEception3) {
                System.out.println("Проброшено неверное исключение");
                return;
            }
        } finally {
            if (robotConnectionManagerMock.getConnectionInvokedCount != 3) {
                System.out.println("Неверное количество попыток получить соеденение");
                return;
            }
            if (robotConnectionMock.moveRobotToInvokedCount != 3) {
                System.out.println("Неверное количество попыток движения");
                return;
            }
            if (robotConnectionMock.closeInvokedCount != robotConnectionManagerMock.getConnectionInvokedCount){
                System.out.println("Соединение с роботом не было закрыто");
                return;
            }
        }
    }
           
    static void test5() {       
        // Given
        RobotConnectionManagerMock robotConnectionManagerMock = new RobotConnectionManagerMock();
        RobotConnectionMock robotConnectionMock = new RobotConnectionMock();
        robotConnectionManagerMock.getConnectionStub = robotConnectionMock;
        robotConnectionMock.moveRobotToRuntimeExceptionStub[0] = new RobotConnectionException("My exeption");

        // When
        try {
            moveRobot(robotConnectionManagerMock, 10, 15);
        } catch(Exception ex) {
            // Then
            if (ex != null) {
                System.out.println("Получено исключение, что не верно");
                return;
            }
        } finally {
            if (robotConnectionManagerMock.getConnectionInvokedCount != 2) {
                System.out.println("Неверное количество попыток получить соеденение");
                return;
            }
            if (robotConnectionMock.moveRobotToInvokedCount != 2) {
                System.out.println("Неверное количество попыток движения");
                return;
            }
            if (robotConnectionMock.closeInvokedCount != robotConnectionManagerMock.getConnectionInvokedCount){
                System.out.println("Соединение с роботом не было закрыто");
                return;
            }
        }
    }
    
    static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
        int attemptCount = 3;
        for (int i = 0; i < attemptCount; i++) {
            RobotConnection robotConnection = null;
            try {
                robotConnection = robotConnectionManager.getConnection();
                robotConnection.moveRobotTo(toX, toY);
                return;
            } catch (Exception e) {
                if (e.getClass() != RobotConnectionException.class) {
                    throw e;
                } else if (i == attemptCount - 1 && e.getClass() == RobotConnectionException.class) {
                    throw e;
                } else if (i == attemptCount - 1) {
                    throw new RobotConnectionException("Can't move robot");
                }
            } finally {
                try {
                    robotConnection.close();
                } catch(Exception _e) {
                
                }
            }
        }
    }
}
