import java.util.Scanner;

/**
 * TP2 - EXERCICE 5 : COUPER PHRASE
 * Programme qui coupe une phrase à 10 caractères et ajoute "..."
 */
public class CouperPhrase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez une phrase : ");
        String phrase = scanner.nextLine();

        if (phrase.length() > 10) {
            String phraseCoupee = phrase.substring(0, 10) + "...";
            System.out.println("\nPhrase coupée : " + phraseCoupee);
        } else {
            System.out.println("\nLa phrase est déjà courte : " + phrase);
        }

        scanner.close();
    }
}
