import java.util.Comparator;

// Comparator = formular
public class SortedByNum implements Comparator<Ball> {

  @Override
  public int compare(Ball b1, Ball b2) {
    return b2.getNum() < b1.getNum() ? -1 : 1;
  }
}