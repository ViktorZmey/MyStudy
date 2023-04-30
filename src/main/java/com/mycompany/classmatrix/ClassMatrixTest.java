/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classmatrix;

/**
 *
 * @author viktor
 */
import java.util.Arrays;

public class ClassMatrixTest {
    
    public static void run()  {
//        test1();
//        test2();
        test3();
    }
    
    static void test1()  {
        double[][] matrix1 = new double[3][];
        double[] firstLine1 =  {0, 1, 3};
        double[] secondLine1 = {4, 5, 6};
        double[] thirdLine1 =  {7, 8, 9};
        matrix1[0] = firstLine1;
        matrix1[1] = secondLine1;
        matrix1[2] = thirdLine1;
        
        double[][] matrix2 = new double[3][];
        double[] firstLine2 =  {0, 1, 3};
        double[] secondLine2 = {4, 5, 6};
        double[] thirdLine2 =  {7, 8, 9};
        matrix2[0] = firstLine2;
        matrix2[1] = secondLine2;
        matrix2[2] = thirdLine2;
        
        Matrix m1 = null;
        Matrix m2 = null;
        Matrix m3 = null;
        Matrix m4 = null;
        
        try {
            m1 = new Matrix(matrix1);
            m2 = new Matrix(matrix2);
            m3 = Matrix.sum(m1, m2);
            m4 = Matrix.multiplicationByANumber(m1, 5);
        } catch(Exception e) {
            System.out.println(e);
            return;
        }
        
        System.out.println(Arrays.deepToString(m3.getMatrix()));
        
    }      
    
    
    static void test2()  { //Успешное произведение не квадратных матриц              
        double[][] matrix1 = {
            new double[]{1, 2, 2},
            new double[]{3, 1, 1}                
        };
        
        double[][] matrix2 = {
            new double[]{4, 2},
            new double[]{3, 1},
            new double[]{1, 5}
        };
        
        Matrix m1 = null;
        Matrix m2 = null;
        Matrix m3 = null;
        
        try {
            m1 = new Matrix(matrix1);
            m2 = new Matrix(matrix2);
            m3 = Matrix.multiplication(m1, m2);            
        } catch(Exception e) {
            System.out.println(e);
            return;
        }
        
        System.out.println(Arrays.deepToString(m3.getMatrix()));
        
        
    } 
    
    static void test3()  {  //Исключение при произведении неквадратных матриц
        
        double[][] matrix1 = {
            new double[]{1, 4, 3},
            new double[]{2, 1, 5},
            new double[]{3, 2, 1}
        };
        
        double[][] matrix2 = {
            new double[]{5, 2, 1},
            new double[]{4, 3, 2},
            new double[]{2, 1, 5}
        };
        
        Matrix m1;
        Matrix m2;
        Matrix m3;
        Matrix m4;
        
        try {
            m1 = new Matrix(matrix1);
            m2 = new Matrix(matrix2);
            m3 = Matrix.multiplication(m1, m2);  
            m4 = Matrix.multiplication(m2, m1);
        } catch(MatrixException MatrixException) {
            System.out.println( MatrixException.getMessage());
            return;
        }
        
        System.out.println(Arrays.deepToString(m3.getMatrix()));
        System.out.println(Arrays.deepToString(m4.getMatrix()));
        
    } 
}
