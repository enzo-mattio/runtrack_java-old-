/*Créer un fichier nommé Facture.java. Déclarer les variables suivantes :
● prix contenant “49.99”
● quantite content “3”
Calculer le montant hors taxe du client et ajouter le montant à la variable tarifHT. Créer
une variable nommée tva contenant la valeur de la taxe (20%).
Calculer le prix de la facture avec la TVA et stocker la valeur dans une variable nommée
tarifTTC.
Afficher dans le terminal les différentes valeurs de la facture (montant du produit ,
montant HT, montant TTC ...) */
public class Facture {
  public static void main(String[] args) {
    double prix = 49.99;
    int quantite = 3;
    double tarifHT = prix * quantite;
    double tva = 0.2;
    double tarifTTC = tarifHT * (1 + tva);
    System.out.println("Montant du produit (unité) : " + prix + " euros");
    System.out.println("Montant HT (" + quantite + ") : " + tarifHT + " euros");
    System.out.println("Montant TTC : " + tarifTTC + " euros");
  }
}
