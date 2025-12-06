package TP03.Exercice2;

import java.util.ArrayList;
import java.util.List;

public class E3 {
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

        System.out.println("\nPays ayant une population supérieure à 200 millions :");

        boolean auMoinsUn = false;

        for (int i = 0; i < population.size(); i++) {
            if (population.get(i) > 200) {
                System.out.println("- " + pays.get(i)
                        + " : " + population.get(i) + " millions d'habitants");
                auMoinsUn = true;
            }
        }

        if (!auMoinsUn) {
            System.out.println("Aucun pays dans la liste n'a plus de 200 millions d'habitants.");
        }
    }
}
