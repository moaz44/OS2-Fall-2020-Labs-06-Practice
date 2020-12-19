package MatrixMultiplication;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
//start
public class Multiplier {
    
    public static void multiply(double[][] matrix1, double[][] matrix2, double[][] result){
        List threads = new ArrayList<>();
  int rows1 = matrix1.length;
  for (int i = 0; i < rows1; i++) {
   MultiplierTask task ;
   task = new MultiplierTask(result, matrix1, matrix2, i) {};
   Thread thread = new Thread(task);
   thread.start();
   threads.add(thread);
   if (threads.size() % 10 == 0) {
    waitForThreads(threads);
   }
  }
    };
    
    protected static void waitForThreads(List<Thread> threads) {
        threads.forEach((Thread thread) -> {
            try {
                thread.join();
            } catch (InterruptedException e) {
            }
        });
  threads.clear();
 }
    }

