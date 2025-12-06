import java.util.Scanner;

/**
 * EXERCICE 1b - Version Scanner
 * Programme qui lit deux entiers et affiche leur somme, différence, produit et
 * quotient
 */
public class Elementaire {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le premier entier : ");
        int nombre1 = scanner.nextInt();

        System.out.print("Entrez le deuxième entier : ");
        int nombre2 = scanner.nextInt();

        System.out.println("\n=== Résultats ===");
        System.out.println("Somme : " + nombre1 + " + " + nombre2 + " = " + (nombre1 + nombre2));
        System.out.println("Différence : " + nombre1 + " - " + nombre2 + " = " + (nombre1 - nombre2));
        System.out.println("Produit : " + nombre1 + " × " + nombre2 + " = " + (nombre1 * nombre2));
        System.out.println("Quotient : " + nombre1 + " ÷ " + nombre2 + " = " + (nombre1 / nombre2));

        scanner.close();
    }
}
