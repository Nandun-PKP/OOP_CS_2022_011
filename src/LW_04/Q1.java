package LW_04;
import java.util.Scanner;
public class Q1 {
    public static class Maths{

        public void min(int a,int b,int c){
             if(a<b){
                 if(a<c){
                     System.out.println("Min value is:" + a);
                 } else{
                     System.out.println("Min value is:" + c);
                 }
             } else{
                 if(b<c){
                     System.out.println("Min value is:" + b);
                 } else{
                     System.out.println("Min value is:" + c);
                 }
             }
        }
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first value:");
        int x = scanner.nextInt();
        System.out.print("Enter second value:");
        int y = scanner.nextInt();
        System.out.print("Enter third value:");
        int z = scanner.nextInt();
        Maths mi = new Maths();
        mi.min(x,y,z);
    }
    }
}
