package LW_04;
import java.util.Scanner;
public class Q4 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("--- Leap Year Checker ---");
            System.out.print("Enter a year (e.g., 2024, 1900): ");

            int year = scanner.nextInt();

            String result;

            if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {

                result = year + " is a **Leap Year**!";
            } else {

                result = year + " is **Not a Leap Year**.";
            }

            System.out.println("\n--- Result ---");
            System.out.println(result);

            scanner.close();
        }
    }

