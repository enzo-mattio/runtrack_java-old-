package Jour02;

import java.util.Scanner;

public class Age_To_Work {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Entrez votre âge :");
    int year = sc.nextInt();
    if (year>=67){
      System.out.println("Vous êtes a la retraite.");
    }
    else if (year>55){
      System.out.println("Vous allez avoir du mal a trouver du travail.");
    }
    else if(year<16){
      System.out.println("Vous n'avez pas l'âge de travailler.");
    }
    else{
      System.out.println("Vous avez l'âge pour trouver du travail.");
    }
  }
}
