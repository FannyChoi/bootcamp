import java.util.Scanner;

public class DemoGuessingGame {
    public static void main(String[] args) {
        int bomb = 67;
        int input = -1;
        int min = 1;
        int max = 100;
        Scanner scanner = new Scanner(System.in);
        int round = 0;

        while (input != bomb){
            System.out.println("Please input a number between " + min + "-" + max);
            input = scanner.nextInt();
            // Validate input if it is valid
            // Adjust the range of numbers
            if (input < min || input > max){
                continue;
            }
                if (input > bomb){
                    max = input - 1;
                } else {
                    min = input + 1;
                }
            }
            round++;
        }
        // User A, round 1, lose
        char user;
        if (round % 2 == 1){
            
        }
        System.out.println("Game end. User " + user + " win.");
        scanner.close();
    }
