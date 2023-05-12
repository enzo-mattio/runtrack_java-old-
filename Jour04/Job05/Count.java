package Jour04.Job05;

public class Count extends Thread {
    private int max;
    private int count = 0;

    public Count(int number) {
        max = number;
    }

    public void run() {
        // Compte jusqu'au nombre maximum
        for (int i = 0; i <= max; i++) {
            count++;
        }
    }

    public int getCount() {
        return count;
    }
}
