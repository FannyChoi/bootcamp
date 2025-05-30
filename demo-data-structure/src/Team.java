import java.util.LinkedList;

public class Team {
  // array, arrayList
  private LinkedList<Staff> staffs;

  public Team() {
    this.staffs = new LinkedList<>();
  }

  public void add(Staff staff) {
    this.staffs.add(staff);
  }
public int size() {
  return this.staffs.size();
}

  public static void main(String[] args) {
    Team team = new Team();
    team.add(new Staff());
    team.add(new Staff());
    System.out.println(team.size());

    // Difference between ArrayList and LinkedList
    // 1. Underlying Data Structure: ArrayList (array); Linkedlist 9object links object)
    // Array -> Fixed length,
  }
}
