import java.math.BigDecimal;

public class Circle  {
  private double radius;
  // area (presentation)
  // radius * radius * pi

  // setter
  public void setRadius(double radius){
    this.radius = radius;
  }

  // getter
  public double getRadius(){
    return this.radius;
  }
  public double area(){
    return BigDecimal.valueOf(this.radius).multiply(BigDecimal.valueOf(2))//
    .multiply(BigDecimal.valueOf(Math.PI)).doubleValue();
  }

  public static void main(String[] args) {
    System.out.println(Math.PI); // 3.14159...
    Circle c1 = new Circle();
    c1.setRadius(3.0);
    System.out.println(c1.getRadius());
    System.out.println(c1.area());

  }
}
