/*Écrire un programme qui demande à l’utilisateur de saisir un nombre entier et qui
affiche l’ensemble des nombres entier jusqu’au nombre saisi par l’utilisateur.
Par exemple, si l’utilisateur saisi le 5, alors les nombres entiers affichés seront 1,2,3,4 et
5. */

import java.util.Scanner;

  public class CountI {
    public static void main(String[] args) {
      Scanner MyObj = new Scanner(System.in);
      System.out.println("Enter a number");
      int number = MyObj.nextInt();
      for (int i = 1; i <= number; i++) {
        System.out.println(i);
      }
    }
  }
