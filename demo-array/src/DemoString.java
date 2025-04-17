public class DemoString {
  public static void main(String[] args) {
    // Week 1: equals(), length(), charAt()
    // Week 2: Other String methods
    // 1. replace()
    System.out.println("bootcamp".replace('o', 'x'));
    System.out.println("bootcamp".replace("oo","lll"));

    // 2. indexOf()
    System.out.println("hello".indexOf('o'));// if not found, it prints out -1

    // 3. concat()
    String s1 = "hello" + "world";//"+" -> slow the perfromance
    System.out.println(s1);
    String s2 = "hello".concat("world");
    System.out.println(s2);

    // 4. lastIndexOf()
    System.out.println("hello".indexOf('l')); //2
    System.out.println("hello".lastIndexOf('l')); //3
    System.out.println("hello world".lastIndexOf('l')); //9

    // 5. isEmpty()
    boolean result = "".isEmpty();
    System.out.println(result); // true
    System.out.println("hello".isEmpty()); // false

    // 6. trim()
    System.out.println(" hello world !!!  ".trim()); //hello world !!!
    System.out.println(" hello world !!!  ".trim().length()); //15

    // Coding style: chain methods
    System.out.println(" hello ".replace('e', 'a').trim().charAt(1));
    //in the end, it is char, cannot change back to string to ask for lenght.
    System.out.println("hello".replace('L', 'x'));//nth changed

    // String methods return different types

    // 7. substring
    // ! end index -1
    System.out.println("hello".substring(1, 3)); // endintndex need to -1
    System.out.println("hello".substring(0)); // no endindex means no ending = till the end

    String unknown = "hell";
    // extract the second & third characters
    // if the string not long enough, extract as much as possible

    //"h" -> "" 0,1
    // "he" -> "e" 1,2
    // "hell" -> "el" 1,3
    // "hello world" -> "el" 1,3
    int startIndex = 1;
    int endIndex = 2;
    if (unknown.length() < 2){
      startIndex = 1;
      endIndex = 0;
    } else if (unknown.length() == 2){
      endIndex = 1;
    }
    System.out.println(unknown.substring(startIndex,endIndex + 1));

    // 8. toLowerCase(), toUpperCase()
    System.out.println("HELLO".toLowerCase());
    System.out.println("heLLo!!!".toLowerCase());
    System.out.println("hello".toUpperCase());
    System.out.println("heLLo!!!".toUpperCase());

    // 9. contains (returns:true/false)
    System.out.println("hello".contains("ll"));
    System.out.println("hello".contains("lll"));

    String name = "Steven";
    if (name.contains("t")){
      System.out.println("Your name contains t character");
    }
    // 10. startsWith(), endsWith()
    System.out.println("hello".startsWith("he"));
    System.out.println("hello".startsWith("helll"));
    System.out.println("hello".endsWith("lo"));
    System.out.println("hello".endsWith("oo"));

    // Check if the String value is Palindromic
    // madam, ada
    String s = "madam"; // true
//first char = last char
// first+1 char = last-1 char
// length?
// is String s Palindromic?
// use :if , for , charAt
    if (s.length() % 2 == 0){
      for (int i = 0; i < s.length(); i++){
        if (s.charAt(i) == s.charAt(s.length() -i -1 ));
      } System.out.println("Palindromic");
    } else 

    System.out.println("s value is Palindromic");

    
  }

  }

