import java.util.Scanner;

/**
 * EXERCICE 3 - Départements
 * Programme qui détermine si l'utilisateur habite l'Île-de-France
 * Départements : 75, 77, 78, 91, 92, 93, 94
 * Avec validation du code département (1-99)
 */
public class Departements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez votre numéro de département : ");
        int departement = scanner.nextInt();

        // Validation du code département
        if (departement < 1 || departement > 99) {
            System.out.println("Erreur : le code département doit être compris entre 1 et 99 !");
        } else {
            // Vérification Île-de-France
            if (departement == 75 || departement == 77 || departement == 78 ||
                    departement == 91 || departement == 92 || departement == 93 ||
                    departement == 94) {
                System.out.println("Vous habitez en Île-de-France.");
            } else {
                System.out.println("Vous n'habitez pas en Île-de-France.");
            }
        }

        scanner.close();
    }
}
