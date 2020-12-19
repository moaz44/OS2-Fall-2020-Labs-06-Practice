/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MatrixMultiplication;

/**
 *
 * @author AbdallaEssam
 */
//start
public abstract class MultiplierTask implements Runnable {

    private final double[][] result;
    private final double[][] matrix1;
    private final double[][] matrix2;
    private final int row;

    public MultiplierTask(
            double[][] result,
            double[][] matrix1,
            double[][] matrix2,
            int row
    ) {
        this.result = result;
        this.matrix1 = matrix1;
        this.matrix2 = matrix2;
        this.row = row;
    }
    
    @Override
    public void run() {

  for (int i = 0; i < matrix2[0].length; i++) {
   result[row][i] = 0;
   for (int j = 0; j < matrix1[row].length; j++) {
    result[row][i] += matrix1[row][j] * matrix2[j][i];

   }

  }

 }
}
