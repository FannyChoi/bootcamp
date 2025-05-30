import java.text.SimpleDateFormat;

public class DemoUncheckedException {
    public static void main(String[] args) {
        // ! Bug is avoidable by develop
        int[] arr = new int[3]; // 0-2

        // Case 1:
        int index = 2;
        if (index < 0 || index >= arr.length)
            return;
        System.out.println(arr[index]);

        try {
            System.out.println("start to try ...");
            System.out.println(arr[-1]);
            System.out.println("End the try ..."); // ! skipped
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            System.out.println("hello");
        }

        // Case 2
        String s = "hello";
        if (s != null) {
            System.out.println(s.charAt(3)); // l
        }

        // ! Math
        int result = 10 / count;

        // String -> Integer
        String yearInputedByUser = "2025s";
        Integer year = null;
        try {
            year = Integer.valueOf(yearInputedByUser);
            System.out.println(year);
        } catch (NumberFormatException e) {
            System.out.println("The input is not valid.");
        }

        // ! "Unchekced" exception -> Java wont force you to catch during compile time.
        year = Integer.valueOf("abc");

        // ! "Checked" exception
        String input = "2025-05-12";
        SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yyyy");

// Case 1: SimpleDateFormat -> parse() method: checked exception
// ! You have to provide error handling during compile time. Force you to "try"
    }
}
