import java.util.Scanner;

/**
 * TP2 - EXERCICE 6 : NOMS COMPOSÉS
 * Extension de l'exercice 4 pour gérer les noms composés (avec tirets)
 */
public class NomsComposes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez votre nom : ");
        String nom = scanner.nextLine().trim();

        System.out.print("Entrez votre prénom : ");
        String prenom = scanner.nextLine().trim();

        String nomFormate = nom.toUpperCase();
        int longueurNom = nom.length();

        String prenomFormate = formaterPrenom(prenom);
        int longueurPrenom = prenom.length();

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
            String[] parties = prenom.split("-");
            StringBuilder resultat = new StringBuilder();

            for (int i = 0; i < parties.length; i++) {
                String partie = parties[i];
                if (!partie.isEmpty()) {
                    resultat.append(partie.substring(0, 1).toUpperCase())
                            .append(partie.substring(1).toLowerCase());
                }

                if (i < parties.length - 1) {
                    resultat.append("-");
                }
            }

            return resultat.toString();
        } else {
            return prenom.substring(0, 1).toUpperCase() +
                    prenom.substring(1).toLowerCase();
        }
    }
}
