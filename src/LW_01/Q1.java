package LW_01;


import  java.util.*;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter odd lettetr word:");
        String word = scanner.next();
        int x = (word.length()) / 2;
        char middle = word.charAt(x);
        System.out.println( "\nMiddle letter is:-" +  middle);
    }

}
