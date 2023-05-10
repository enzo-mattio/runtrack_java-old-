/*Écrire un programme qui demande à l’utilisateur une heure sous forme de minute sous
forme d’un nombre entier. Convertissez les minutes en heure sous forme HH:MM. */

import java.util.Scanner;

public class Hour {
  public static void main(String[] args) {
    Scanner MyObj = new Scanner(System.in);
    System.out.println("Enter a number of minutes");
    int  nbminutes = MyObj.nextInt();
  
    int hours = nbminutes / 60;
    int minutesLeft = nbminutes % 60;
    System.out.println(hours + ":" + minutesLeft);
  }
}
