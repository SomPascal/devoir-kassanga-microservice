import java.util.Scanner;

/**
 * EXERCICE 3 - Départements
 * Programme qui détermine si l'utilisateur habite l'Île-de-France
 */
public class Departements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez votre numéro de département : ");
        int departement = scanner.nextInt();

        if (departement < 1 || departement > 99) {
            System.out.println("Erreur : le code département doit être compris entre 1 et 99 !");
        } else {
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
