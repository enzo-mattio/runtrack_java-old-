package Jour03;
import java.util.Arrays;

public class Sort_matrice {
  public static void main(String[] args){
    int[][] matrice = {{5,9,3},{7,2,8},{1,6,4}};
    
    for (int[] i : matrice){
      Arrays.sort(i);
      }
    for (int i = 0; i < matrice.length; i++){
      int[] temp = new int[matrice.length];
      for (int j = 0; j < matrice.length; j++){
        temp[j] = matrice[j][i];
      }
      Arrays.sort(temp);
      for (int j= 0; j < matrice.length; j++){
        matrice[j][i] = temp[j];
        
      }
    }
    // Affichage de la matrice triée
    for (int[] row : matrice){
      for (int element : row){
        System.out.print(element + " ");
      }
      System.out.println();
    }
  }
}

