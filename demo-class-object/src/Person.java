import java.math.BigDecimal;
import java.math.RoundingMode;

public class Person {
  // height weight -> bmi
  // BMI = wKG/hM2
  private double height;
  private double weight;

  // setter
  public void setHeight(double height) {
    this.height = height;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  // getter
  public double getHeight() {
    return this.height;
  }

  public double getWeight() {
    return this.weight;
  }

  // getBMI
  public double getBMI() {
    return BigDecimal.valueOf(this.weight)
        .divide(BigDecimal.valueOf(Math.pow(this.height, 2.0)), 2,
            RoundingMode.HALF_UP)//
        .doubleValue();
  }
  // getWeightStatus
  public String 
  public static void main(String[] args) {

    // create new...
    Person tom = new Person();
    tom.setHeight(1.65);
    tom.setWeight(55);

    Person candy = new Person();
    candy.setHeight(1.88);
    candy.setWeight(64.5);

    System.out.println(tom.getHeight());
    System.out.println(candy.getWeight());
  }
}
