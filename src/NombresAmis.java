import java.util.Scanner;

/**
 * TP2 - EXERCICE 8 : NOMBRES AMIS
 * Programme qui détermine si deux nombres sont "amis"
 * Deux nombres sont amis si la somme de leurs chiffres est égale
 * 
 * Exemple : 1232 (somme = 8) et 71 (somme = 8) sont amis
 */
public class NombresAmis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le premier nombre : ");
        int nombre1 = scanner.nextInt();

        System.out.print("Entrez le deuxième nombre : ");
        int nombre2 = scanner.nextInt();

        // Calculer la somme des chiffres de chaque nombre
        int somme1 = sommeChiffres(nombre1);
        int somme2 = sommeChiffres(nombre2);

        // Affichage des résultats
        System.out.println("\nNombre 1 → " + nombre1 + " (somme des chiffres : " + somme1 + ")");
        System.out.println("Nombre 2 → " + nombre2 + " (somme des chiffres : " + somme2 + ")");

        if (somme1 == somme2) {
            System.out.println("\n✓ Ces 2 nombres sont amis !");
        } else {
            System.out.println("\n✗ Ces 2 nombres ne sont pas amis.");
        }

        scanner.close();
    }

    /**
     * Calcule la somme des chiffres d'un nombre
     * 
     * @param nombre Le nombre dont on veut calculer la somme des chiffres
     * @return La somme des chiffres
     */
    private static int sommeChiffres(int nombre) {
        // Convertir en String pour accéder aux chiffres
        String nombreStr = String.valueOf(Math.abs(nombre)); // abs pour gérer les négatifs
        int somme = 0;

        for (int i = 0; i < nombreStr.length(); i++) {
            char chiffre = nombreStr.charAt(i);
            somme += Character.getNumericValue(chiffre);
        }

        return somme;
    }
}
