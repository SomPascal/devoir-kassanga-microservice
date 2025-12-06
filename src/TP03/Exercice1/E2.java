package TP03.Exercice1;

public class E2 {
    public static void main(String[] args){
        int[] tabInt = new int[10];
        int somme = 0;
        int produit = 1;
        int min = 0;
        int max = 0;

        for (int i = 0; i < tabInt.length; i++) {
            tabInt[i] = (int) (Math.random() * 101);
        }

        min = tabInt[0];
        max = tabInt[0];

        System.out.println("Tableau de 10 nombres aléatoires (0 à 100) :");

        for (int nombre : tabInt) {
            System.out.print(nombre + " ");
        }
        System.out.println();

        for(int nbre : tabInt) {
            somme += nbre;
            produit = nbre * produit;

            if(min > nbre){
                min = nbre;
            }
            if(max < nbre){
                max = nbre;
            }
        }

        System.out.println("La somme du tableau est: " + somme);
        System.out.println("Le produit du tableau est: " + produit);
        System.out.println("Le min du tableau est: " + min);
        System.out.println("Le max du tableau est: " + max);
    }
}
