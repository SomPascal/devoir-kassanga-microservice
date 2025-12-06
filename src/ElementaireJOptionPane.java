import javax.swing.JOptionPane;

/**
 * EXERCICE 1b - Version JOptionPane
 * Programme qui lit deux entiers et affiche leur somme, différence, produit et
 * quotient
 */
public class ElementaireJOptionPane {
    public static void main(String[] args) {
        String input1 = JOptionPane.showInputDialog("Entrez le premier entier :");
        int nombre1 = Integer.parseInt(input1);

        String input2 = JOptionPane.showInputDialog("Entrez le deuxième entier :");
        int nombre2 = Integer.parseInt(input2);

        String resultat = "=== Résultats ===\n\n" +
                "Somme : " + nombre1 + " + " + nombre2 + " = " + (nombre1 + nombre2) + "\n" +
                "Différence : " + nombre1 + " - " + nombre2 + " = " + (nombre1 - nombre2) + "\n" +
                "Produit : " + nombre1 + " × " + nombre2 + " = " + (nombre1 * nombre2) + "\n" +
                "Quotient : " + nombre1 + " ÷ " + nombre2 + " = " + (nombre1 / nombre2);

        JOptionPane.showMessageDialog(null, resultat);
    }
}
