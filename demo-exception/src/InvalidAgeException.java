// Custom Exception

import java.util.Scanner;

public class InvalidAgeException extends RuntimeException {
  private String code;

  public static void main(String[] args) {
    //InvalidAgeException iae = new InvalidAgeException();

    Scanner scanner = new Scanner(System.in);
    System.out.println("Please input an age number: ");
    int input = scanner.nextInt();

    //capture name, name length cannot be > 10
    System.out.println("Please input a name: ");
    String inputName = scanner.nextLine();

    try {
      int result = calculate(input);
      System.out
          .println("The input is " + input + " and the result is " + result);
    } catch (InvalidAgeException e) {
      System.out.println("Please input again. The value age is invalid.");
    }
  

  try {
    nameCheck(inputName);
    System.out
        .println("The name is " + inputName);
  } catch (NameTooLongException e) {
    System.out.println("Please input again. The name is too long");
  }
}

  

  public static int calculate(int age) {
    if (age < 0) {
      throw new InvalidAgeException();
    }
    return age + 10;
  }

  public static String nameCheck(String name) {
    if (name.length() > 10) {
      throw new NameTooLongException();
    }
    return "Its normal" ;
  }

}
