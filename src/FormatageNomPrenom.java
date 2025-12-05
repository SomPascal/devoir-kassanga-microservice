import java.util.Scanner;

/**
 * TP2 - EXERCICE 4 : FORMATAGE NOM/PRÉNOM
 * Programme qui formate un nom et un prénom :
 * - Nom en majuscules + nombre de lettres
 * - Prénom avec 1ère lettre majuscule, reste en minuscules + nombre de lettres
 * 
 * Exemple : kEYnEs jOHn => KEYNES (6) John (4)
 */
public class FormatageNomPrenom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez votre nom : ");
        String nom = scanner.nextLine().trim();

        System.out.print("Entrez votre prénom : ");
        String prenom = scanner.nextLine().trim();

        // Formatage du nom : tout en majuscules
        String nomFormate = nom.toUpperCase();
        int longueurNom = nom.length();

        // Formatage du prénom : 1ère lettre majuscule, reste minuscule
        String prenomFormate = prenom.substring(0, 1).toUpperCase() +
                prenom.substring(1).toLowerCase();
        int longueurPrenom = prenom.length();

        // Affichage
        System.out.println("\n" + nomFormate + " (" + longueurNom + ") " +
                prenomFormate + " (" + longueurPrenom + ")");

        scanner.close();
    }
}
