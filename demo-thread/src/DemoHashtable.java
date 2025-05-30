import java.util.Hashtable;

public class DemoHashtable {
  private static final Hashtable<String, Integer> nameMap = new Hashtable<>();

  public static void main(String[] args) {
    // Hashtable.put
    nameMap.put("bootcamp", 0);

    Runnable task = () -> {
      for (int i = 0; i < 10000; i++) {
        nameMap.put("bootcamp", nameMap.get("bootcamp") + i );
      }
    };

    Thread worker1 = new Thread(task);
    Thread worker2 = new Thread(task);
    worker1.start();
    worker2.start();

    try {
      worker1.join(); 
      worker2.join(); 
    } catch (InterruptedException e) { 

    }
    System.out.println(nameMap.get("bootcamp"));
  }
}
