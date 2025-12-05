import java.util.Scanner;

/**
 * EXERCICE 5 - TARIFICATION DÉGRESSIVE
 * Programme qui calcule le montant total d'une facture selon la quantité
 * achetée
 * 
 * Tarifs :
 * - Quantité <= 10 : 150 € par article
 * - Quantité entre 11 et 49 : 135 € par article
 * - Quantité >= 50 : 110 € par article
 */
public class TarificationDegressive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez la quantité d'articles désirée : ");
        int quantite = scanner.nextInt();

        int prixUnitaire;
        int montantTotal;

        // Détermination du prix unitaire selon la quantité
        if (quantite <= 10) {
            prixUnitaire = 150;
        } else if (quantite <= 49) {
            prixUnitaire = 135;
        } else {
            prixUnitaire = 110;
        }

        // Calcul du montant total
        montantTotal = quantite * prixUnitaire;

        // Affichage du résultat
        System.out.println("\n=== Facture ===");
        System.out.println("Quantité : " + quantite);
        System.out.println("Prix unitaire : " + prixUnitaire + " €");
        System.out.println("Montant total : " + montantTotal + " €");
        System.out.println("(" + quantite + " × " + prixUnitaire + " € = " + montantTotal + " €)");

        scanner.close();
    }
}
