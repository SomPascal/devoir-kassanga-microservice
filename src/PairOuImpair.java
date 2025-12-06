import java.util.Scanner;

/**
 * EXERCICE 7 - PAIR OU IMPAIR
 * Programme qui détermine si un nombre est pair ou impair
 * et affiche les 10 nombres pairs ou impairs suivants
 */
public class PairOuImpair {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Veuillez saisir un chiffre : ");
        int nombre = scanner.nextInt();

        if (nombre % 2 == 0) {
            System.out.println("\n> nombre pair");
            System.out.print("> ");

            for (int i = 0; i < 10; i++) {
                System.out.print(nombre + (i * 2));
                if (i < 9) {
                    System.out.print(" - ");
                }
            }
        } else {
            System.out.println("\n> nombre impair");
            System.out.print("> ");

            for (int i = 0; i < 10; i++) {
                System.out.print(nombre + (i * 2));
                if (i < 9) {
                    System.out.print(" - ");
                }
            }
        }

        System.out.println();

        scanner.close();
    }
}
