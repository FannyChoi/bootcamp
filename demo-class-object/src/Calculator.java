public class Calculator {
  
  // ! Static method (input -> output)
  public static int sum (int x, int y){
    // int + int -> int 
    return x + y;
  }

  public static void print(String str){
    System.out.println("The String is " + str);
  }

  public static void main(String[] args) {
    // Static method
    int result = Calculator.sum(1, 2);
    System.out.println(result);

    Calculator.print("hello");
  }
}

