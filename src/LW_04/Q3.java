package LW_04;
import  java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter power of number");
        int power = scanner.nextInt();
        switch (power){
            case 6 :
                System.out.println("Your enter Million");
                break;
            case 9 :
                System.out.println("Your enter Billion");
                break;
            case 12 :
                System.out.println("Your enter Trillion");
                break;
            case 15 :
                System.out.println("Your enter Quadrillion ");
                break;
            case 18 :
                System.out.println("Your enter Quintillion ");
                break;
            case 21 :
                System.out.println("Your enter Sextillion");
                break;
            case 30 :
                System.out.println("Your enter Nonillion");
                break;
            case 100 :
                System.out.println("Your enter Googol");
                break;
            default:
                System.out.println("Invalid day number");
        }

    }
}
