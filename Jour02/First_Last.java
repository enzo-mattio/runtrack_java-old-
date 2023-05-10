package Jour02;

import java.util.Scanner;

public class First_Last {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Entrez un nombre :");
    String num = sc.nextLine();
    for (int i = 0; i < num.length(); i++){
      if (i == 0){
        System.out.println("Le premier chiffre de " + num +" est :"+ num.charAt(i));
      }
      else if( i == num.length()-1){
        System.out.println("Le dernier chiffre de " + num +" est :"+ num.charAt(i)); 
      }
    }
  }
}
