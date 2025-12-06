package TP03.Exercice4;

import java.util.Scanner;

public class JeuDuPendu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String motExemple = "baobab";
        char lettreExemple = 'b';
        afficherPositions(motExemple, lettreExemple);

        String motSecret = "info";
        jouerAuPendu(motSecret, scanner);

        scanner.close();
    }

    public static void afficherPositions(String mot, char lettre) {
        System.out.println("\n--- Recherche de la lettre '" + lettre + "' dans \"" + mot + "\" ---");
        String positions = "";
        for (int i = 0; i < mot.length(); i++) {
            if (mot.charAt(i) == lettre) {
                if (!positions.isEmpty()) {
                    positions += ", ";
                }
                positions += i;
            }
        }

        if (positions.isEmpty()) {
            System.out.println("La lettre '" + lettre + "' n'apparaît pas dans le mot.");
        } else {
            System.out.println("La lettre '" + lettre + "' se trouve en position : " + positions);
        }
    }

    public static void jouerAuPendu(String motSecret, Scanner scanner) {
        char[] affichage = new char[motSecret.length()];
        for (int i = 0; i < affichage.length; i++) {
            affichage[i] = '#';
        }

        int lettresTrouvees = 0;
        System.out.println("\n=== JEU DU PENDU ===");
        System.out.println("Mot à deviner : " + new String(affichage));

        while (lettresTrouvees < motSecret.length()) {
            System.out.print("Entrez une lettre : ");
            char proposition = scanner.next().toLowerCase().charAt(0);

            boolean trouve = false;

            for (int i = 0; i < motSecret.length(); i++) {
                if (motSecret.charAt(i) == proposition) {
                    if (affichage[i] == '#') {
                        affichage[i] = proposition;
                        lettresTrouvees++;
                        trouve = true;
                    }
                }
            }

            System.out.println("Mot actuel : " + new String(affichage));

            if (!trouve) {
                System.out.println("La lettre '" + proposition + "' n'est pas dans le mot !");
            } else {
                System.out.println("Bien joué !");
            }

            if (lettresTrouvees == motSecret.length()) {
                System.out.println("\nFélicitations ! Vous avez trouvé le mot : " + motSecret);
            }
        }
    }
}