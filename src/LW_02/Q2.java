package LW_02;
import java.util.*;
public class Q2 {
    int x;
    public Q2(int x){
        this.x = x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }
    public int Digit(){
        int z = 0  ;
        while (x>=1){
            x = x / 10;
            z = z +1;
        }
        return z;
    }

    public static void main(String[] args) {
        int x = 0,z;

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your number: ");
            if(scanner.hasNextInt()){

            x = scanner.nextInt();

            Q2 digit = new Q2(x);
            z = digit.Digit();

            System.out.println("digit count is:- " + z);
           if(z<0){
                break;
            }
            }else {
                // Then break the loop as requested by your original structure.
                break;
            }
        }

    }
}
