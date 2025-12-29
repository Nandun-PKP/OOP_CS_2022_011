package LW_04;
import java.util.*;

public class Q5 {

    public static class Entree{
        // 1. Make arrays static so they can be accessed directly from main (e.g., Q5.Entree.NAMES[x-1])
        public static final String[] NAMES = {"Tofu Burger", "Cajun Chicken", "Buffalo Wings", "Rainbow Fillet"};
        public static final double[] PRICES = {3.49, 4.59, 3.99, 2.99};

        public int REntree(){
            // Use the static array NAMES for printing
            System.out.println("\n--- Entree Menu ---");
            // Loop to print the menu items using the static arrays
            for(int i = 0; i < NAMES.length; i++) {
                // Print item number (i+1), name, and price (formatted to two decimal places)
                System.out.printf("(%d) %-15s $%.2f%n", (i + 1), NAMES[i], PRICES[i]);
            }

            Scanner re = new Scanner(System.in);
            System.out.print("Enter item number:");
            int ren = re.nextInt();
            return ren;
        }
    }

    public static class SideDish{
        // 1. Make arrays static
        public static final String[] NAMES = {"Rice Cracker", "No-Salt Fries", "Zucchini", "Brown Rice"};
        public static final double[] PRICES = {0.79, 0.69, 1.09, 0.59};

        public int RSideDish() {
            // Use the static array NAMES for printing
            System.out.println("\n--- Side Dish Menu ---");
            // Loop to print the menu items using the arrays
            for(int i = 0; i < NAMES.length; i++) {
                System.out.printf("(%d) %-15s $%.2f%n", (i + 1), NAMES[i], PRICES[i]);
            }

            Scanner rs = new Scanner(System.in);
            System.out.print("Enter item number:");
            int rsd = rs.nextInt();
            return rsd;
        }
    }

    public static class Drink{
        // 1. Make arrays static
        public static final String[] NAMES = {"Cafe Mocha", "Cafe Latte", "Espresso", "Oolong Tea"};
        public static final double[] PRICES = {1.99, 1.90, 2.49, 0.99};

        public int RDrink() {
            // Use the static array NAMES for printing
            System.out.println("\n--- Drink Menu ---");
            // Loop to print the menu items using the arrays
            for(int i = 0; i < NAMES.length; i++) {
                System.out.printf("(%d) %-15s $%.2f%n", (i + 1), NAMES[i], PRICES[i]);
            }

            Scanner rd = new Scanner(System.in);
            System.out.print("Enter item number:");
            int rdk = rd.nextInt();
            return rdk;
        }
    }

    public static void main(String[] args) {
        double totalPrice = 0.0;
        int x = 0 , y = 0 , z = 0 ;

        Scanner scanner = new Scanner(System.in);
        System.out.println("--Wecome our hotel MyJava Lo-Fat Burgers--");
        System.out.println("select your choice in our resturent manu");
        Entree entree = new Entree();
        SideDish sidedish = new SideDish();
        Drink drink = new Drink();

        boolean validEntree = false;
        do {
            x = entree.REntree(); // Get input
            switch (x) {
                case 1:
                    totalPrice += 3.49;
                    validEntree = true; // Valid choice, set flag to exit loop
                    break;
                case 2:
                    totalPrice += 4.59;
                    validEntree = true;
                    break;
                case 3:
                    totalPrice += 3.99;
                    validEntree = true;
                    break;
                case 4:
                    totalPrice += 2.99;
                    validEntree = true;
                    break;
                default:
                    System.out.println("Invalid Entree selection (" + x + "). Please enter a number between 1 and 4.");
            }
        } while (!validEntree); // Loop continues if validEntree is false


        // --- 2. Side Dish Loop (Selection and Calculation) ---
        // Loop runs until a valid choice (1-4) is made.
        boolean validSideDish = false;
        do {
            y = sidedish.RSideDish(); // Get input
            switch (y) {
                case 1:
                    totalPrice += 0.79;
                    validSideDish = true;
                    break;
                case 2:
                    totalPrice += 0.69;
                    validSideDish = true;
                    break;
                case 3:
                    totalPrice += 1.09;
                    validSideDish = true;
                    break;
                case 4:
                    totalPrice += 0.59;
                    validSideDish = true;
                    break;
                default:
                    System.out.println("Invalid Side Dish selection (" + y + "). Please enter a number between 1 and 4.");
            }
        } while (!validSideDish);


        // --- 3. Drink Loop (Selection and Calculation) ---
        // Loop runs until a valid choice (1-4) is made.
        boolean validDrink = false;
        do {
            z = drink.RDrink(); // Get input
            switch (z) {
                case 1:
                    totalPrice += 1.99;
                    validDrink = true;
                    break;
                case 2:
                    totalPrice += 1.90;
                    validDrink = true;
                    break;
                case 3:
                    totalPrice += 2.49;
                    validDrink = true;
                    break;
                case 4:
                    totalPrice += 0.99;
                    validDrink = true;
                    break;
                default:
                    System.out.println("Invalid Drink selection (" + z + "). Please enter a number between 1 and 4.");
            }
        } while (!validDrink);

        System.out.println("-------------------------");

        // FIX: The original line caused an error because 'res' was local to REntree().
        //      We now use the static array from the Entree class.
        //      The user input 'x' is 1-based, so we use 'x - 1' to access the 0-based array index.
        System.out.println("Entree: " + Entree.NAMES[x - 1]);
        System.out.println("Side Dish: " + SideDish.NAMES[y - 1]); // Added for completeness
        System.out.println("Drink: " + Drink.NAMES[z - 1]);         // Added for completeness

        System.out.printf("Total Price: $%.2f%n", totalPrice);
    }
}