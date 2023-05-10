package Jour02;
/*Des dés a 6 faces avec les valeurs suivantes : 1 , 2 , 3 , 4 , 5 et 6.
Créer un programme qui affiche toutes les combinaisons
possibles si trois des sont lancées ainsi que le nombre total de
combinaisons possibles. */
public class Dice_Combinaison {
  public static void main(String[] args) {
    int[] dice = {1,2,3,4,5,6};
    int count = 0;
    for (int i = 0; i < dice.length; i++){
      for (int j = 0; j < dice.length; j++){
        for (int k = 0; k < dice.length; k++){
          System.out.println(dice[i] + " " + dice[j] + " " + dice[k]);
          count++;
        }
      }
    }
    System.out.println("Il y a " + count + " combinaisons possibles");
  }
}
