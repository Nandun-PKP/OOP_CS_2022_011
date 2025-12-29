package LW_02;
import  java.util.*;


public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0,max2 = 0;
        int[] num = new int[5];
        for (int i = 0; i<5; i++) {
            System.out.print("Enter your " + i+1 + " number:=");
            num[i] = scanner.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            if (max < num[i]) {
                max = num[i];
            }
        }
        for (int i = 0; i < 5; i++) {
            if (num[i] < max) {
                if(max2 < num[i]){
                max2 = num[i];}
            }
        }
        System.out.println("Second large number is:=" + max2);

    }
}
