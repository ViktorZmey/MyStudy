/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.two;

/**
 *
 * @author viktor
 */
import java.math.*;
import java.util.Arrays;

public class Two {

    public static void run() {
        Robot robot = new Robot(0,0, Direction.DOWN);
        moveRobot(robot, -10, 20);
    }
 
    public static void moveRobot(Robot robot, int toX, int toY) {
        int dx = toX - robot.getX();
        int dy = toY - robot.getY();
        if ( dx > 0 ) {
            if ( robot.getDirection() == Direction.UP ) {
                robot.turnRight();
            } else if ( robot.getDirection() == Direction.DOWN ) {
                robot.turnLeft();
            } else if ( robot.getDirection() == Direction.LEFT ) {
                robot.turnLeft();
                robot.turnLeft();
            } 
            for (; dx > 0; dx--) {
                robot.stepForward();
            }
        } else if ( dx < 0 ) {
            if ( robot.getDirection() == Direction.UP ) {
                robot.turnLeft();
            } else if ( robot.getDirection() == Direction.RIGHT ) {
                robot.turnLeft();
                robot.turnLeft();
            } else if ( robot.getDirection() == Direction.DOWN ) {
                robot.turnRight();
            } 
            for (; dx < 0; dx++) {
                robot.stepForward();
            }           
        }
        
        if ( dy > 0 ) {
            if ( robot.getDirection() == Direction.RIGHT ) {
                robot.turnLeft();
            } else if ( robot.getDirection() == Direction.DOWN ) {
                robot.turnRight();
                robot.turnRight();
            } else if ( robot.getDirection() == Direction.LEFT ) {
                robot.turnRight();
            } 
            for (; dy > 0; dy--) {
                robot.stepForward();
            }  
        } else if ( toY - robot.getY() < 0 ) {
            if ( robot.getDirection() == Direction.UP ) {
                robot.turnRight();
                robot.turnRight();
            } else if ( robot.getDirection() == Direction.RIGHT ) {
                robot.turnRight();
            } else if ( robot.getDirection() == Direction.LEFT ) {
                robot.turnLeft();
            }
            for (; dy < 0; dy++) {
                robot.stepForward();
            } 
        } 
    int n = ( dx > 0 ? dx : -dx ) + ( dy > 0 ? dy : -dy );
    for (int i = 0; i < n; i++) {
        if ( toX - robot.getX() > 0 ) {
            if ( robot.getDirection() == Direction.UP ) {
                robot.turnRight();
            } else if ( robot.getDirection() == Direction.DOWN ) {
                robot.turnLeft();
            } else if ( robot.getDirection() == Direction.LEFT ) {
                robot.turnLeft();
                robot.turnLeft();
            } 
            robot.stepForward();
        } else if ( toX - robot.getX() < 0 ) {
            if ( robot.getDirection() == Direction.UP ) {
                robot.turnLeft();
            } else if ( robot.getDirection() == Direction.RIGHT ) {
                robot.turnLeft();
                robot.turnLeft();
            } else if ( robot.getDirection() == Direction.DOWN ) {
                robot.turnRight();
            } 
            robot.stepForward();             
        } else if ( toY - robot.getY() > 0 ) {
            if ( robot.getDirection() == Direction.RIGHT ) {
                robot.turnLeft();
            } else if ( robot.getDirection() == Direction.DOWN ) {
                robot.turnRight();
                robot.turnRight();
            } else if ( robot.getDirection() == Direction.LEFT ) {
                robot.turnRight();
            } 
            robot.stepForward();
        } else if ( toY - robot.getY() < 0 ) {
            if ( robot.getDirection() == Direction.UP ) {
                robot.turnRight();
                robot.turnRight();
            } else if ( robot.getDirection() == Direction.RIGHT ) {
                robot.turnRight();
            } else if ( robot.getDirection() == Direction.LEFT ) {
                robot.turnLeft();
            }
            robot.stepForward();
        } 
    }
        System.out.printf("Robot: (%d, %d); to: (%d, %d)\n", robot.getX(), robot.getY(), toX, toY);    
    }
}

enum Direction {
    UP,
    DOWN,
    LEFT,
    RIGHT
}

class Robot {
    private int x;
    private int y;
    private Direction dir;

    Robot (int x, int y, Direction dir) {
        this.x = x;
        this.y = y;
        this.dir = dir;
    }

    Direction getDirection() {return dir;}

    int getX() {return x;}

    int getY() {return y;}

    void turnLeft() {
        if      (dir == Direction.UP)    {dir = Direction.LEFT;}
        else if (dir == Direction.DOWN)  {dir = Direction.RIGHT;}
        else if (dir == Direction.LEFT)  {dir = Direction.DOWN;}
        else if (dir == Direction.RIGHT) {dir = Direction.UP;}
    }

    void turnRight() {
        if      (dir == Direction.UP)    {dir = Direction.RIGHT;}
        else if (dir == Direction.DOWN)  {dir = Direction.LEFT;}
        else if (dir == Direction.LEFT)  {dir = Direction.UP;}
        else if (dir == Direction.RIGHT) {dir = Direction.DOWN;}
    }

    void stepForward() {
        if (dir == Direction.UP)    {y++;}
        if (dir == Direction.DOWN)  {y--;}
        if (dir == Direction.LEFT)  {x--;}
        if (dir == Direction.RIGHT) {x++;}
    }
}