public class DemoPrimitive {
  public static void main(String[] args) {
    // ! Primitives (int, double, long, short, byte, float, boolean, char)
    // 8 primitives in total for Java

    // Primitives for Interger (byte, short, int, long)
    int x = 10;

    //  range from -128 to 127
    byte b1 = 10;
    byte b2 = -128;
    byte b3 = 127;

    // short - range from -32768 to 32767
    short s1= 32766;
    System.out.println(s1);

    // int (2.1b)
    int x1 = 1_000_000;
    int x2 = 2147483647;
    int x3 = 2147483647;
    System.out.println(x1);

    // long 
    // ! -2147483649 is a illegal int value, normally number is "int", it is not int.
    // ! add a "L" in the end, make the java realize it as "long"
    long l1 = 10;
    long l2 = 200;
    long l3 = 2147483649L;
    System.out.println(l3);

    // long + int ->long 
    l1 = l1 + 100;
    System.out.println(l1);

    x3 = x3 +1;
    System.out.println(x3);

    // b2 = b2 +1;
    System.out.println(b2);
    // 1. byte + int > int
    // 2. assign int to byte variable (maybe overflow)


    // double, float
    // ! 9.5 is a double value
    // ! 9.5d is a double value
    // ! 9.5f is a float value
    double d1 = 9.5;
    double d2 = 9.5d;
    float f1 = 9.5f;

    // ! double is more precise than float.
    // float f2 = 9.5;

    float f2 = 0.3f - 0.1f;
    System.out.println(f2); // 0.20000002

    // boolean
    boolean b10 = true;
    b10 = false;

    int age = 66;
    boolean isEldery = age > 65;
    System.out.println(isEldery); // true

    // char
    // Store single character
    char c1 = 'a';
    char c2 = 'b';
    
    System.out.println(c1);
  }
}
