package Jour03;

public class Unique {
  public static void main(String[] args){
    int[] tableau = {3,7,3,9,8};
    for (int i = 0; i < tableau.length; i++) {
      int nombreOccurrences = 0;
      for (int j = 0; j < tableau.length; j++) {
        if (tableau[i] == tableau[j]) {
          nombreOccurrences++;
        }
      }
      if (nombreOccurrences == 1) {
        System.out.println("Valeur : " + tableau[i] + ", est présent une unique fois.");
      }
    }
}
}
