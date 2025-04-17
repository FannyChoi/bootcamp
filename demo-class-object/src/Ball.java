public class Ball {
  private String colour;
  private String size;

  // setter
  public void setColour(String colour){
    this.colour = colour;
  }
  public void setSize(String size){
    this.size = size;
  }

  // getter
  public String getColour(){
    return this.colour;
  }
  public String getSize(){
    return this.size;
  }

  // main (create object , set, get)
  Ball a = new Ball();
  a.setColour("White");
  a.setSize("big");

  Ball b = new Ball();
  b.setColour("yellow");
  b.setSize("small");

}

