package LW_04;
import java.util.Scanner;
public class Q9 {

        public static void main(String[] args) {
            // 1. Initialize Scanner to read input from the console
            Scanner scanner = new Scanner(System.in);

            // 2. Prompt the user for the number of rows (N)
            System.out.println("--- Asterisk Pyramid Generator ---");
            System.out.print("Enter the number of rows for the pyramid: ");

            // Check if the user entered a valid integer
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a whole number.");
                scanner.close();
                return;
            }

            // Read the integer N (number of rows)
            int N = scanner.nextInt();

            // Close the scanner object
            scanner.close();

            // Ensure the number is positive for the pattern to be drawn
            if (N <= 0) {
                System.out.println("The number of rows must be a positive integer.");
                return;
            }

            System.out.println("\n--- Generating " + N + "-Row Pyramid ---\n");

            // 3. OUTER LOOP: Controls the rows of the pyramid (from row 1 up to N)
            for (int i = 1; i <= N; i++) {

                // 4. INNER LOOP 1: Prints the leading SPACES for centering
                // The number of spaces decreases as the row number (i) increases.
                // Formula: N - i spaces
                for (int j = 1; j <= N - i; j++) {
                    System.out.print(" ");
                }

                // 5. INNER LOOP 2: Prints the ASTERISKS
                // The number of asterisks increases as the row number (i) increases.
                // Formula: (2 * i) - 1 asterisks
                for (int k = 1; k <= (2 * i) - 1; k++) {
                    System.out.print("*");
                }

                // 6. Move to the next line after the row is complete
                System.out.println();
            }
        }
    }

