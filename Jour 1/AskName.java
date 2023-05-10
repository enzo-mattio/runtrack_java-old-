/*Écrire un programme qui demande à l’utilisateur son nom et prénom, chaque valeur doit
être stockée dans une variable de types string.
Afficher dans le terminal le prénom et nom de l’utilisateur en concaténant les deux
variables. */

import java.util.Scanner;

public class AskName {  
  public static void main(String[] args) {
    Scanner MyObj = new Scanner(System.in);
    System.out.println("What is your first name ?");
    String firstName = MyObj.nextLine();
    System.out.println("What is your last name ?");
    String lastName = MyObj.nextLine();
    System.out.println("Your name is " + firstName + " " + lastName);
  }
}
