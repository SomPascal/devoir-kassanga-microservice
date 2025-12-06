package TP03.Exercice1;

public class E1 {
    public static void main(String[] args){
        int[] tabInt = new int[10];

        for (int i = 0; i < tabInt.length; i++) {
            tabInt[i] = (int) (Math.random() * 101);
        }

        System.out.println("Tableau de 10 nombres aléatoires (0 à 100) :");

        for (int nombre : tabInt) {
            System.out.print(nombre + " ");
        }
        System.out.println();
    }
}
