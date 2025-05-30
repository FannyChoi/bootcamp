import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DemoList {
  public static void main(String[] args) {
    List<Bird> birds = new ArrayList<>();

    System.out.println(birds.isEmpty());
    birds.add(new Bird("John", null));

    birds = new LinkedList<>(birds);
    System.out.println(birds);

    // usually we use List as type reference, until you want to use specific methods of the class.
    // List<String> emails = new ArrayList<>();
    // List<String> emails = new LinkedList<>();
  }
}
