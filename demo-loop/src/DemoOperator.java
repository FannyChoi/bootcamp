public class DemoOperator {
  public static void main(String[] args) {
    

    int y = 8;
    int x = ++y + ++y + 2;
    System.out.println(x);

    y = 8;
    x = y++ + y++ + 2; // when y++ meets + - * /, y++ stay the same, when it is a statement, y++ = y+1
    System.out.println(x);
  }
}
