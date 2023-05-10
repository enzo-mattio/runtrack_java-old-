/*Créez un fichier nommé Calcul.java et une classe nommée Calcul possédant une
méthode main qui contient une variable nommée nombre est assigné lui la valeur 7.
Afficher la valeur de la variable nombre dans le terminal.
Ajouter 3 à la variable nombre et afficher à nouveau sa valeur. Multiplier par 5 la valeur
de nombre et afficher à nouveau la valeur de nombre. Chaque résultat doit être affiché à
la ligne. */
public class Calcul {
  public static void main(String[] args) {
    int nombre = 7;
    System.out.println(nombre);
    nombre += 3;
    System.out.println(nombre);
    nombre *= 5;
    System.out.println(nombre);
  }
}
