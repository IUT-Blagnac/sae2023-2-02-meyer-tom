# Rapport 66

## Préliminaire

Respect de la nomenclature

Rien à dire de plus

## Sobriété

- En termes de sobriété, ça correspond bien à la sobriété meilleur car il n'utilise pas de mémoire (grâce principalement au garbage collector)
- Il a une complexité globale de O(n) car il utilise la fonction `split` qui a une complexité de O(n log n) mais le reste du code a une complexité de O(n) donc la complexité globale est de O(n)

⇒ Donc il correspond bien à la sobriété meilleur car il utilise peu/pas de mémoire, il a une bonne complexité. Je met donc 10/10 pour la sobriété.

## Tests

Il passe tout les tests fournis. Il n'a pas de problèmes.

Parmi les tests supplémentaires :

```sql
// Test avec une chaîne contenant des mots spéciaux
assertEquals(List.of("Bonjour", "le", "monde", "!", "Comment", "ça", "va", "?"), exercice.simplicite.SimpliciteMeilleur.solution("Bonjour le monde! Comment ça va?", List.of("B", "l", "m", "C", "v")));

// Test avec une chaîne contenant des caractères spéciaux
assertEquals(List.of("abc", "def", "ghi", "jkl"), exercice.simplicite.SimpliciteMeilleur.solution("abc@def#ghi$jkl", List.of("a", "d", "g", "j")));
```

- Il ne passe pas le premier test supplémentaire car il ne gère pas les caractères spéciaux de ponctuation.
    
    ![Untitled](./Rapport%2066/Untitled.png)
    
- Il passe le deuxième test supplémentaire car il gère les caractères spéciaux (plus général).

# Note : 19,5/20

Détail :

- -0 pour le respect de la nomenclature
- -0 car il correspond bien à la sobriété meilleur
- -0 car il passe tout les tests fournis
- -1 car il ne passe pas le premier test supplémentaire
- +0,5 car le test supplémentaire est dur à passer (peut être même faux) => je saurais l'expliquer à l'oral


[Retour](..//Sobrie%CC%81te%CC%81_meilleur.md)