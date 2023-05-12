package Jour04.Job05;

import java.util.Scanner;

public class ThreadCount {
    
    public static void main(String[] args) {
        // Demande à l'utilisateur de saisir le nombre maximum à compter
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le nombre maximum à compter : ");
        int max = scanner.nextInt();

        // Crée deux objets de la classe Count
        Count count1 = new Count(max / 2);
        Count count2 = new Count(max / 2 + max % 2);

        // Mesure le temps d'exécution global
        long startTime = System.nanoTime();

        // Lance les threads
        count1.start();
        count2.start();

        // Attend la fin de l'exécution des threads
        try {
            count1.join();
            count2.join();
        } catch (InterruptedException e) {
            System.out.println("Une erreur s'est produite lors de l'attente des threads.");
            e.printStackTrace();
        }

        long endTime = System.nanoTime();
        long executionTime = (endTime - startTime) / 1_000_000;
        int number_of_threads = 2;
        // Affiche le compte total
        int totalCount = count1.getCount() + count2.getCount();
        System.out.println("Compte total : " + (totalCount - number_of_threads));

        // Affiche le temps d'exécution
        System.out.println("Temps d'exécution : " + executionTime + " millisecondes.");

        scanner.close();
    }
}


// Encore le double du temps d'exécution
