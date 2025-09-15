package LW_01;
import java.util.Scanner;
public class Q2 {
    public static void  main(String[] args) {
        Scanner wd = new Scanner(System.in);
        System.out.print("first name:");
        String firstname = wd.nextLine();
        System.out.print("second name:");
        String secondname = wd.nextLine();
        System.out.print("last name:");
        String lastname = wd.nextLine();

        System.out.print( lastname + ", " + firstname + " " +secondname.charAt(0) );
    }
}
