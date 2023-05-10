package Jour02;

import java.util.Scanner;

public class Letter_In {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Entrez un numéro de téléphone :");
    String numero = sc.nextLine();
    int number = 0;
    for (int i = 0; i < numero.length(); i++){
      number++;
    }
    System.out.println("Il y a " + number + " chiffre dans ce numéro.");
  }
}
