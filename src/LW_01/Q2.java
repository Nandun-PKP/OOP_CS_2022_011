package LW_01;

import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first name:-");
        String fName = scanner.next();
        System.out.print("Enter your second name:-");
        String mName = scanner.next();
        System.out.print("Enter your third name:-");
        String lName = scanner.next();
        char L = mName.charAt(0);
        char X = Character.toUpperCase(L);
        System.out.print(lName + "," + fName +" " + X );

    }
}
