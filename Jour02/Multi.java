package Jour02;

import java.util.Scanner;

public class Multi {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Entrez le nombre dont vous voulez avoir sa table de multiplication : ");
    int i = sc.nextInt();
    System.out.println("Table de " + i);
    for (int j = 1; j <= 10; j++) {
      System.out.println(i + " x " + j + " = " + i * j);
    }
    
  }
}
