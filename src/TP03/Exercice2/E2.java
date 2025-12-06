package TP03.Exercice2;

import java.util.ArrayList;
import java.util.List;

public class E2 {
    public static void main (String[] args){
        List<String> pays       = new ArrayList<>();
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

        int indiceMin = 0;

        for (int i = 1; i < population.size(); i++) {
            if (population.get(i) < population.get(indiceMin)) {
                indiceMin = i;
            }
        }

        String paysLeMoinsPeuple = pays.get(indiceMin);
        int populationMin = population.get(indiceMin);

        System.out.println("\nLe pays ayant la population la plus faible est :");
        System.out.println(paysLeMoinsPeuple + " avec " + populationMin + " millions d'habitants");
    }
}
