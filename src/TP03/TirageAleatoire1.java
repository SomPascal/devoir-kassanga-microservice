package TP03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TirageAleatoire1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int userNumber = 0;
        boolean saisieValide = false;

        while (!saisieValide) {
            System.out.print("Entrez un nombre entier entre 1 et 100 : ");
            try {
                userNumber = scanner.nextInt();
                if (userNumber >= 1 && userNumber <= 100) {
                    saisieValide = true;
                } else {
                    System.out.println("Erreur : le nombre doit être entre 1 et 100 inclus !");
                }
            } catch (InputMismatchException e) {
                System.out.println("Erreur : veuillez saisir un nombre entier valide !");
                scanner.next();
            }
        }

        System.out.println("Nombre choisi : " + userNumber);
        System.out.println("Début des tirages aléatoires...\n");

        int nombreAleatoire;
        int compteur = 0;

        do {
            nombreAleatoire = 1 + (int) (Math.random() * 100);
            compteur++;

        } while (nombreAleatoire != userNumber);

        System.out.println("==================================");
        System.out.println("Bravo ! Le nombre " + userNumber + " a été trouvé !");
        System.out.println("Nombre de tirages nécessaires : " + compteur);
        System.out.println("==================================");

        scanner.close();

    }
}