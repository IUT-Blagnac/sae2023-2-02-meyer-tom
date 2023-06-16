# Rapport 58

## Préliminaire

La nomenclature est respectée.

Rien à dire de plus.

## Efficacité

- En termes d'efficacité, cette implémentation correspond à mes attentes. Le temps d'exécution est d'environ 0,9 ms. Avec mon efficacité meilleur je suis à 0,7 ms. Donc c'est ce que j'attendais.

⇒ Le temps d'exécution est donc très bon. Le problème c'est que ça correspond à efficacité meilleur. C'est pour ça que je met 5/10 pour l'efficacité pire.

## Tests

- Il passe 3 test sur 4 fournis.
    - Il ne passe pas le test avec une chaîne vide. Je pense qu'il a un problème avec la gestion de la chaîne est vide.
        
        ![Untitled](./Rapport%2044/Untitled.png)
        

Parmi les tests supplémentaires :

```sql
// Test avec une chaîne contenant des mots spéciaux
assertEquals(List.of("Bonjour", "le", "monde", "!", "Comment", "ça", "va", "?"), exercice.simplicite.SimpliciteMeilleur.solution("Bonjour le monde! Comment ça va?", List.of("B", "l", "m", "C", "v")));

// Test avec une chaîne contenant des caractères spéciaux
assertEquals(List.of("abc", "def", "ghi", "jkl"), exercice.simplicite.SimpliciteMeilleur.solution("abc@def#ghi$jkl", List.of("a", "d", "g", "j")));
```

- Le premier test ne passe pas car il ne gère pas les caractères spéciaux de ponctuation.
    
    ![Untitled](./Rapport%2044/Untitled%201.png)
    
- Le deuxième test passe car il gère les caractères spéciaux.

# Note : 12,5/20

Détail :

- -0 pour le respect de la nomenclature
- -5 car il correspond à efficacité meilleur (et non pire)
- -2 car le troisième test (chaîne vide) ne passe pas
- -1 car il ne passe pas le premier test supplémentaire
- +0,5 car le test supplémentaire est dur à passer (peut être même faux) => je saurais l'expliquer à l'oral


[Retour](..//Efficacite%CC%81_pire.md)