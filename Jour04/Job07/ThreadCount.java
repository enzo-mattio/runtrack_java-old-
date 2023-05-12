package Jour04.Job07;

public class ThreadCount extends Thread{
    private int[] array;
    int sum = 0;

    public ThreadCount(int[] number) {
        array = number;
    }

    public void run() {
          // Calcule la somme des nombres dans le tableau
      
      for (int i : array) {
        sum += i;
    }
  }

    public int count_arr() {
        return sum;
    }
  
}
