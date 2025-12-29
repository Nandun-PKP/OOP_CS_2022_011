package LW_04;
import java.util.*;
public class Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter value:");
        int n = scanner.nextInt();
        int x = 1 ;
    System.out.println("multiplication table");
    while(x <= 10){
        int z = n*x;
        System.out.println( n+ "+" + x + " = " + z);
        x++;
    }
    }
}
