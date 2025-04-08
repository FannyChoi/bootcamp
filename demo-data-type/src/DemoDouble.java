public class DemoDouble {
  public static void main(String[] args) {
    int x = 9;

    // Store a number with decimal places
    // Type: double
    double y =9.9;
    System.out.println(y); // 9.9

    // ! We cannot store d.p. into integer variable
    // x = 9.9;

    // Store 99.9 into variable price
    double a = 99.9;
    // Store 3 into variable quantity
    int b = 3;
    // calculate checkout amount
    double amount = a * b;
    System.out.println(amount);

    // ! Problem for "double"

    // ! int / int -> int
    // 10 -> int value
    // 3 -> int value
    // 1. 10 / 3 -> int / int -> int (10 /3 -> 3 )
    // 2. assign result into w (3 -> 3.0)

    // ! double / int -> double
    double score1 = 71;
    double score2 = 82;
    // calculate the average score
    double average = (score1 + score2) / 2;
    System.out.println(average);

    // ! divided by zero
    double abc = 199 / 0;
    System.out.println(abc);

    // 0 / 10 -> 0.0
  }
}
