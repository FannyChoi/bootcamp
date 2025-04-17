package JavaExercise;

import java.util.Arrays;

public class JavaQuest6 {
  /**
   * Expected output:
   * 0 1 1 2 3 5 8 13 21 ... 
   * 
   */
  public static void main(String[] args) {
    int first = 0, second = 1;
    // for loop to print first 15 numbers in Fibonacci Sequence

      int[] fibo = new int [15];
        for ( int i = 0; i < fibo.length; i++){
          fibo[i] = first;
        int third = first + second;
        first = second;
        second = third;
        }
      System.out.println(Arrays.toString(fibo));

    }
  }
