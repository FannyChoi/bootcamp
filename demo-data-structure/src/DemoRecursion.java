public class DemoRecursion {
  // n = 5
  // 1+2+3+4+5
  public static int sum(int n) {
    // Step 1: base case to exit
    if (n <= 1)
      return n;
    // Step 2: pattern to the next round
    return n + sum(n - 1);
  }

  // even number, 10...n
  public static int sum2(int n) {
    if (n <= 10)
      return n;
    return n + sum2(n - 2);
  }

  public static int question(int n) {
    if (n < 10)
      return 0;
    if (n % 2 == 1)
      n--;
    return sum2(n);
  }

  public static void main(String[] args) {
    System.out.println(DemoRecursion.sum(100)); // 5050

    int sum = 0;
    int n = 5;
    for (int i = 1; i <= n; i++) {
      sum += i;
    }
    System.out.println(sum);
  }
}
