package LW_01;
import java.util.Scanner;
public class Q3 {
    public  static void main(String[] args){
        Scanner wd = new Scanner(System.in);
        System.out.println("enter length:");
        double cm = wd.nextDouble();
        int feet = (int)(cm/30.48);
        int inch = (int)((cm / 2.54) - (feet*12));
        System.out.print("feet:" + feet + " inches" + inch);

    }
}
