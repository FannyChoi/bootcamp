package JavaExercise;
public class JavaQuest4 {
  /**
   * Exercise: Print 10 numbers: they must be even and > 0, and divisible by 3
   * and divisible by 2 (Search it from 1)
   * 
   * Expected Output: 6 12 18 24 30 36 42 48 54 60
   */
  public static void main(String[] args) {
    // Print first ten numbers, which fulfill the followings criteria:
    // 1. Even numbers
    // 2. Divisible by 3
    // 3. > 0
    int k = 1;
    int count = 0; 
    
    while (count < 10) {
        if (k > 0 && k % 2 == 0 && k % 3 == 0) {
            System.out.println(k);
            count++; 
        }
        k++;
    }

  }
}