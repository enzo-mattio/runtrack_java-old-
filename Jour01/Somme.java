import java.util.Scanner;

public class Somme {
  public static void main(String[] args) {
    Scanner MyObj = new Scanner(System.in);
    System.out.println("Enter a :");
    int a = MyObj.nextInt();
    System.out.println("Enter b :");
    int b = MyObj.nextInt();
    int c = a + b;
    System.out.println("a = " + a + ", b = " + b + ", c = " + c);
  }
}
