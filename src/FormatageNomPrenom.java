import java.util.Scanner;

/**
 * TP2 - EXERCICE 4 : FORMATAGE NOM/PRÉNOM
 * Programme qui formate un nom et un prénom
 */
public class FormatageNomPrenom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez votre nom : ");
        String nom = scanner.nextLine().trim();

        System.out.print("Entrez votre prénom : ");
        String prenom = scanner.nextLine().trim();

        String nomFormate = nom.toUpperCase();
        int longueurNom = nom.length();

        String prenomFormate = prenom.substring(0, 1).toUpperCase() +
                prenom.substring(1).toLowerCase();
        int longueurPrenom = prenom.length();

        System.out.println("\n" + nomFormate + " (" + longueurNom + ") " +
                prenomFormate + " (" + longueurPrenom + ")");

        scanner.close();
    }
}
