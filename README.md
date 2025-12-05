# Exercices Java - Guide d'utilisation

Ce projet contient 8 programmes Java répondant à 4 exercices différents.

## 📋 Liste des Programmes

### Exercice 1 : Bonjour et Opérations Arithmétiques
- `Bonjour.java` - Salutation personnalisée (Scanner)
- `BonjourJOptionPane.java` - Salutation personnalisée (GUI)
- `Elementaire.java` - Opérations arithmétiques (Scanner)
- `ElementaireJOptionPane.java` - Opérations arithmétiques (GUI)

### Exercice 2 : Tarif Réduit
- `TarifReduit.java` - Vérification tarif réduit (< 26 ans)
- `TarifReduitEtendu.java` - Vérification tarif réduit (< 26 ou > 65 ans)

### Exercice 3 : Départements
- `Departements.java` - Vérification Île-de-France avec validation

### Exercice 4 : Signe du Produit
- `ProduitSigne.java` - Détermine le signe sans calculer le produit

### Exercice 5 : Tarification Dégressive
- `TarificationDegressive.java` - Calcul de facture avec tarif dégressif

### Exercice 6 : Compteur
- `Compteur.java` - Compte de 1 jusqu'à un nombre choisi

### Exercice 7 : Pair ou Impair
- `PairOuImpair.java` - Détecte pair/impair et affiche les 10 suivants

### Exercice 8 : Multiple
- `Multiple.java` - Affiche les multiples d'un nombre

### Exercice 9 : Devinette
- `Devinette.java` - Jeu de devinette avec nombre aléatoire

## 🚀 Compilation

Pour compiler tous les programmes :

```bash
javac src/*.java -d bin/
```

## ▶️ Exécution

### Programmes en console (Scanner)

```bash
# Exercice 1a
java -cp bin Bonjour

# Exercice 1b
java -cp bin Elementaire

# Exercice 2
java -cp bin TarifReduit
java -cp bin TarifReduitEtendu

# Exercice 3
java -cp bin Departements

# Exercice 4
java -cp bin ProduitSigne

# Exercice 5
java -cp bin TarificationDegressive

# Exercice 6
java -cp bin Compteur

# Exercice 7
java -cp bin PairOuImpair

# Exercice 8
java -cp bin Multiple

# Exercice 9
java -cp bin Devinette
```

### Programmes avec interface graphique (JOptionPane)

```bash
# Exercice 1a (GUI)
java -cp bin BonjourJOptionPane

# Exercice 1b (GUI)
java -cp bin ElementaireJOptionPane
```

> **Note:** Les programmes JOptionPane nécessitent un environnement graphique.

## 📝 Exemples d'utilisation

### Bonjour.java
```
Veuillez saisir votre nom : Dupont
Bonjour dupont
```

### Elementaire.java
```
Entrez le premier entier : 10
Entrez le deuxième entier : 5

=== Résultats ===
Somme : 10 + 5 = 15
Différence : 10 - 5 = 5
Produit : 10 × 5 = 50
Quotient : 10 ÷ 5 = 2
```

### TarifReduitEtendu.java
```
Quel est votre âge ? 70
Vous avez droit au tarif réduit !
```

### Departements.java
```
Entrez votre numéro de département : 75
Vous habitez en Île-de-France.
```

### ProduitSigne.java
```
Chiffre 1 --> -2
Chiffre 2 --> 5
----- produit négatif
```

### TarificationDegressive.java
```
Entrez la quantité d'articles désirée : 12

=== Facture ===
Quantité : 12
Prix unitaire : 135 €
Montant total : 1620 €
(12 × 135 € = 1620 €)
```

### Compteur.java
```
Jusqu'à quel nombre voulez-vous compter ? 20

Comptage de 1 à 20 :
1 - 2 - 3 - 4 - 5 - 6 - 7 - 8 - 9 - 10 - 11 - 12 - 13 - 14 - 15 - 16 - 17 - 18 - 19 - 20
```

### PairOuImpair.java
```
Veuillez saisir un chiffre : 10

> nombre pair
> 10 - 12 - 14 - 16 - 18 - 20 - 22 - 24 - 26 - 28
```

### Multiple.java
```
De quel nombre voulez-vous afficher les multiples ? 5
Jusqu'à quel nombre maximum ? 50

Multiples de 5 jusqu'à 50 :
5 - 10 - 15 - 20 - 25 - 30 - 35 - 40 - 45 - 50
```

### Devinette.java
```
=== JEU DE DEVINETTE ===
Devinez le nombre entre 1 et 10 !

Votre proposition : 5
🎉 Bravo ! Vous avez trouvé le nombre 5 !
Nombre d'essais : 1
Incroyable ! Du premier coup !
```

## 🎯 Concepts Java Couverts

- ✅ Entrée utilisateur (Scanner et JOptionPane)
- ✅ Manipulation de chaînes
- ✅ Opérations arithmétiques
- ✅ Instructions conditionnelles (if/else)
- ✅ Opérateurs logiques (||, &&)
- ✅ Validation des entrées
- ✅ Raisonnement logique
- ✅ Boucles (for, do-while)
- ✅ Opérateur modulo (%)
- ✅ Génération de nombres aléatoires
- ✅ Compteurs et accumulateurs

## 📁 Structure du Projet

```
DevoirMicroservice/
├── src/
│   ├── Bonjour.java
│   ├── BonjourJOptionPane.java
│   ├── Elementaire.java
│   ├── ElementaireJOptionPane.java
│   ├── TarifReduit.java
│   ├── TarifReduitEtendu.java
│   ├── Departements.java
│   ├── ProduitSigne.java
│   ├── TarificationDegressive.java
│   ├── Compteur.java
│   ├── PairOuImpair.java
│   ├── Multiple.java
│   └── Devinette.java
├── bin/
│   └── (fichiers .class compilés)
└── README.md
```

## ✅ Tests Effectués

Tous les programmes ont été testés et fonctionnent correctement :
- ✓ Compilation sans erreurs (13 programmes)
- ✓ Exécution avec entrées valides
- ✓ Validation des entrées (Departements.java)
- ✓ Logique conditionnelle correcte
- ✓ Boucles fonctionnant correctement
- ✓ Affichage formaté et clair
