import java.util.Scanner;

public class ExceptionExercise4 {

  // Follow the instructions below to complete the User Registration Process.
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter username: ");
    String username = scanner.nextLine();

    System.out.println("Enter password: ");
    String password = scanner.nextLine();

    System.out.println("Enter email: ");
    String email = scanner.nextLine();
    scanner.close();

    // code here...
    // call method registraUser(), handle the exception to print "User Registeration is Fail."
    // or "User Registration is Success."
try {
  registerUser(username, password, email);
  System.out.println("User Registeration is Success.");
} catch (UserRegistrationException e) {
  System.out.println("User Registration is Fail: " + e.getMessage());
}
  }

  public static class UserRegistrationException extends RuntimeException {
    public UserRegistrationException(String message) {
      super(message);
    }
  }

  // Call validaUsername(), validatePassword() and validateEmail()
  // if anyone of the above throw exception, this method registerUser() should throw custom
  // exception UserRegistrationException.
  // otherwise, print "User registered successfully: jackywong", where jackywong is the username.
  public static void registerUser(String username, String password,
      String email) {
    try {
      validateUsername(username);
      validatePassword(password);
      validateEmail(email);
      System.out.println("User registered successfully: "+ username);
    } catch (IllegalArgumentException e) {
      throw new UserRegistrationException(e.getMessage());
    }
  }

  // Throw IllegalArgumentException if String username is null or empty string
  private static void validateUsername(String username) {
    if (username == null || "".equals(username)) {
      throw new IllegalArgumentException("Username validation fail.");
    }
  }

  // Throw IllegalArgumentException
  // if password is null or password length < 8 or it does not contain any special characters of !@$&_
  private static void validatePassword(String password) {
    boolean withSpecialChar = password.contains("!") || password.contains("@") || 
    password.contains("$") || password.contains("&") || password.contains("_");
    if (password.length() < 8 || !withSpecialChar) {
      throw new IllegalArgumentException("Password validation fail.");
    }
  }

  // Throw IllegalArgumentException if String email is null or it does not contain character'@'
  private static void validateEmail(String emali) {
    if (email == null || !email.contains("@")) {
      throw new IllegalArgumentException("Email validation fail.");
    }
  }
}
