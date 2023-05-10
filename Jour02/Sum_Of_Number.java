package Jour02;

import java.util.Scanner;

public class Sum_Of_Number {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Entrez un nombre :");
    String num = sc.nextLine();
    int sum = 0;
    for (int i = 0; i < num.length(); i++){
      sum += Character.getNumericValue(num.charAt(i));
    }
    System.out.println(sum);
  }
}
