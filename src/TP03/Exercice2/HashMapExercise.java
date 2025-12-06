package TP03.Exercice2;

import java.util.HashMap;
import java.util.Map;

public class HashMapExercise {
    public static void main(String[] args) {

        Map<String, Integer> populationParPays = new HashMap<>();

        populationParPays.put("France",    62);
        populationParPays.put("Allemagne", 82);
        populationParPays.put("Russie",    288);
        populationParPays.put("USA",       200);
        populationParPays.put("Chine",     1290);

        System.out.println("Population par pays :");
        System.out.println(populationParPays);
        System.out.println();

        String paysMin = null;
        int popMin = Integer.MAX_VALUE;

        for (Map.Entry<String, Integer> entry : populationParPays.entrySet()) {
            if (entry.getValue() < popMin) {
                popMin = entry.getValue();
                paysMin = entry.getKey();
            }
        }
        System.out.println("Pays le moins peuplé : " + paysMin + " → " + popMin + " millions");

        System.out.println("\nPays avec plus de 200 millions d'habitants :");
        boolean trouve = false;
        for (Map.Entry<String, Integer> entry : populationParPays.entrySet()) {
            if (entry.getValue() > 200) {
                System.out.println("• " + entry.getKey() + " : " + entry.getValue() + " millions");
                trouve = true;
            }
        }
        if (!trouve) {
            System.out.println("Aucun pays trouvé.");
        }

//        System.out.println("\n--- Liste complète (ordre alphabétique) ---");
//        populationParPays.entrySet().stream()
//                .sorted(Map.Entry.comparingByKey())
//                .forEach(entry -> System.out.println(entry.getKey() + " → " + entry.getValue() + " millions"));
    }
}
