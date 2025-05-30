public class Customer { // blueprint
  // class content

  // Attributes
  // private -> by default, this object is not readable
  private String name;
  private String email;
  // ...

  // Setter
  public void setName(String name) {
    this.name = name;
  }
  public void setEmail(String email) {
    this.email = email;
  } 
  // Getter
  public String getName(){
    return this.name;
  }
  public String getEmail(){
    return this.email;
  }

  public static void main(String[] args) { // main method is NOT a must for a class file.


    // ! Create Object (new...)
    Customer john = new Customer();
    john.setName("John Chan");
    john.setEmail("john@gmail.com");

    Customer mary = new Customer();
    mary.setName("Mary Wong");
    mary.setEmail("mary@gmail.com");

    String name = john.getName();
    String email = john.getEmail();
    System.out.println(name);
    System.out.println(email);

    System.out.println(mary.getName());
    System.out.println(mary.getEmail());
  }
}
