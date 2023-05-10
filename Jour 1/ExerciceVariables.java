/*Créer un fichier nommé ExerciceVariables.java. Déclarer deux variables nommées
num1 et num2 contenant chacune un entier, afficher leurs valeurs dans le terminal.
Échanger leurs valeurs et afficher leur nouvelle valeur. */
public class ExerciceVariables {
  public static void main(String[] args) {
    int num1 = 5, num2 = 10;
    System.out.println("num1 = " + num1 + ", num2 = " + num2);
    int temp = num1;
    num1 = num2;
    num2 = temp;
    System.out.println("num1 = " + num1 + ", num2 = " + num2);
  }
}
