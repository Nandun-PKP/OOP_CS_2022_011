package LW_02;
import java.util.Scanner;

public class Q5 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int r = 0;
            int q = 0;
            System.out.print("Enter your String:=");
            String input = scanner.nextLine();
            String result = input.replaceAll("[^a-zA-Z0-9]", "");
            String simpleResult = result.toLowerCase();
            int x = result.length();
            int[] num = new int[x];
            char[] charArray = new char[x];

            int y = x;
            while(0<x){
                x = x - 1;
                num[q]  = simpleResult.charAt(x);
                q = q + 1;
            }
            for (int i = 0; i < y; i++) {
                charArray[i] = (char) num[i];
            }
            String finalString = new String(charArray);
            if(simpleResult.equals(finalString)) {
                System.out.println("true");
            } else{
                System.out.println(finalString);
            }
        }
}
