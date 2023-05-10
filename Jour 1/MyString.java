/*Créer un fichier nommé MyString.java contenant la classe Mystring et ajoutez la
méthode main. Dans celle-ci, déclarer quatre variables de type string de quatre façons
différentes. */
public class MyString {

  public static void main(String[] args) {
    String str1 = "Hello";
    String str2 = new String("World");
    char[] charArray = {'H', 'e', 'l', 'l', 'o'};
    String str3 = new String(charArray);
    String str4 = new String(charArray, 1, 3);
    System.out.println(str1);
    System.out.println(str2);
    System.out.println(str3);
    System.out.println(str4);
  }
}
