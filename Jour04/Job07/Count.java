package Jour04.Job07;
import java.util.Scanner;
import java.util.Arrays;
/*Calcul de la somme en parallèle avec deux threads
Créez un programme Java qui demande à l'utilisateur de saisir un tableau de nombres.
Le programme doit ensuite diviser le tableau en deux moitiés et créer deux threads,
chacun chargé de calculer la somme d'une moitié du tableau.
Les deux threads doivent être lancés en parallèle, et les résultats doivent être combinés
pour obtenir la somme totale. Enfin, le programme doit afficher la somme totale ainsi
que le temps d'exécution. */
public class Count {
  public static void main(String[] args) {


        // Demande à l'utilisateur d'entrer un tableau d'entiers
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
        // Initilisation des deux threads
        ThreadCount thread1 = new ThreadCount(Arrays.copyOfRange(array, 0, array.length / 2));
        ThreadCount thread2 = new ThreadCount(Arrays.copyOfRange(array, array.length / 2, array.length));
        // Lancement des deux threads
        thread1.start();
        thread2.start();
        // Attente de la fin des deux threads
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long endTime = System.nanoTime();
        long executionTime = (endTime - startTime); // Convertit le temps en millisecondes

        // Affiche la somme totale
        int sum = thread1.count_arr() + thread2.count_arr();
        System.out.println("Somme totale : " + sum);

        // Affiche le temps d'exécution
        System.out.println("Temps d'exécution : " + executionTime + " ns.");

        scanner.close();
    }
}

