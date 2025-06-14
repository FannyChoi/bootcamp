package JavaExercise;

import java.math.BigDecimal;
import java.util.Arrays;

public class LoopExercise {
  public static void main(String[] args) {
    // 1. Print 6 times hello
    // Use: for loop
    String s = "hello";
    for (int i = 0; i < 6; i++) {
      System.out.println(s);
    }

    // 2. Expected output: "0,1,2,3,4"
    // Use: for loop
    int count = 0;
    for (int i = 0; i < 5; i++) {
      System.out.println(count);
      count++;
    }

    // 3. Print even numbers between 2 and 20
    // Use: for loop + if
    for (int i = 0; i <= 20; i++) {
      if (i % 2 == 0 && i > 0) {
        System.out.println(i);
      }
    }

    // 4. Print the numbers, which can be divided by 3 or 5 (1-100)
    // Use: for loop + if
    for (int i = 0; i <= 100; i++) {
      if (i % 3 == 0 || i % 5 == 0) {
        System.out.println(i);
      }
    }

    // 5. Sum up the numbers between 0 and 15 and print it
    // Use: for loop
    int sum = 0;
    for (int i = 0; i <= 15; i++) {
      sum = sum + i;
    }
    System.out.println("Sum up the numbers between 0 and 15 = " + sum);

    // 6. sum up all odd numbers betwen 0 - 10
    // Sum up all even numbers betwen 0 - 10
    // Find the product of evenSum and oddSum
    // Use: for loop + if
    int oddSum10 = 0;
    int evenSum10 = 0;
    for (int i = 0; i <= 10; i++) {
      if (i % 2 == 1) {
        oddSum10 = oddSum10 + i;
      } else {
        evenSum10 = evenSum10 + i;
      }
    }
    System.out.println(evenSum10 * oddSum10);


    // 7. Check if 'd' exists in the string.
    // print "d is found."
    // otherwise, print "d is not found."
    String str7 = "ijkabcpodi";
    boolean found = false;
    for (int i = 0; i < str7.length(); i++) {
      if (str7.charAt(i) == 'd') {
        found = true;
      }
      break;
    }
    if (found = true) {
      System.out.println("d is found");
    } else {
      System.out.println("d is not found");
    }

    // 8. Check if the string s8b is a substring of s8a
    // print "s8b is a substring."
    // otherwise, print "s8b is not a substring."
    // Use: for loop + if + substring method
    String s8a = "abcba";
    String s8b = "cba";
    // 0,3;1-4;2-5
    boolean isSubstring = false;
    for (int i = 0; i < s8b.length(); i++) {
      if (s8b.substring(0).equals(s8a.substring(i, s8b.length() + i))) {
        isSubstring = true;
      }
      break;
    }
    if (isSubstring = true) {
      System.out.println("s8b is a substring.");
    } else {
      System.out.println("s8b is not a substring.");
    }

    // 9. Count the number of char value in the given String s9
    // print "count=2"
    // Use: for loop + if
    String s9 = "pampers";
    char c9 = 'p';
    count = 0;

    for (int i = 0; i < s9.length(); i++) {
      if (s9.charAt(i) == c9) {
        count++;
      }
    }
    System.out.println("count = " + count);

    // 10. Replace all char value 'x' in the given String array by 'k'
    // Print arr10: ["akc", "kkk", "k", "kbk", "mkk"]
    // Use: for loop + replace method
    String[] arr10 = new String[] {"akc", "xxx", "x", "xbx", "mkx"};

    for (int i = 0; i < arr10.length; i++) {
      arr10[i] = arr10[i].replace('x', 'k');
    }
    System.out.println(Arrays.toString(arr10));

    // 11. Count the number of Uppercase char value in the given string s11
    // Print "count uppercase=4"
    // Use: for loop + if
    String s11 = "kLKloOOu";
    int uppercase = 0;

    for (int i = 0; i < s11.length(); i++) {
      if (Character.isUpperCase(s11.charAt(i))) {
        uppercase++;
      }
    }
    System.out.println("uppercase = " + uppercase);


    // 12. Print the following pattern of * value
    // *****
    // *****
    // *****
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j <= 5; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

    // 13. Given a string value s13, each of the char value has its score.
    // Calculate the total score
    // Use: switch + for loop

    // l -> 1 score
    // r -> 3 score
    // d -> 2 score
    // u -> 4 score
    // for other character, -1 score
    String s13 = "lrlaudbucp";
    int score = 0;

    for (int i = 0; i < s13.length(); i++) {
      switch (s13.charAt(i)) {
        case 'l':
          score = score + 1;
          break;
        case 'r':
          score = score + 3;
          break;
        case 'd':
          score = score + 2;
          break;
        case 'u':
          score = score + 4;
          break;
        default:
          score = score - 1;
          break;
      }
    }
    System.out.println("total score = " + score);

    // 14. Assign the long values of 1, 4, 9, -4 to the given array arr14
    long[] arr14 = new long[4];
    arr14[0] = 1;
    arr14[1] = 4;
    arr14[2] = 9;
    arr14[3] = -4;

    // 15. Find the max value and min value in arr14
    // Use One Loop + if
    long max = Long.MIN_VALUE;
    long min = Long.MAX_VALUE;
    for (int i = 0; i < arr14.length; i++) {
      if (arr14[i] > max) {
        max = arr14[i];
      }
      if (arr14[i] < min) {
        min = arr14[i];
      }
    }
    System.out.println("Max value = " + max);
    System.out.println("Min value = " + min);

    // 16. Declare a float value (arr16) array with value 0.2, 0.3, 0.6
    float[] arr16 = {0.2f, 0.3f, 0.6f};

    // 17. Add value 0.1 to each of value in array arr16
    // Print: [0.3, 0.4, 0.7]
    // Use: BigDecimal
    BigDecimal bd1 = new BigDecimal(0.1);
    for (int i = 0; i < arr16.length; i++) {
      arr16[i] = BigDecimal.valueOf(arr16[i]).add(bd1).floatValue();
    }
    System.out.println(Arrays.toString(arr16));

    // 18. Count the number of target strings in the String[]
    String[] arr18 = new String[] {"Steve", "Tommy", "Katie", "Tommy", "Lydia"};
    String target = "Tommy";
    // Print "count name=2"
    int countName = 0;
    for (int i = 0; i < arr18.length; i++) {
      if (arr18[i].equals(target)) {
        countName++;
      }
    }
    System.out.println("count name = " + countName);

    // 19. swap the max digit and min digit
    // Assumption: each digit value appear once in the String
    // Print: "49280"
    String s19 = "40289";
    
    


    // 20. Find the longest String in the String array
    // Print "longest=programming"
    String[] arr20 =
        new String[] {"python", "array", "programming", "java", "bootcamp"};
    String longest = "";
    for (int i = 0; i < arr20.length; i++) {
      if (arr20[i].length() > longest.length()) {
        longest = arr20[i];
      }
    }

    System.out.println(longest);
  }
}
