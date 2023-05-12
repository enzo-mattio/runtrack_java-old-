package Jour04.Job08;
 import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
public class Sum_1_to_10M {
 


    private static final int THREAD_COUNT = 10;
    private static final int MAX_NUMBER = 10000000;
    private static volatile long sum = 0;

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(THREAD_COUNT);
        
        int numbersPerThread = MAX_NUMBER / THREAD_COUNT;
        
        for (int i = 0; i < THREAD_COUNT; i++) {
            final int startNumber = i * numbersPerThread + 1;
            final int endNumber = (i + 1) * numbersPerThread;
            
            executor.execute(() -> calculateSum(startNumber, endNumber));
        }
        
        executor.shutdown();
        
        try {
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("Sum: " + sum);
    }
    
    private static void calculateSum(int startNumber, int endNumber) {
        for (int i = startNumber; i <= endNumber; i++) {
            synchronized (Sum_1_to_1M.class) {
                sum += i;
            }
        }
    }
}

/*
 * Pour se prémunir contre une fork bomb, il est essentiel de mettre en place
 * des mécanismes de contrôle appropriés lors de l'utilisation des threads.
 * Voici quelques bonnes pratiques à suivre :
 * 
 * Limiter le nombre de threads : Il est important de définir une limite au
 * nombre de threads pouvant être créés simultanément. Cela peut être fait en
 * utilisant un gestionnaire de pool de threads, qui permet de contrôler le
 * nombre de threads actifs à tout moment.
 * 
 * Utiliser des mécanismes de synchronisation : Lorsque plusieurs threads
 * accèdent à des ressources partagées, il est crucial d'utiliser des mécanismes
 * de synchronisation tels que les verrous (lock) ou les sémaphores pour éviter
 * les conflits et les conditions de concurrence.
 * 
 * Vérifier les conditions limites : Avant de créer un nouveau thread, il est
 * important de vérifier si les conditions limites, telles que la disponibilité
 * de ressources suffisantes, sont satisfaites. Si les conditions ne sont pas
 * remplies, il est préférable de ne pas créer de nouveau thread.
 */

