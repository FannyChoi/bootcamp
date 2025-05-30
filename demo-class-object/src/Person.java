import java.math.BigDecimal;
import java.math.RoundingMode;

public class Person {
  // height weight
  // ! Attributes (Instance Variable)
  // Instance means Object
  private double height;
  private double weight;
  private Name name;

  public Person() {

  }

  // all arugment constructor
  public Person(double height, double weight) {
    this.height = height;
    this.weight = weight;
  }

  // getter
  public double getHeight() {
    return this.height;
  }

  public double getWeight() {
    return this.weight;
  }

  // setter
  public void setHeight(double height) {
    this.height = height;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  // getBMI (weight / height^2)
  public double getBMI() { // presentation
    return BigDecimal.valueOf(this.weight)
        .divide(BigDecimal.valueOf(Math.pow(this.height, 2.0)), 2,
            RoundingMode.HALF_UP)
        .doubleValue();
  }

  // static getBMI
  public static double staticBMI(double Height, double Weight) {
    return BigDecimal.valueOf(Weight)
        .divide(BigDecimal.valueOf(Math.pow(Height, 2.0)), 2,
            RoundingMode.HALF_UP)
        .doubleValue();
  }


  // getWeightStatus (presentation)
  public String getWeightStatus() {
    double bmi = this.getBMI();
    if (bmi < 18.5) {
      return "Underweight"; // "return" -> exit method
    } else if (bmi >= 18.5 && bmi < 25.0) {
      return "Normal";
    } else if (bmi >= 25.0 && bmi < 30.0) {
      return "Overweight";
    }
    return "Obese";
  }

  public static void main(String[] args) {
    Person p1 = new Person();
    System.out.println(p1.getHeight()); // 0.0
    System.out.println(p1.getWeight()); // 0.0

    p1.setHeight(1.76);
    p1.setWeight(79);
    System.out.println(p1.getBMI()); // 24.54
    System.out.println(p1.getWeightStatus()); // Overweight

    Person p2 = new Person(1.76, 76);
    System.out.println(p2.getHeight());
    System.out.println(p2.getWeight());
    System.out.println(p2.getBMI());

    System.out.println(Person.staticBMI(1.55, 60));
  }
}
