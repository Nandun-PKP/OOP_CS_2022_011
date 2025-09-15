package LW_01;

import  java.util.Scanner;


public class Q1 {
  public static void    main(String[] args){
      Scanner wd = new Scanner(System.in);
      System.out.print("enter word:");
      String word = wd.nextLine();
      int length = word.length();
      char letter =  word.charAt(length/2 + 1);
      System.out.println(letter);
  }
}
