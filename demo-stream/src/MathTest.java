import java.util.ArrayList;

public class MathTest {
  public static void main(String[] args) {
    MathOperation addition = (x,y) -> x + y;
    System.out.println(addition.operate(7, 10));

    MathOperation subtraction = (x,y) -> x - y;
    System.out.println(subtraction.operate(10, 8));

    MathOperation multiplication = (x,y) -> x * y;
    System.out.println(multiplication.operate(3, 9));

    MathOperation division = (x,y) -> x / y;
    System.out.println(division.operate(15, 3));

    MathOperation pythagorean = (a,b) -> (int) Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    System.out.println(pythagorean.operate(3, 4));

    ArrayList


    // ! for-each
    for (Child child : childs) {
      System.out.println("Child: " + child.getName());
    }
    // ! for-each lambda
    childs.forEach(child -> System.out.println("Child: " + child.getName()));
    }
  }

