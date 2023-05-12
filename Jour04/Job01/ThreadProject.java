package Jour04.Job01;
/*Créer un fichier nommé “ThreadProject” contenant la classe ThreadProject avec une
méthode main. Dans celle-ci, instancier votre classe MyThread et lancer l’exécution du
thread. */
public class ThreadProject {
  public static void main(String[] args){
    Thread t = new MyThread();
    t.start();
  }
}
