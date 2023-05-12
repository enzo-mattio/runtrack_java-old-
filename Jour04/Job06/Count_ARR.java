package Jour04.Job06;

import java.util.Scanner;

/*Créez un programme Java qui demande à l'utilisateur de saisir un tableau de nombres.
Le programme doit ensuite calculer la somme de tous les nombres dans le tableau à
l'aide d'une boucle et afficher la somme totale ainsi que le temps d'exécution.*/
public class Count_ARR {
  public static void main(String[] args) {
    // Demande à l'utilisateur de saisir la taille du tableau
    Scanner scanner = new Scanner(System.in);
    System.out.print("Entrez un tableau d'entiers (séparés par des espaces) : ");
    String input = scanner.nextLine();

    // Divise la saisie en éléments individuels et les convertit en entiers
    String[] numbers = input.split(" ");
    int[] array = new int[numbers.length];
    for (int i = 0; i < numbers.length; i++) {
        array[i] = Integer.parseInt(numbers[i]);
    }

    // Mesure le temps d'exécution global
    long startTime = System.nanoTime();

    // Calcule la somme des nombres dans le tableau
    int sum = 0;
    for (int i : array) {
        sum += i;
    }

    long endTime = System.nanoTime();
    long executionTime = (endTime - startTime); // Convertit le temps en millisecondes

    // Affiche la somme totale
    System.out.println("Somme totale : " + sum);

    // Affiche le temps d'exécution
    System.out.println("Temps d'exécution : " + executionTime + " ns.");

    scanner.close();
  }
}
