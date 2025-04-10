public class DemoASCII {
  public static void main(String[] args){
    char x = 'a';
    System.out.println(x);

    // char: 0 - 6XXXX
    // int:2.1b
    int ascii = x;
    System.out.println(ascii);

    // char (Math operation)
    // char - char -> int - int -> int

    // given a-z, convert to 1-26
 //FF   char a = 'a';
//FF    int newA = 98-'a';
//FF    System.out.println(newA);
    char v = 'z';
    int converted = v - 'a' +1;
    System.out.println(converted);

    
  }
}
