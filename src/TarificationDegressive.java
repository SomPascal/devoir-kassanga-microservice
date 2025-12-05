import java.util.Scanner;

/**
 * EXERCICE 5 - TARIFICATION DÉGRESSIVE
 * Programme qui calcule le montant total d'une facture selon la quantité
 * achetée
 * 
 */
public class TarificationDegressive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez la quantité d'articles désirée : ");
        int quantite = scanner.nextInt();

        int prixUnitaire;
        int montantTotal;

        if (quantite <= 10) {
            prixUnitaire = 150;
        } else if (quantite <= 49) {
            prixUnitaire = 135;
        } else {
            prixUnitaire = 110;
        }

        montantTotal = quantite * prixUnitaire;

        System.out.println("\n=== Facture ===");
        System.out.println("Quantité : " + quantite);
        System.out.println("Prix unitaire : " + prixUnitaire + " €");
        System.out.println("Montant total : " + montantTotal + " €");
        System.out.println("(" + quantite + " × " + prixUnitaire + " € = " + montantTotal + " €)");

        scanner.close();
    }
}
