import java.util.Scanner;

public class FigureGeometrique {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            displayMenu();
            System.out.print("Tapez le numéro de votre choix: ");
            
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        drawSquare(scanner);
                        break;
                    case 2:
                        drawTriangle(scanner);
                        break;
                    case 3:
                        drawPyramid(scanner);
                        break;
                    case 4:
                        System.out.println("Au revoir !");
                        break;
                    default:
                        System.out.println("Choix invalide. Veuillez entrer un numéro entre 1 et 4.");
                }
            } else {
                System.out.println("Entrée invalide. Veuillez entrer un numéro.");
                scanner.nextLine();
                choice = 0;
            }
            
            System.out.println();

        } while (choice != 4);

        scanner.close();
    }

    private static void displayMenu() {
        System.out.println("--- Exercice 9: FigureGeometrique ---");
        System.out.println("dessin d'une figure geometrique");
        System.out.println("1 \t carré");
        System.out.println("2 \t triangle");
        System.out.println("3 \t pyramide");
        System.out.println("4 \t quitter");
        System.out.println("------------------------------------");
    }

    private static void drawSquare(Scanner scanner) {
        System.out.print("entrer un nombre de ligne: ");
        int n = getLineNumber(scanner);

        if (n > 0) {
            System.out.println("Carré dessiné avec " + n + " lignes:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

    private static void drawTriangle(Scanner scanner) {
        System.out.print("entrer un nombre de ligne: ");
        int n = getLineNumber(scanner);

        if (n > 0) {
            System.out.println("Triangle dessiné avec " + n + " lignes:");
            for (int i = 1; i <= n; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

    private static void drawPyramid(Scanner scanner) {
        System.out.print("entrer un nombre de ligne: ");
        int n = getLineNumber(scanner);

        if (n > 0) {
            System.out.println("Pyramide dessinée avec " + n + " lignes:");
            for (int i = 1; i <= n; i++) {
                
                for (int j = 0; j < n - i; j++) {
                    System.out.print(" ");
                }
                
                for (int j = 0; j < 2 * i - 1; j++) {
                    System.out.print("*");
                }
                
                System.out.println();
            }
        }
    }

    private static int getLineNumber(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Entrée invalide. Veuillez entrer un nombre entier positif.");
            scanner.nextLine();
            System.out.print("entrer un nombre de ligne: ");
        }
        int number = scanner.nextInt();
        scanner.nextLine();
        if (number <= 0) {
            System.out.println("Le nombre de lignes doit être supérieur à zéro.");
            return 0;
        }
        return number;
    }
}