import java.util.Arrays;
import java.util.Random;

public class DemoMath {
  public static void main(String[] args) {
    double result = Math.pow(2.0, 3.0);
    System.out.println(result);

    // square root
    System.out.println(Math.sqrt(81.0));

    // 0-1
    System.out.println(Math.random());

    System.out.println(new Random().nextInt(3));// 0,1,2
    System.out.println(new Random().nextInt(3) + 1); // 1 - 3

    // Generate 6 numbers between 1-49
    int[] marksix = new int[6];
    int count = 0;
    while (count < 6){
      marksix[count] = new Random().nextInt(49) + 1;
      count++;
    }
    System.out.println(Arrays.toString(marksix));


    // Generate 6 different numbers between 1-49
    int[] marksix2 = new int[6];
    int uniqueCount = 0;
    boolean found = false;
    while (uniqueCount < 6) {
      int generateValue = new Random().nextInt(49) + 1;
      // ! Check if generate value is already in the array ->Found
      // code .. for loop + if
      found = false;
      for (int i = 0; i < marksix2.length; i++) {
        if (marksix2[i] == generateValue) {
          found = true;
          break;
        }
      }
      if (!found) {
        marksix2[uniqueCount] = generateValue;
        uniqueCount++;
      }
    }
    System.out.println(Arrays.toString(marksix2));
  }
}
