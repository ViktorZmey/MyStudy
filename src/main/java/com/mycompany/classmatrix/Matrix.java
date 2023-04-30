
package com.mycompany.classmatrix;

/**
 *
 * @author viktor
 */
public class Matrix {

    private int lines;
    private int columns;
    private double[][] matrix;
            
    public Matrix() /*throws MatrixException */ {
        this.lines = 0;
        this.columns = 0;
        this.matrix  = new double[lines][columns];
    }
    
    public Matrix(int lines, int columns, double[] values) throws MatrixException {

        if(lines <= 0 || columns <= 0) {
            throw new MatrixException("incorrect matrix size");
        }
        
        this.lines = lines;
        this.columns = columns;            
        this.matrix  = new double[lines][columns];
        
        if (lines * columns > values.length) {
           throw new MatrixException("Недостаточно элементов в values"); 
        }
        
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                this.matrix[i][j] = values[i * columns + j];    
            }
        }
    }

    public Matrix(double[][] matrix) throws MatrixException {
        if (matrix.length == 0 || matrix[0].length == 0) {
            this.lines = 0;
            this.columns = 0;
            this.matrix = new double[0][0];
            return;
        }
        
        this.lines = matrix.length;
        this.columns = matrix[0].length;
        
        for (int i = 1; i < lines; i++) {   
            if (matrix[i].length != columns) {
                throw new MatrixException("Different number of elements in rows"); 
            }
        }
        
        this.matrix = new double[lines][columns];
        for (int i = 0; i < lines; i++) {
            System.arraycopy(matrix[i], 0, this.matrix[i], 0, columns);
        }
    }

    public double[][] getMatrix()  {
        var newMatrix = new double[lines][columns];
        for (int i = 0; i < lines; i++) {
            System.arraycopy(this.matrix[i], 0, newMatrix[i], 0, columns);
        }
        return newMatrix;
    }

    public int getLines() {
        return lines;
    }

    public int getColumns() {
        return columns;
    }
    
    void changeValueAt(int i, int j, double newValue) {
        matrix[i][j] = newValue;
    }
    
    public static Matrix sum(Matrix matrix1, Matrix matrix2) throws MatrixException {

        if ((matrix1.lines != matrix2.lines) || (matrix2.columns!= matrix2.columns)) {
            throw new MatrixException("Size does not match");
        }
        
        double[][] resultMatrix = new double[matrix1.lines][matrix1.columns];
        for(int i = 0; i < matrix1.lines; i++) {
            for(int j = 0; j < matrix1.columns; j++) {
                resultMatrix[i][j] = matrix1.matrix[i][j] + matrix2.matrix[i][j];
            }
        }
        
        return new Matrix(resultMatrix);
    }
    
    
    public static Matrix multiplicationByANumber(Matrix matrix1, double number) throws MatrixException {

        double[][] resultMatrix = new double[matrix1.lines][matrix1.columns];
        for(int i = 0; i < matrix1.lines; i++) {
            for(int j = 0; j < matrix1.columns; j++) {
                resultMatrix[i][j] = matrix1.matrix[i][j] * number;
            }
        }
        
        return new Matrix(resultMatrix);
    }
    
    public static Matrix multiplication(Matrix matrix1, Matrix matrix2) throws MatrixException {

        if (matrix1.columns != matrix2.lines) {
            throw new MatrixException("Multiplication is impossible");
        }
        
        double[][] resultMatrix = new double[matrix1.lines][matrix2.columns];
        
        for(int i = 0; i < matrix1.lines; i++) {
            for(int j = 0; j < matrix2.columns; j++) {
                for(int k = 0; k < matrix2.lines; k++) {
                    resultMatrix[i][j] += matrix1.matrix[i][k] * matrix2.matrix[k][j];
                }               
            }           
        }
        
        return new Matrix(resultMatrix);
    }
}
