package Jour03;

public class String_arr {
  public static void main(String[] args){
    String[] names = {"Josette", "John", "Myrtille", "Marc"};
    System.out.println(names[1]);
    names[2] = "Mireille";
    for(String i : names){
      System.out.println(i);
    }
  }
}
