import java.util.PriorityQueue;
import java.util.Queue;

public class DemoPriorityQueue {
  public static void main(String[] args) {
    Queue<String> q1 = new PriorityQueue<>();
    q1.add("Vincent");
    q1.add("Lucas");
    q1.add("Sally");

    // consume the queue
    while (!q1.isEmpty()) {
      System.out.println(q1.poll()); // ! ordering -> pick up (slow)
    }
    // method :poll()
    // - ordering -> String compareTo()
    // - remove the iobject

    // 3 person -> PQ
    Queue<Person> q2 = new PriorityQueue<>();
    
    
  }
}
