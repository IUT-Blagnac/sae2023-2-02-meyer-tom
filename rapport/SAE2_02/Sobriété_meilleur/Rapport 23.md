# Rapport 23

## Préliminaire

La nomenclature n'est pas respectée (trierMots au lieu de solution)

## Sobriété

- En termes de sobriété, ça correspond bien à la sobriété meilleur car on utilise un tableau de listes de mots pour chaque lettre de l'alphabet donné (prend moins de place car limité a 26) et on parcourt chaque mot pour l'ajouter à la liste correspondante dans le tableau.
- Il n'utilise pas de mémoire (grâce principalement au garbage collector) et il n'utilise pas de fonctions complexes comme `split` ou sort qui sont en O(n log n).
- On peut également trouver une complexité en O(n) car on parcourt chaque mot pour l'ajouter à la liste correspondante dans le tableau.

⇒ Donc il correspond bien à la sobriété meilleur car il utilise peu/pas de mémoire, il a une bonne complexité. Je met donc 10/10 pour la sobriété.

## Tests

Il ne passe aucun tests fournis. Il a des problèmes partout :

- il doit avoir un gros problème avec ses boucles car il a souvent des `IndexOutOfBoundsException`
- il a un problème avec la découpe des mots car il ne découpe pas les mots correctement
- Même quand il n'y a pas d'erreurs, il ne renvoie pas le résultat sous la forme attendue
    - chaine simple avec ordre complet
        
        ![Untitled](./Rapport%2023/Untitled.png)
        
    - chaine à 1 mot
        
        ![Untitled](./Rapport%2023/Untitled%201.png)
        
    - chaine vide
        
        ![Untitled](./Rapport%2023/Untitled%202.png)
        
    - chaine donnée en exemple
        
        ![Untitled](./Rapport%2023/Untitled%203.png)
        

Parmi les tests supplémentaires :

```sql
// Test avec une chaîne contenant des mots spéciaux
assertEquals(List.of("Bonjour", "le", "monde", "!", "Comment", "ça", "va", "?"), exercice.simplicite.SimpliciteMeilleur.solution("Bonjour le monde! Comment ça va?", List.of("B", "l", "m", "C", "v")));

// Test avec une chaîne contenant des caractères spéciaux
assertEquals(List.of("abc", "def", "ghi", "jkl"), exercice.simplicite.SimpliciteMeilleur.solution("abc@def#ghi$jkl", List.of("a", "d", "g", "j")));
```

- Le premier test ne passe pas car il ne gère les caractères spéciaux de ponctuation.
    
    ![Untitled](./Rapport%2023/Untitled%204.png)
    
- Le deuxième test passe car il gère les caractères spéciaux.
    
    ![Untitled](./Rapport%2023/Untitled%205.png)
    

# Note : 9,5/20

Détail :

- -1 car il n'a pas respecté la nomenclature attendue
- -0 car il correspond bien à la sobriété meilleur
- -2 x4 car il ne passe aucun test fourni donc -8
- -1 x2 car il ne passe aucun test supplémentaire donc -2
- +0,5 car le test supplémentaire est dur à passer (peut être même faux) => je saurais l'expliquer à l'oral


[Retour](..//Sobrie%CC%81te%CC%81_meilleur.md)