import javax.swing.JOptionPane;

/**
 * EXERCICE 1a - Version JOptionPane
 * Programme qui demande le nom de l'utilisateur et affiche un message personnalisé
 */
public class BonjourJOptionPane {
    public static void main(String[] args) {
        String nom = JOptionPane.showInputDialog("Veuillez saisir votre nom :");
        
        if (nom != null && !nom.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Bonjour " + nom.toLowerCase());
        } else {
            JOptionPane.showMessageDialog(null, "Aucun nom saisi !");
        }
    }
}
