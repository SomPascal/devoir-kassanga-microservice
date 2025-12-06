# TP2 - Méthodes String : Guide d'utilisation

## 📋 Liste des Programmes TP2

### Manipulation de Chaînes de Caractères

1. **GroupeVerbe.java** - Identifie le groupe d'un verbe (1er, 2ème, 3ème)
2. **LongueurPhrase.java** - Catégorise une phrase selon sa longueur
3. **AnalyseMot.java** - Analyse un mot (première/dernière lettre, longueur)
4. **FormatageNomPrenom.java** - Formate nom et prénom correctement
5. **CouperPhrase.java** - Tronque une phrase à 10 caractères
6. **NomsComposes.java** - Gère les noms composés avec tirets
7. **Palindrome.java** - Détecte les palindromes
8. **NombresAmis.java** - Vérifie si deux nombres sont "amis"

---

## 🚀 Compilation

```bash
javac src/GroupeVerbe.java src/LongueurPhrase.java src/AnalyseMot.java \
      src/FormatageNomPrenom.java src/CouperPhrase.java src/NomsComposes.java \
      src/Palindrome.java src/NombresAmis.java -d bin/
```

---

## ▶️ Exécution

```bash
# Exercice 1
java -cp bin GroupeVerbe

# Exercice 2
java -cp bin LongueurPhrase

# Exercice 3
java -cp bin AnalyseMot

# Exercice 4
java -cp bin FormatageNomPrenom

# Exercice 5
java -cp bin CouperPhrase

# Exercice 6
java -cp bin NomsComposes

# Exercice 7
java -cp bin Palindrome

# Exercice 8
java -cp bin NombresAmis
```

---

## 📝 Exemples d'utilisation

### GroupeVerbe.java
```
Entrez un verbe : manger
Ce verbe appartient au 1er groupe.
```

### LongueurPhrase.java
```
Entrez une phrase : Bonjour tout le monde

Longueur de la phrase : 21 caractères
→ Phrase de longueur moyenne
```

### AnalyseMot.java
```
Entrez un mot : Java

=== Analyse du mot ===
Première lettre : J
Dernière lettre : a
Nombre de lettres : 4
```

### FormatageNomPrenom.java
```
Entrez votre nom : kEYnEs
Entrez votre prénom : jOHn

KEYNES (6) John (4)
```

### CouperPhrase.java
```
Entrez une phrase : je réalise un exercice sur les chaines de caractères

Phrase coupée : je réalise...
```

### NomsComposes.java
```
Entrez votre nom : MARTIN
Entrez votre prénom : jean-paul

MARTIN (6) Jean-Paul (9)
```

### Palindrome.java
```
Entrez un mot : radar

✓ "radar" est un palindrome !
```

### NombresAmis.java
```
Entrez le premier nombre : 1232
Entrez le deuxième nombre : 71

Nombre 1 → 1232 (somme des chiffres : 8)
Nombre 2 → 71 (somme des chiffres : 8)

✓ Ces 2 nombres sont amis !
```

---

## 🎯 Méthodes String Utilisées

| Méthode | Description | Exercice |
|---------|-------------|----------|
| `endsWith()` | Vérifie la fin d'une chaîne | GroupeVerbe |
| `length()` | Nombre de caractères | LongueurPhrase, AnalyseMot |
| `charAt()` | Accès à un caractère | AnalyseMot, Palindrome |
| `toUpperCase()` | Conversion en majuscules | FormatageNomPrenom |
| `toLowerCase()` | Conversion en minuscules | FormatageNomPrenom |
| `substring()` | Extraction de sous-chaîne | FormatageNomPrenom, CouperPhrase |
| `split()` | Séparation par délimiteur | NomsComposes |
| `contains()` | Vérification de contenu | NomsComposes |
| `String.valueOf()` | Conversion en String | NombresAmis |
| `Character.getNumericValue()` | Conversion char → int | NombresAmis |

---

## ✅ Tests Effectués

Tous les programmes ont été testés et fonctionnent correctement :
- ✓ Compilation sans erreurs (8 programmes TP2)
- ✓ Méthodes String correctement utilisées
- ✓ Gestion des cas limites
- ✓ Formatage et affichage corrects
- ✓ Logique algorithmique validée (palindrome, somme de chiffres)
