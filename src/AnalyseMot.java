import java.util.Scanner;

/**
 * TP2 - EXERCICE 3 : ANALYSE DE MOT
 */
public class AnalyseMot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un mot : ");
        String mot = scanner.nextLine().trim();

        if (mot.isEmpty()) {
            System.out.println("Erreur : aucun mot saisi !");
        } else {
            char premiereLetre = mot.charAt(0);
            char derniereLetre = mot.charAt(mot.length() - 1);
            int nombreLettres = mot.length();

            System.out.println("\n=== Analyse du mot ===");
            System.out.println("Première lettre : " + premiereLetre);
            System.out.println("Dernière lettre : " + derniereLetre);
            System.out.println("Nombre de lettres : " + nombreLettres);
        }

        scanner.close();
    }
}
