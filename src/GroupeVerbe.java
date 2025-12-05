import java.util.Scanner;

/**
 * TP2 - EXERCICE 1 : GROUPE DE VERBE
 * Programme qui détermine le groupe d'un verbe selon sa terminaison
 */
public class GroupeVerbe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un verbe : ");
        String verbe = scanner.nextLine().toLowerCase().trim();

        if (verbe.endsWith("er")) {
            System.out.println("Ce verbe appartient au 1er groupe.");
        } else if (verbe.endsWith("ir")) {
            System.out.println("Ce verbe appartient au 2ème groupe.");
        } else if (verbe.endsWith("oire") || verbe.endsWith("oir")) {
            System.out.println("Ce verbe appartient au 3ème groupe.");
        } else {
            System.out.println("Ce verbe appartient au 3ème groupe (autres terminaisons).");
        }

        scanner.close();
    }
}
