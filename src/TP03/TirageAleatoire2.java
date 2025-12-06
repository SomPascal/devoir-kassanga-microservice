package TP03;

public class TirageAleatoire2 {
    public static void main(String[] args){

        int nbre1 = 0;
        int nbre2 = 0;
        int nbre3 = 0;
        int compteur = 0;

        do{
            nbre1 = 1 + (int) (Math.random() * 1000);
            nbre2 = 1 + (int) (Math.random() * 1000);
            nbre3 = 1 + (int) (Math.random() * 1000);
            compteur++;
            System.out.println(nbre1 + " % 2 = " + nbre1 % 2);
            System.out.println(nbre2 + " % 2 = " + nbre2 % 2);
            System.out.println(nbre3 + " % 2 = " + nbre3 % 2);

        }while(nbre1 % 2 != 0 || nbre2 % 2 == 0 || nbre3 % 2 == 0);

        System.out.println("==================================");
        System.out.println("Nombre 1: " + nbre1);
        System.out.println("Nombre 2: " + nbre2);
        System.out.println("Nombre 3: " + nbre3);
        System.out.println("Resultat obtenu en " + compteur + " coups!");
        System.out.println("==================================");
    }
}
