public class Man {
  private static final int FIXED_TURN_DEGREE = 10;
  private int degree;

  public Man() {
    this.degree = 0;
  }
  public String getDirection() { // EAST, SOUTH, NORTH, WEST

  }

  // 0 - 10 -> 350
  // 360 / 350
  public void turnleft() { // 10 degree
this.degree = (this.degree - FIXED_TURN_DEGREE + 360) % 360;
  }

  public void turnRight() { // 10 degree
    this.degree = (this.degree + FIXED_TURN_DEGREE + 360) % 360;
  }

  public static void main(String[] args) {
    Man man = new Man();
    
  }
}
