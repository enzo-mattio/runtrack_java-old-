package Jour03;

public class Rep {
  public static void main(String[] args){
  int[] tableau = {3,7,3,9,8};
  int[] occurrences = new int[10];

  for (int i : tableau) {
      occurrences[i]++;
  }

  for (int i = 0; i < occurrences.length; i++) {
      int nombreOccurrences = occurrences[i];
      if (nombreOccurrences > 0) {
          System.out.println("Valeur : " + i + ", Nombre d'occurrences : " + nombreOccurrences);
      }
  }
}
}

