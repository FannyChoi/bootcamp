import java.math.BigDecimal;
import java.math.RoundingMode;

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

    BigDecimal bd9 = BigDecimal.valueOf(10).divide(BigDecimal.valueOf(3), 0, RoundingMode.HALF_DOWN);
    System.out.println("bd9=" + bd9);

    System.out.println(BigDecimal.valueOf(-2).abs()); //2
    System.out.println(BigDecimal.valueOf(2).pow(3)); //8 

    BigDecimal source = BigDecimal.valueOf(2);
    double result = BigDecimal.valueOf(2).doubleValue();
    long reslut2 = BigDecimal.valueOf(2).longValue();
    int result3 = BigDecimal.valueOf(2).intValue(); 
    float result4 = BigDecimal.valueOf(2).floatValue();
    String result5 = source.toString(); // String =toString(); int = intValue()

    System.out.println(source); // still BigDecimal

  }
}
