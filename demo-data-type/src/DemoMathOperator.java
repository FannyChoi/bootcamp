public class DemoMathOperator {
  public static void main(String[] args) {
    // +1
    int x = 3;
    x = x + 1;
    x += 1;
    x++;
    ++x;
    System.out.println("x=" + x);

    // -1
    int y = 5;
    y = y-1;
    y -= 1;
    y--;
    --y;
    System.out.println("y=" + y);

    // + or - non 1 number
    int z = 10;
    z = z +2;
    z+=2;
    z = z - 3;
    z -= 3;
    System.out.println("z=" + z);

    // * or /
    int a = 6;
    a = a * 2;
    a *= 2;
    // no a**
    a = a / 2;
    a /= 2;
    System.out.println("a=" + a);

    // Count number for even number between 0 - 9(For Loop)
    //for (int i = 0; i < 10; i++){
    int counter = 0;
      for (int i = 0; i < 10; i++){
        if ( i % 2 == 0){
          counter++;
        }
      }
        System.out.println("Number for even number between 0-9=" + counter);
      
        // Larger Number
        int num1 = 100;
        int num2 = 12;

        int max = 0;
        if (num1 > num2) {
          max = num1;
        } else {
          max = num2;
        }
        System.out.println(max);

        // Largest number between 3 numbers
        int num3 = 13;
        if (max > num3) {
          max = num3;
        }
        System.out.println(max);
        } 
       }
    
  
