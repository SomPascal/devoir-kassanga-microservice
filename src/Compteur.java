import java.util.Scanner;

/**
 * EXERCICE 6 - COMPTEUR
 * Programme qui compte et affiche les nombres de 1 jusqu'à un nombre choisi par
 * l'utilisateur
 */
public class Compteur {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Jusqu'à quel nombre voulez-vous compter ? ");
        int limite = scanner.nextInt();

        System.out.println("\nComptage de 1 à " + limite + " :");

        for (int i = 1; i <= limite; i++) {
            System.out.print(i);
            if (i < limite) {
                System.out.print(" - ");
            }
        }

        System.out.println(); // Nouvelle ligne à la fin

        scanner.close();
    }
}
