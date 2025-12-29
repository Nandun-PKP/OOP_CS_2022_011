package LW_02;

public class Q1 {
    public static void main(String[] args) {
        int x = 10;
        for(int i = 0;i<4;i++){
            for(int r = 0;r<10;r++){
                System.out.print(x + " ");
                x = x + 1;
            }
            System.out.print("\n");
        }
    }
}
