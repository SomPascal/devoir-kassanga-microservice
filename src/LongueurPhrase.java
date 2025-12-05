import java.util.Scanner;

/**
 * TP2 - EXERCICE 2 : LONGUEUR DE PHRASE
 * Programme qui catégorise une phrase selon sa longueur
 * 
 * - Phrase courte : < 20 caractères
 * - Phrase de longueur moyenne : 20-49 caractères
 * - Phrase longue : >= 50 caractères
 */
public class LongueurPhrase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez une phrase : ");
        String phrase = scanner.nextLine();

        int longueur = phrase.length();

        System.out.println("\nLongueur de la phrase : " + longueur + " caractères");

        if (longueur < 20) {
            System.out.println("→ Phrase courte");
        } else if (longueur < 50) {
            System.out.println("→ Phrase de longueur moyenne");
        } else {
            System.out.println("→ Phrase longue");
        }

        scanner.close();
    }
}
