public class Exercise1 {
  public static void main(String[] args) {
    
// equals
    String s1 = "Hello";
    String s2 = "World";
    String s3 = "Hello";
    String s4 = "HelloWorld";
    String s5 = "Hello World!";
    System.out.println(s5.equals(s1+" "+s2+"!"));

// length
    System.out.println(s5.length());
    String tel = "92345678"; // String need to add ""
    System.out.println(tel.length());

    // FF...int telNo = 91234567;
    //FF...System.out.println(telNo.length()); // int is only value, cannot used by tools

  }
}
