package TP03.Exercice3;

import java.util.Scanner;

public class ComptageMotsParLongueur {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez une phrase (mots séparés par des espaces, sans ponctuation) :");
        String phrase = scanner.nextLine();

        String[] mots = phrase.trim().split("\\s+");

        int[] compteur = new int[31];

        for (String mot : mots) {
            int longueur = mot.length();
            if (longueur >= 1 && longueur <= 30) {
                compteur[longueur]++;
            }
        }

        System.out.println("\nRésultat :");
        for (int longueur = 1; longueur <= 30; longueur++) {
            if (compteur[longueur] > 0) {
                System.out.println(longueur + " : " + compteur[longueur]);
            }
        }

        scanner.close();
    }
}
