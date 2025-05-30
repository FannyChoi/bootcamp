// ! "extends Exception" -> InvalidPasswordException become "Checked Exception"
public class InvalidPasswordException extends Exception {
//Parent Class Exception by default contain "message" attribute
public InvalidPasswordException() {

}

public InvalidPasswordException(String message) {
super(message);
}

  public static int isValidPassword(String password) {
    // length > 8 ->1 
    // length > 8 and contains numbers and english characters -> 2
    // length > 8 and contains numbers and english characters and special char ($#!) ->3
    // loop + ascii code
    if (password == null || password != null && password.length() <= 8) {
      return 1;
    }
    boolean foundNumber = false;
    boolean foundEnglish = false;
    for (char ch : password.toCharArray()) {
      if (foundNumber && foundEnglish) {
        return 2;
      }
      if (ch >= '0' && ch <= '9') {
        foundNumber = true;
      } else if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
        foundEnglish = true;
      }
    }
    return 3;
  }
}
