import java.math.BigDecimal;
import java.util.Scanner;

public class ExceptionExercise1 {
  // Question: Write a program that divides two numbers provided by the user. 
  //Handle the ArithmeticException when dividing by zero and display an appropriate message.

  //1. If exception is caught, print "Error:Cannot divide by zero.", otherwise print "Result: X"
  //2. No matter if the exception is caught, finally print "Division operation completed."
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter numerator: ");
    int numerator = scanner.nextInt();
    System.out.println("Enter denominator: ");
    int denominator = scanner.nextInt();
    scanner.close();

    // code here...
    //try, catch
    
  }
}
