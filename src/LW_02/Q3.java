package LW_02;
import  java.util.*;
public class Q3 {
    public static void main(String[] args) {
        int x;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter rows of the pramid");
        int y = scanner.nextInt();
        int z = y;
        int q = 1;

        for(int i = 0;i<y;i++){
            int p = q;
            int w = y - i;
            while(w>0) {
                w = w - 1;
                System.out.print(" ");
            }
            while (0<p){
                System.out.print("*");
              p = p - 1;
            }
            System.out.println();
            q = q +2;

        }
    }
}
