import java.util.Scanner;

/**
 * EXERCICE 4 - Produit
 * Programme qui affiche le signe du produit de deux nombres sans calculer leur
 * produit
 */
public class ProduitSigne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Chiffre 1 --> ");
        double chiffre1 = scanner.nextDouble();

        System.out.print("Chiffre 2 --> ");
        double chiffre2 = scanner.nextDouble();

        // Déterminer le signe sans calculer le produit
        if (chiffre1 == 0 || chiffre2 == 0) {
            System.out.println("----- produit nul");
        } else if ((chiffre1 > 0 && chiffre2 > 0) || (chiffre1 < 0 && chiffre2 < 0)) {
            System.out.println("----- produit positif");
        } else {
            System.out.println("----- produit négatif");
        }

        scanner.close();
    }
}
