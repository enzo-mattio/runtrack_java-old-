/*Écrire un programme qui demande à l’utilisateur de saisir deux chaines de caractères et
qui stock les valeurs dans chaine1 et chaine2. Le programme doit ensuite échanger la
valeur des deux variables sans créer de variable supplémentaire. */

import java.util.Scanner;

public class ChangeString {
  public static void main(String[] args) {
    Scanner MyObj = new Scanner(System.in);
    System.out.println("Enter a string");
    String chaine1 = MyObj.nextLine();
    System.out.println("Enter another string");
    String chaine2 = MyObj.nextLine();
    System.out.println("chaine1 = " + chaine1 + ", chaine2 = " + chaine2);
    chaine1 = chaine1 + chaine2;
    chaine2 = chaine1.substring(0, chaine1.length() - chaine2.length());
    chaine1 = chaine1.substring(chaine2.length());
    System.out.println("chaine1 = " + chaine1 + ", chaine2 = " + chaine2);
  }
}
