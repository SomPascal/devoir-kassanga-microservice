package TP03.Exercice2;

import java.util.ArrayList;
import java.util.List;

public class E1 {
    public static void main (String[] args){
        List<String>  pays       = new ArrayList<>();
        List<Integer> population = new ArrayList<>();

        pays.add("France");
        pays.add("Allemagne");
        pays.add("Russie");
        pays.add("USA");
        pays.add("Chine");

        population.add(62);
        population.add(82);
        population.add(288);
        population.add(200);
        population.add(1290);

        System.out.println("Liste des pays :");
        System.out.println(pays);

        System.out.println("\nPopulations correspondantes (en millions) :");
        System.out.println(population);

        System.out.println("\n--- Pays et leur population ---");
        for (int i = 0; i < pays.size(); i++) {
            System.out.println(pays.get(i) + " → " + population.get(i) + " millions d'habitants");
        }

    }
}
