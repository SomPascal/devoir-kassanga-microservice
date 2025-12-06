package TP03.Exercice1;

public class E3 {
    public static void main(String[] args) {

        int[] tabInt = new int[10];

        for (int i = 0; i < tabInt.length; i++) {
            tabInt[i] = (int) (Math.random() * 101);
        }

        System.out.println("Tableau principal :");
        System.out.print("[ ");
        for (int i = 0; i < tabInt.length; i++) {
            System.out.print(tabInt[i]);
            if (i < tabInt.length - 1) System.out.print(", ");
        }
        System.out.println(" ]\n");

        int[] tabPair  = new int[10];
        int[] tabImpair = new int[10];

        int countPair = 0;
        int countImpair = 0;

        for (int i = 0; i < tabInt.length; i++) {
            if (tabInt[i] % 2 == 0) {
                tabPair[countPair] = tabInt[i];
                countPair++;
            } else {
                tabImpair[countImpair] = tabInt[i];
                countImpair++;
            }
        }

        System.out.println("Nombres pairs (" + countPair + ") :");
        System.out.print("[ ");
        for (int i = 0; i < countPair; i++) {
            System.out.print(tabPair[i]);
            if (i < countPair - 1) System.out.print(", ");
        }
        System.out.println(" ]");

        System.out.println("\nNombres impairs (" + countImpair + ") :");
        System.out.print("[ ");
        for (int i = 0; i < countImpair; i++) {
            System.out.print(tabImpair[i]);
            if (i < countImpair - 1) System.out.print(", ");
        }
        System.out.println(" ]");
    }
}
