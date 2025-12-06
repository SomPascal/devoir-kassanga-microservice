package TP03.Exercice1;

import java.util.ArrayList;
import java.util.List;

public class E4 {
    public static void main(String[] args) {

        List<Integer> listEntier      = new ArrayList<>();
        List<Integer> listEntierPair  = new ArrayList<>();
        List<Integer> listEntierImpair = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int aleatoire = (int) (Math.random() * 101);
            listEntier.add(aleatoire);
        }

        for (int nombre : listEntier) {
            if (nombre % 2 == 0) {
                listEntierPair.add(nombre);
            } else {
                listEntierImpair.add(nombre);
            }
        }

        System.out.println("Tableau principal (10 nombres) :");
        System.out.println(listEntier);

        System.out.println("\nNombres pairs (" + listEntierPair.size() + ") :");
        System.out.println(listEntierPair);

        System.out.println("\nNombres impairs (" + listEntierImpair.size() + ") :");
        System.out.println(listEntierImpair);
    }
}
