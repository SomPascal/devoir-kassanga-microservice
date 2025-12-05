import java.util.Scanner;

/**
 * EXERCICE 9 - DEVINETTE (BOUCLE)
 * Jeu où l'utilisateur doit deviner un nombre aléatoire entre 1 et 10
 */
public class Devinette {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nbAleatoire = (int) (Math.random() * 10 + 1);

        int nbEssais = 0;
        int proposition;

        System.out.println("=== JEU DE DEVINETTE ===");
        System.out.println("Devinez le nombre entre 1 et 10 !");

        do {
            System.out.print("\nVotre proposition : ");
            proposition = scanner.nextInt();
            nbEssais++;

            if (proposition < nbAleatoire) {
                System.out.println("C'est plus !");
            } else if (proposition > nbAleatoire) {
                System.out.println("C'est moins !");
            }

        } while (proposition != nbAleatoire);

        System.out.println("\n🎉 Bravo ! Vous avez trouvé le nombre " + nbAleatoire + " !");
        System.out.println("Nombre d'essais : " + nbEssais);

        if (nbEssais == 1) {
            System.out.println("Incroyable ! Du premier coup !");
        } else if (nbEssais <= 3) {
            System.out.println("Excellent !");
        } else if (nbEssais <= 5) {
            System.out.println("Pas mal !");
        } else {
            System.out.println("Vous y êtes arrivé !");
        }

        scanner.close();
    }
}
