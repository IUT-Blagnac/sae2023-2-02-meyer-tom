# Rapport 20

## Préliminaire

Respect de la nomenclature

Rien à dire de plus

## Sobriété

- En termes de sobriété, ça correspond bien à la sobriété meilleur car il n'utilise pas de mémoire (grâce principalement au garbage collector)
- Il n'utilise pas de mémoire (grâce principalement au garbage collector) et il n'utilise pas de fonctions complexes comme `split` ou sort qui sont en O(n log n).

⇒ Donc il correspond bien à la sobriété meilleur car il utilise peu/pas de mémoire, il a une bonne complexité. Le problème c'est que comme il correspond à la sobriété meilleur, il ne correspond pas du tout à la sobriété pire. Je met donc 5/10 pour la sobriété.

## Tests

Il passe 2 tests fournis sur 4. Il a un problème notamment avec son regex

- premier test : il ne passe pas car il ne gère pas les ","
    
    ![Untitled](./Rapport%2020/Untitled.png)
    
- troisième test : il a un index out of bound exception
    
    ![Untitled](./Rapport%2020/Untitled%201.png)
    

Parmi les tests supplémentaires :

```sql
// Test avec une chaîne contenant des mots spéciaux
assertEquals(List.of("Bonjour", "le", "monde", "!", "Comment", "ça", "va", "?"), exercice.simplicite.SimpliciteMeilleur.solution("Bonjour le monde! Comment ça va?", List.of("B", "l", "m", "C", "v")));

// Test avec une chaîne contenant des caractères spéciaux
assertEquals(List.of("abc", "def", "ghi", "jkl"), exercice.simplicite.SimpliciteMeilleur.solution("abc@def#ghi$jkl", List.of("a", "d", "g", "j")));
```

- Il ne passe pas le premier test supplémentaire car il ne gère pas les caractères spéciaux de ponctuation
    
    ![Untitled](./Rapport%2020/Untitled%202.png)
    
- Il ne passe pas le deuxième test supplémentaire car il a une gère pas les caractères spéciaux (général)
    
    ![Untitled](./Rapport%2020/Untitled%203.png)
    

# Note : 9,5/20

Détail :

- -0 pour le respect de la nomenclature
- -0 car il correspond bien à la sobriété meilleur
- -2 x4 car il ne passe aucun test fourni donc -8
- -1 x2 car il ne passe aucun test supplémentaire donc -2
- +0,5 car le test supplémentaire est dur à passer (peut être même faux) => je saurais l'expliquer à l'oral


[Retour](..//Sobrie%CC%81te%CC%81_pire.md)