import java.math.BigDecimal;
import java.util.Arrays;

public class DemoForLoop {
  public static void main(String[] args) {
    // array + for loop
    // find max
    int max = Integer.MIN_VALUE;
    int[] arr = new int[] {100, -20, 200, 17};
    for (int i = 0; i < arr.length; i++) {
      if (max < arr[i]) {
        max = arr[i];
      }
    }
    System.out.println("Max =" + max);

    // Approach 2 (Math)
    max = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      max = Math.max(arr[i], max);
    }
    System.out.println(max);

    // convert char to array
    char[] chs = "hello".toCharArray();
    System.out.println(Arrays.toString(chs));

    // convert l to x
    // hello -> hexxo

    char[] chs1 = "hello".toCharArray();
    for (int i = 0; i < chs1.length; i++) {
      if (chs1[i] == 'l') {
        chs1[i] = 'x';
      }
    }
    System.out.println(Arrays.toString(chs1));

    // convert from char[] to String
    System.out.println(String.valueOf(chs));

    System.out.println("hello".replace('l', 'x'));

    // double array
    double[] values = new double[] {0.2, 0.5, 1.9};
    // add 0.1 to each array -> 0.3, 0.6, 2.0
    BigDecimal add = BigDecimal.valueOf(0.1);
    for (int i = 0; i < values.length; i++) {
      values[i] = BigDecimal.valueOf(values[i]).add(add).doubleValue();
    }

    System.out.println(Arrays.toString(values));

    BigDecimal[] bigDecimals = new BigDecimal[3];
    bigDecimals[0] = BigDecimal.valueOf(10.3);
    bigDecimals[1] = BigDecimal.valueOf(2.4);
    bigDecimals[2] = BigDecimal.valueOf(9.9);

    System.out.println(Arrays.toString(bigDecimals));

    float[] fArr = new float[bigDecimals.length];
    // for loop: bigDecials -> fArr
    for (int i = 0; i < bigDecimals.length; i++){
      fArr[i] = bigDecimals[i].floatValue();
    }
  }
}
