import java.util.Scanner;

/**
 * EXERCICE 2 - Version étendue
 * Programme qui demande l'âge et indique si l'utilisateur a droit au tarif
 * réduit
 * (< 26 ans OU > 65 ans)
 */
public class TarifReduitEtendu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quel est votre âge ? ");
        int age = scanner.nextInt();

        if (age < 26 || age > 65) {
            System.out.println("Vous avez droit au tarif réduit !");
        } else {
            System.out.println("Vous n'avez pas droit au tarif réduit.");
        }

        scanner.close();
    }
}
