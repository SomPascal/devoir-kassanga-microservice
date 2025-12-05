import java.util.Scanner;

/**
 * EXERCICE 1a - Version Scanner
 * Programme qui demande le nom de l'utilisateur et affiche un message personnalisé
 */
public class Bonjour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Veuillez saisir votre nom : ");
        String nom = scanner.nextLine();
        
        System.out.println("Bonjour " + nom.toLowerCase());
        
        scanner.close();
    }
}
