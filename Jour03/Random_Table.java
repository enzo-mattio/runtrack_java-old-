package Jour03;
import java.lang.Math;
public class Random_Table {
  public static void main(String[] args){
    int[] tableau = new int[10];
    for(int i : tableau){
      tableau[i] = (int)(Math.random()*100); // Nombre aléatoire entre 0 et 100
      System.out.println(tableau[i]);
    }
  }
}
