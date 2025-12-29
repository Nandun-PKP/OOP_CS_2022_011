package LW_04;

public class Q6 {
    public static void main(String[] args) {
        int x = 10;
        for(int i = 0;i < 4;i++){
            for (int r = 0 ; r < 10; r++){
                System.out.print(x + " ");
                x = x + 1;
            }
            System.out.println();
        }
    }
}
