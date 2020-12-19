/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MatrixMultiplication;

import java.util.Date;

/**
 *
 * @author AbdallaEssam
 */
//start
public class MainExample {

    public static void main(String[] args) {
        double matrix1[][] = MatrixGenerator.generate(1000, 1000);
        double matrix2[][] = MatrixGenerator.generate(1000, 1000);
        double result[][] = new double[matrix1.length][matrix2[0].length];
        Date start = new Date();
        Multiplier.multiply(matrix1, matrix2, result);
        Date end = new Date();  
        
        System.out.println("Matrix1 : ");
        for(int i=0 ; i<1000 ; i++ ){
        for(int j = 0 ; j<1000 ;j++){
        System.out.print(matrix1[i][j] + " ");
    }
        System.out.println();
}
        System.out.println("Matrix2 : ");
        for(int i=0 ; i<1000 ; i++ ){
        for(int j = 0 ; j<1000 ;j++){
        System.out.print(matrix2[i][j] + " ");
    }
         System.out.println();
}
        System.out.println("Result : ");
        for(int i=0 ; i<1000 ; i++ ){
        for(int j = 0 ; j<1000 ;j++){
        System.out.print(result[i][j] + " ");
    }
        System.out.println();
}

        System.out.printf("Individual Parallel: %d%n", end.getTime() - start.getTime());
    }
}
