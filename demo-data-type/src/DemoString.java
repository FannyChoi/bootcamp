public class DemoString {
  public static void main(String[] args) {
    char c1 = 'H';
    // String is not a primitive
    String s1 = "Hello";
    String s2 = "100";

    // String + operation
    s2 = s2 + "100";
    System.out.println(s2); // 100100
    System.out.println(s1+s2);
    System.out.println(c1+s2);

    int n1 = 5;
    System.out.println(s2+" "+n1);
    System.out.println(n1+n1);

  }
}
