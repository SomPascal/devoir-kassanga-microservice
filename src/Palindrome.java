import java.util.Scanner;

/**
 * TP2 - EXERCICE 7 : PALINDROME
 * Programme qui vérifie si un mot est un palindrome
 */
public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un mot : ");
        String mot = scanner.nextLine().toLowerCase().trim();

        boolean estPalindrome = true;
        int longueur = mot.length();

        for (int i = 0; i < longueur / 2; i++) {
            if (mot.charAt(i) != mot.charAt(longueur - 1 - i)) {
                estPalindrome = false;
                break;
            }
        }

        if (estPalindrome) {
            System.out.println("\n✓ \"" + mot + "\" est un palindrome !");
        } else {
            System.out.println("\n✗ \"" + mot + "\" n'est pas un palindrome.");
        }

        scanner.close();
    }
}
