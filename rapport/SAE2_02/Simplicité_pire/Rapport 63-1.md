# Rapport 63-1

## Préliminaire

La nomenclature est respectée.

Suspicion de chatGPT notamment à cause de la forme globale du code et peut être aussi à cause de la syntaxe Java utilisée (mais pas sûr).

## Simplicité

- En termes de simplicité, cette implémentation ne correspond pas du tout à mes attentes. La fonction manque de commentaires pour faciliter la compréhension et la modification du code. De plus, la syntaxe Java utilisée est complexe.
- Le nom des variables n'est pas explicite. Il faut comprendre le code pour comprendre le rôle de chaque variable mais comme on a du mal à comprendre le code à cause de la syntaxe et du manque de commentaires, cela devient compliqué.
- Les indentations ne sont pas respectées du tout ce qui rend le code difficile à lire et à comprend aussi.

⇒ Il est très (très) difficile de comprendre le code d'où le fait qu'il soit en simplicité pire. Félicitations à celui qui a réussi à le faire c'est un 10/10 pour l'instant car il respecte bien la simplicité pire.

## Tests

Il ne passe que 1 tests sur 4 fournis.

- le premier, il a pas une bonne découpe avec la `,`
    
    ![Untitled](./Rapport%2063-1/Untitled.png)
    
- le troisième avec la chaines vide, il a un index out of range
    
    ![Untitled](./Rapport%2063-1/Untitled%201.png)
    
- le quatrième, il a pas une bonne découpe avec la `‘`
    
    ![Untitled](./Rapport%2063-1/Untitled%202.png)
    

Parmi les tests supplémentaires :

```sql
// Test avec une chaîne contenant des mots spéciaux
assertEquals(List.of("Bonjour", "le", "monde", "!", "Comment", "ça", "va", "?"), exercice.simplicite.SimpliciteMeilleur.solution("Bonjour le monde! Comment ça va?", List.of("B", "l", "m", "C", "v")));

// Test avec une chaîne contenant des caractères spéciaux
assertEquals(List.of("abc", "def", "ghi", "jkl"), exercice.simplicite.SimpliciteMeilleur.solution("abc@def#ghi$jkl", List.of("a", "d", "g", "j")));
```

- Il ne passe pas le premier test supplémentaire car il ne prend pas en compte les mots spéciaux (ici "!" et "?") dans son `split`.
    
    ![Untitled](./Rapport%2063-1/Untitled%203.png)
    
- Il ne passe pas le second test supplémentaire car il ne prend pas en compte les caractères spéciaux (ici "@", "#" et "$") dans son `split`.
    
    ![Untitled](./Rapport%2063-1/Untitled%204.png)
    

# Note : 13/20

Détail :

- -0 pour le respect de la nomenclature
- +0,5 car il correspond bien à la simplicité pire (lecture et compréhension du code très difficile) et en plus il y a l'effort de faire la forme globale du code (même si c'est surement chatGPT)
- -2 x3 car il ne passe que 1 test sur 4 fournis (dommage) donc -6
- -1 x2 car il ne passe aucun test supplémentaire donc -2
- +0,5 car le test supplémentaire est dur à passer (peut être même faux) => je saurais l'expliquer à l'oral


[Retour](..//Simplicite%CC%81_pire.md)