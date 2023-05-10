package Jour02;

import java.util.Scanner;


public class Factorial {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Entrez un nombre pour avoir sa factorielle: ");
    
    int number = sc.nextInt();
    int result = number;
    for ( int i = number-1; i > 0; i--){
      result *= i;
  }
  System.out.println("La factorielle de " + number + " est :" + result);
  }
}
