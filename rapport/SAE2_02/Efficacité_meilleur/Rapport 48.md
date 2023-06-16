# Rapport 48

## Préliminaire

La nomenclature est respectée.

Rien à dire de plus.

## Efficacité

- En termes d'efficacité, cette implémentation correspond à mes attentes. Le temps d'exécution est d'environ 1,5 ms. Avec mon efficacité meilleur je suis à 0,7 ms. Donc c'est un peu moins bien mais c'est très proche de ce que j'attendais.

⇒ Le temps d'exécution est donc très bon. Je met donc un 10/10 pour l'efficacité.

## Tests

Il passe que 1 test sur 4 fournis. (j'ai du mal à voir où est le problème, je pense que l'équivalent du `split` y est pour quelque chose et j'ai aussi l'impression qu'il place mal les mots dans la liste de sortie donc soit liée au `split` soit liée à la méthode `contains` (je pense))

- le premier
    
    ![Untitled](./Rapport%2016/Untitled.png)
    
- le troisième (il ne gère pas le cas de chaine vide)
    
    ![Untitled](./Rapport%2016/Untitled%202.png)
    
- le quatrième
    
    ![Untitled](./Rapport%2016/Untitled%203.png)
    

Parmi les tests supplémentaires :

```sql
// Test avec une chaîne contenant des mots spéciaux
assertEquals(List.of("Bonjour", "le", "monde", "!", "Comment", "ça", "va", "?"), exercice.simplicite.SimpliciteMeilleur.solution("Bonjour le monde! Comment ça va?", List.of("B", "l", "m", "C", "v")));

// Test avec une chaîne contenant des caractères spéciaux
assertEquals(List.of("abc", "def", "ghi", "jkl"), exercice.simplicite.SimpliciteMeilleur.solution("abc@def#ghi$jkl", List.of("a", "d", "g", "j")));
```

- Il ne passe pas le premier test supplémentaire car il ne prend pas en compte les mots spéciaux (ici "!" et "?") dans son `split`.
    
    ![Untitled](./Rapport%2016/Untitled%204.png)
    
- Il ne passe pas le second test supplémentaire car il ne prend pas en compte les caractères spéciaux (ici "@", "#" et "$") dans son `split`.
    
    ![Untitled](./Rapport%2016/Untitled%205.png)
    

# Note : 12,5/20

Détail :

- -0 pour le respect de la nomenclature
- -0 car il correspond à efficacité meilleur (temps d'exécution très bon)
- -2 x3 car il que 1 test sur 4 fournis donc -6
- -1 x2 car il ne passe aucun test supplémentaire donc -2
- +0,5 car le test supplémentaire est dur à passer (peut être même faux) => je saurais l'expliquer à l'oral


[Retour](..//Efficacite%CC%81_meilleur.md)