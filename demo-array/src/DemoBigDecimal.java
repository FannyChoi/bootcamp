import java.math.BigDecimal;

public class DemoBigDecimal {
  public static void main(String[] args) {
    BigDecimal bd1 = new BigDecimal("1");
    BigDecimal bd2 = BigDecimal.valueOf(0.2);// preferred

    //! add()
    // bd1 + bd2 -> 2.2
    BigDecimal bd3 = bd1.add(bd2);
    System.out.println(bd3);

    // ! subtract()
    BigDecimal bd4 = bd3.subtract(bd1);
    System.out.println(bd4);

    // ! multiply()
    BigDecimal bd5 = bd4.multiply(bd1);
    System.out.println(bd5);

    //! divide()
    BigDecimal bd6 = bd3.divide(bd1);
    System.out.println(bd6);
    // 10/3 ??
    // rounding? 3.45 -> 3.4 (HALF_DOWN)? 3.45 -> 3.5 (HALF_UP)
  }
}
