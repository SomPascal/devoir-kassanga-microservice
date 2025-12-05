import java.util.Scanner;

/**
 * EXERCICE 8 - MULTIPLE
 * Programme qui affiche les multiples d'un nombre jusqu'à un maximum choisi par
 * l'utilisateur
 */
public class Multiple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("De quel nombre voulez-vous afficher les multiples ? ");
        int nombre = scanner.nextInt();

        System.out.print("Jusqu'à quel nombre maximum ? ");
        int max = scanner.nextInt();

        System.out.println("\nMultiples de " + nombre + " jusqu'à " + max + " :");

        boolean premierMultiple = true;
        for (int i = nombre; i <= max; i += nombre) {
            if (!premierMultiple) {
                System.out.print(" - ");
            }
            System.out.print(i);
            premierMultiple = false;
        }

        System.out.println(); // Nouvelle ligne à la fin

        scanner.close();
    }
}
