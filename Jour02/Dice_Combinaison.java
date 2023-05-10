package Jour02;

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
