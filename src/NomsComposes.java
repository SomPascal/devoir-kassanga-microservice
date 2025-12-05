import java.util.Scanner;

/**
 * TP2 - EXERCICE 6 : NOMS COMPOSÉS
 * Extension de l'exercice 4 pour gérer les noms composés (avec tirets)
 * 
 * Exemple : jean-paul MARTIN => MARTIN (6) Jean-Paul (9)
 */
public class NomsComposes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez votre nom : ");
        String nom = scanner.nextLine().trim();

        System.out.print("Entrez votre prénom : ");
        String prenom = scanner.nextLine().trim();

        // Formatage du nom : tout en majuscules
        String nomFormate = nom.toUpperCase();
        int longueurNom = nom.length();

        // Formatage du prénom (gérer les noms composés)
        String prenomFormate = formaterPrenom(prenom);
        int longueurPrenom = prenom.length();

        // Affichage
        System.out.println("\n" + nomFormate + " (" + longueurNom + ") " +
                prenomFormate + " (" + longueurPrenom + ")");

        scanner.close();
    }

    /**
     * Formate un prénom en mettant la première lettre de chaque partie en majuscule
     * Gère les prénoms composés avec tirets
     */
    private static String formaterPrenom(String prenom) {
        if (prenom.contains("-")) {
            // Séparer par le tiret
            String[] parties = prenom.split("-");
            StringBuilder resultat = new StringBuilder();

            for (int i = 0; i < parties.length; i++) {
                String partie = parties[i];
                if (!partie.isEmpty()) {
                    // Première lettre en majuscule, reste en minuscule
                    resultat.append(partie.substring(0, 1).toUpperCase())
                            .append(partie.substring(1).toLowerCase());
                }

                // Ajouter le tiret sauf pour la dernière partie
                if (i < parties.length - 1) {
                    resultat.append("-");
                }
            }

            return resultat.toString();
        } else {
            // Prénom simple
            return prenom.substring(0, 1).toUpperCase() +
                    prenom.substring(1).toLowerCase();
        }
    }
}
