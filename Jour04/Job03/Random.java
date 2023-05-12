package Jour04.Job03;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Random extends Thread{
  int length;
  public Random(int number) {
    length = number;
  }
  public void run() {
    // Génère la chaîne de caractères aléatoire
    StringBuilder sb = new StringBuilder();
    String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    int charLength = characters.length();

    for (int i = 0; i < this.length ; i++) {
        int randomIndex = (int) (Math.random() * charLength);
        char randomChar = characters.charAt(randomIndex);
        sb.append(randomChar);
    }

    String randomString = sb.toString();

    // Écrit la chaîne de caractères dans le fichier "output.txt"
    try {
        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt", true));
        writer.write(randomString);
        writer.close();
    } catch (IOException e) {
        e.printStackTrace();
    
  }
}
}