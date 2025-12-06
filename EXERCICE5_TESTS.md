# Exercice 5 : Tarification Dégressive - Tests et Résultats

## Description du Programme

Le programme `TarificationDegressive.java` calcule le montant total d'une facture en appliquant un tarif dégressif selon la quantité achetée.

### Barème de Prix

| Quantité | Prix Unitaire |
|----------|---------------|
| ≤ 10 | 150 € |
| 11 - 49 | 135 € |
| ≥ 50 | 110 € |

---

## Tests Effectués

### Test 1 : Quantité = 9 (Tranche 1)
```
Entrée : 9
Prix unitaire : 150 €
Montant total : 1350 €
Calcul : 9 × 150 € = 1350 €
✅ RÉSULTAT CORRECT
```

### Test 2 : Quantité = 12 (Tranche 2)
```
Entrée : 12
Prix unitaire : 135 €
Montant total : 1620 €
Calcul : 12 × 135 € = 1620 €
✅ RÉSULTAT CORRECT
```

### Test 3 : Quantité = 50 (Tranche 3)
```
Entrée : 50
Prix unitaire : 110 €
Montant total : 5500 €
Calcul : 50 × 110 € = 5500 €
✅ RÉSULTAT CORRECT
```

---

## Vérification des Résultats Attendus

| Quantité | Montant Attendu | Montant Obtenu | Statut |
|----------|-----------------|----------------|--------|
| 9 | 1350 € | 1350 € | ✅ |
| 12 | 1620 € | 1620 € | ✅ |
| 50 | 5500 € | 5500 € | ✅ |

---

## Tests Supplémentaires (Cas Limites)

### Test 4 : Quantité = 10 (Limite tranche 1)
```bash
echo "10" | java -cp bin TarificationDegressive
```
**Résultat attendu :** 10 × 150 € = 1500 €

### Test 5 : Quantité = 11 (Début tranche 2)
```bash
echo "11" | java -cp bin TarificationDegressive
```
**Résultat attendu :** 11 × 135 € = 1485 €

### Test 6 : Quantité = 49 (Limite tranche 2)
```bash
echo "49" | java -cp bin TarificationDegressive
```
**Résultat attendu :** 49 × 135 € = 6615 €

---

## Compilation et Exécution

**Compilation :**
```bash
javac src/TarificationDegressive.java -d bin/
```

**Exécution :**
```bash
java -cp bin TarificationDegressive
```

---

## Conclusion

✅ Le programme fonctionne correctement pour tous les tests requis  
✅ La logique de tarification dégressive est correctement implémentée  
✅ Les calculs sont exacts et correspondent aux résultats attendus
