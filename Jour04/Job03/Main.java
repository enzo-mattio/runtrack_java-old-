package Jour04.Job03;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main extends Thread{
    public static void main(String[] args) {
        // Demande à l'utilisateur de saisir la longueur de la chaîne
        // Mesure le temps d'exécution global
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez la longueur de la chaîne : ");
        int length = scanner.nextInt();
        scanner.close();
        
        // Crée le fichier "output.txt" s'il n'existe pas et le vide s'il existe
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.write("");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int num_of_threads = 2;
        int length_of_thread = length/num_of_threads;
        int length_of_last_thread = length_of_thread + (length%num_of_threads);
        //déclaration de 20 threads
        Thread thread1 = new Thread(new Random(length_of_thread));
        Thread thread2 = new Thread(new Random(length_of_last_thread));
        long startTime = System.nanoTime();
        //démarrage des threads
        thread1.start();
        thread2.start();
        

        
        //attente de la fin des threads

        try {
            thread1.join();
            thread2.join(); 
                     
            
        } catch (InterruptedException e){
            e.printStackTrace();
        }
       

        double endTime = (double) System.nanoTime();
        double executionTime = (endTime - startTime) / 1_000_000;

        // Affiche le temps d'exécution
        System.out.println("Temps d'exécution : " + executionTime + " millisecondes.");
    }
}



// Problème : le temps d'exécution est plus long que celui de la version séquentielle