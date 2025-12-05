import java.util.Scanner;

/**
 * TP2 - EXERCICE 8 : NOMBRES AMIS
 * Programme qui détermine si deux nombres sont "amis"
 * Deux nombres sont amis si la somme de leurs chiffres est égale
 */
public class NombresAmis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le premier nombre : ");
        int nombre1 = scanner.nextInt();

        System.out.print("Entrez le deuxième nombre : ");
        int nombre2 = scanner.nextInt();

        int somme1 = sommeChiffres(nombre1);
        int somme2 = sommeChiffres(nombre2);

        System.out.println("\nNombre 1 → " + nombre1 + " (somme des chiffres : " + somme1 + ")");
        System.out.println("Nombre 2 → " + nombre2 + " (somme des chiffres : " + somme2 + ")");

        if (somme1 == somme2) {
            System.out.println("\n✓ Ces 2 nombres sont amis !");
        } else {
            System.out.println("\n✗ Ces 2 nombres ne sont pas amis.");
        }

        scanner.close();
    }

    private static int sommeChiffres(int nombre) {
        String nombreStr = String.valueOf(Math.abs(nombre));
        int somme = 0;

        for (int i = 0; i < nombreStr.length(); i++) {
            char chiffre = nombreStr.charAt(i);
            somme += Character.getNumericValue(chiffre);
        }

        return somme;
    }
}
