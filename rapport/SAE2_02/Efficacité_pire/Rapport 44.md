# Rapport 44

## Préliminaire

La nomenclature est respectée.

Rien à dire de plus.

## Efficacité

- En termes d'efficacité, cette implémentation correspond pas du tout à mes attentes. Le temps d'exécution est d'environ 15 secondes. Avec mon efficacité meilleur je suis à 0,7 ms. Donc c'est très loin de ce que j'attendais.

⇒ Le temps d'exécution est donc très mauvais. Cependant, les boucles for imbriquées ne sont pas utiles. Elles ne font rien donc ça correspond pas exactement à l'efficacité pire que je voyais plus sur quelque chose qui fait beaucoup de calculs utiles. C'est pour ça que je met 9/10 pour l'efficacité.

## Tests

- Il passe 3 test sur 4 fournis.
    - Il ne passe pas le test avec une chaîne vide. Je pense que c'est parce qu'il ne gère pas le cas de la chaîne est vide.
        
        ![Untitled](./Rapport%2044/Untitled.png)
        

Parmi les tests supplémentaires :

```sql
// Test avec une chaîne contenant des mots spéciaux
assertEquals(List.of("Bonjour", "le", "monde", "!", "Comment", "ça", "va", "?"), exercice.simplicite.SimpliciteMeilleur.solution("Bonjour le monde! Comment ça va?", List.of("B", "l", "m", "C", "v")));

// Test avec une chaîne contenant des caractères spéciaux
assertEquals(List.of("abc", "def", "ghi", "jkl"), exercice.simplicite.SimpliciteMeilleur.solution("abc@def#ghi$jkl", List.of("a", "d", "g", "j")));
```

- Le premier test ne passe pas car il ne gère les caractères spéciaux de ponctuation.
    
    ![Untitled](./Rapport%2044/Untitled%201.png)
    
- Le deuxième test passe car il gère les caractères spéciaux.

# Note : 16,5/20

Détail :

- -0 pour le respect de la nomenclature
- -1 car il correspond à efficacité pire (temps d'exécution très mauvais mais correspond pas tout à fait à mes attentes de efficacité pire)
- -2 car le troisième test (chaîne vide) ne passe pas
- -1 car il ne passe pas le premier test supplémentaire
- +0,5 car le test supplémentaire est dur à passer (peut être même faux) => je saurais l'expliquer à l'oral


[Retour](..//Efficacite%CC%81_pire.md)