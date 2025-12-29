package LW_04;
import java.util.*;

public class Q7 {
    private int x;
    Q7(int x){
        this.x = x;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }

    public int digit(){
        int y = 1;
        int z = 0;
        int tempX = Math.abs(this.x);
        if(tempX>0){
        while(tempX > 0){
            tempX = tempX/10;
            z = z + 1;
        }}
        return z;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number:");
        int x = scanner.nextInt();
        Q7 dig = new Q7(x);
        int digi = dig.digit();
        System.out.println("digit count is " + digi);
    }
}
