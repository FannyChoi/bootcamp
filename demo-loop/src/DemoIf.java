

public class DemoIf {
  public static void main(String[] args) {
    // if, else if, else
    int x = 25;

    if (x < 10) {
      System.out.println(" x < 10");
    } else if (x >= 20) {
      System.out.println("x >= 20");
    } else { // 10-19
    }

    // 2. if

    // 3. if + else

    // 4. if + else if
    String s = "Hello";
    if (s.equals("hello")) {
      System.out.println("this is hello");
    } else if (s.equals("Hello")) {
      System.out.println("this is Hello");
    } else {
    }

    boolean isFemale = true;
    boolean isSmoker = true;
    int age = 80;

    // base premium = 120

    // Female 40 or above, premium 8% more
    // Male 16 or above, premium 3% more
    // Smoker -> 7% more
    // age 70 or above -> 20% more

    // 1. Female 40-69 NS -> 8
    // 2. Female 40-69 S -> 8 + 7
    // 3. Male 16-69 NS -> 3
    // 4. Male 16-69 S -> 3 + 7
    // 5. Female 70up NS -> 8 + 20
    // 6. Female 70up S -> 8+7+20
    // 7. Male 70up NS -> 3 + 20
    // 8. Male 70up S -> 3 + 7 + 20

    // Base premium
    double premium = 120;
    double adjustment = 0;

    if (isFemale) {
      if (age >= 40){
        premium += 0.08;
      } if (age >= 70){
        premium += 0.2;
      } 

      }
    }



  }


}

