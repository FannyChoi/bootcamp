import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DemoQueue {
  public static void main(String[] args) {
    // LinkedList -> Deque -> Queue
    Queue<Cat> queue1 = new LinkedList<>();
    queue1.add(new Cat("John"));
    queue1.add(new Cat("Jacky"));
    queue1.add(new Cat("Vincent"));
    System.out.println(queue1.poll()); // John
    System.out.println(queue1);

    Deque<Cat> queue2 = new LinkedList<>();
    queue2.addLast(new Cat("Mary"));
    queue2.addFirst(new Cat("Peter"));
    queue2.addLast(new Cat("Sally"));
    System.out.println(queue2.pollFirst());
    System.err.println(queue2);
    System.err.println(queue2.pollLast());

    Deque<Cat> queue3 = new ArrayDeque<>();
    queue3.add(new Cat("Amy"));
    queue3.add(new Cat("Baby"));
    queue3.add(new Cat("Cathy"));
    queue3.add(new Cat("Daisy"));
    queue3.add(new Cat("Esther"));
    queue3.add(new Cat("Florence"));
    System.out.println(queue3);
    System.out.println(queue3.peek);
    System.out.println(queue3);



    List<Cat> cats = new LinkedList<>();

    Animal a1 = new Cat("John");
    Object o1 = new Cat("Peter");
  }
}