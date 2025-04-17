import java.time.DayOfWeek;
import java.time.LocalDate;

public class DemoDate {
  public static void main(String[] args) {
    // 2025 4 17
    int year = 2025;
    int month = 4;
    int day = 17;

    // for date value, we should not use int variable for storage.
    // because it is hard to perform operation on "date", i.e. comparison? add day?

    LocalDate today = LocalDate.of(2025, 4, 17);
    System.out.println(today);

    LocalDate day2 = today.plusDays(14);
    System.out.println(day2);

    LocalDate day3 = today.plusMonths(2);
    System.out.println(day3);

    LocalDate day4 = today.plusWeeks(52);
    System.out.println(day4);

    // minusDays
    LocalDate day5 = today.minusDays(90);
    System.out.println(day5);

    // isAfter
    if (today.isAfter(LocalDate.of(2025, 4, 16))) {
      System.out.println("today > 2025.4.16");
    }

    if (day5.isBefore(today)) {
      System.out.println("today < 2025.1.17");
    }

    if (today.isEqual(LocalDate.of(2025, 4, 17))) {
      System.out.println("today = 2025.4.17");
    }
    System.out.println(today.isLeapYear());
    System.out.println(LocalDate.of(2100, 1, 1).isLeapYear());
    System.out.println(LocalDate.of(2400, 1, 1).isLeapYear());

    System.out.println(LocalDate.of(2100, 1, 1).plusDays(3));

    DayOfWeek dow = LocalDate.of(2100, 1, 1).getDayOfWeek();
    System.out.println(dow);
    System.out.println(dow.toString());

    System.out.println(LocalDate.now());
  }
}
