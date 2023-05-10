package Jour02;

public class SumOfEvenNumber {
  public static void main(String[] args){
    int sum = 0;
    for (int i = 1; i <=100; i++){
      if (i%2==0){
        sum += i;
      }
    }
    System.out.println("The sum of the even numbers between 0 and 100 is :" + sum);
  }
}
