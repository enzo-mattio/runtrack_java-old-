package Jour04.Job04;

import java.util.Scanner;

/*Créez un programme Java qui demande à l'utilisateur de saisir le nombre maximum à
compter. Le programme doit ensuite compter de 1 jusqu'au nombre maximum à l'aide
d'une boucle et afficher le compte total ainsi que le temps d'exécution. */
public class Count {
    public static void main(String[] args) {
        // Demande à l'utilisateur de saisir le nombre maximum à compter
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le nombre maximum à compter : ");
        int max = scanner.nextInt();
        // Mesure le temps d'exécution global
        long startTime = System.nanoTime();
        // Compte jusqu'à max
        int count = 0;
        for (int i = 1; i <= max; i++) {
            count++;
        }
        long endTime = System.nanoTime();
        long executionTime = (endTime - startTime)/1_000_000;
        // Affiche le compte total
        System.out.println("Compte total : " + count);
        // Affiche le temps d'exécution
        System.out.println("Temps d'exécution : " + executionTime + " millisecondes.");
        scanner.close();
  }
}
