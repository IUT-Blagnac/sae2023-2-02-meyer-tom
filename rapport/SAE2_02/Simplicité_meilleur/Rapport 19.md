# Rapport 19

## Préliminaire

Rien à signaler. La nomenclature est respectée.

## Simplicité

En termes de simplicité, cette implémentation correspond à mes attentes. Il découpe le code en plusieurs fonctions pour faciliter la compréhension et la modification du code. De plus, la syntaxe Java utilisée est simple.

Il y a également la `JavaDoc` qui permet de comprendre rapidement le rôle de chaque fonction.

Il manque cependant des commentaires dans les fonctions pour expliquer le code plus en détail. Mais cela n'est pas nécessaire pour comprendre le code car le code des fonctions est petit et simple donc la `JavaDoc` suffit. Je met donc 10/10 pour la simplicité

## Tests

- Il passe tous les tests fournis.

Parmi les tests supplémentaires :

```sql
// Test avec une chaîne contenant des mots spéciaux
assertEquals(List.of("Bonjour", "le", "monde", "!", "Comment", "ça", "va", "?"), exercice.simplicite.SimpliciteMeilleur.solution("Bonjour le monde! Comment ça va?", List.of("B", "l", "m", "C", "v")));

// Test avec une chaîne contenant des caractères spéciaux
assertEquals(List.of("abc", "def", "ghi", "jkl"), exercice.simplicite.SimpliciteMeilleur.solution("abc@def#ghi$jkl", List.of("a", "d", "g", "j")));
```

- Il ne passe pas le premier test supplémentaire car il ne prend pas en compte les mots spéciaux (ici "!" et "?").
    
    ![Untitled](./Rapport%2019/Untitled.png)
    
- Le second test supplémentaire passe.

# Note : 19,5/20

Détail :

- -0 pour le respect de la nomenclature
- -0 car le programme correspond bien à simplicité meilleur
- -1 pour le premier test supplémentaire ne passe pas
- +0,5 pour car le test supplémentaire est dur à passer (peut être même faux) => je saurais l'expliquer à l'oral


[Retour](..//Simplicite%CC%81_meilleur.md)