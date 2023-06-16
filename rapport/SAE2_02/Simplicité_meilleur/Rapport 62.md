# Rapport 62

## Préliminaire

Rien à signaler. La nomenclature est respectée.

## Simplicité

En termes de simplicité, cette implémentation ne correspond pas entièrement à mes attentes. La fonction manque de commentaires pour faciliter la compréhension et la modification du code. De plus, la syntaxe Java utilisée est complexe.

Une confusion est également présente avec l'utilisation de `word.sort`. Nous le verrons plus en détail dans les tests. Donc je met 9/10 pour la simplicité

## Tests

Il passe les 2 premiers tests

- Il ne passe pas le troisième. La condition `str.isEmpty()` n'a pas l'air de fonctionner.
    
    ![Untitled](./Rapport%2062/Untitled.png)
    
- Il ne passe pas le quatrième. Le `word.sort` ne fonctionne pas correctement. Il ne trie pas les mots dans l'ordre attendu.
    
    ![Untitled](./Rapport%2062/Untitled%201.png)
    

Parmi les tests supplémentaires :

```java
// Test avec une chaîne contenant des mots spéciaux
assertEquals(List.of("Bonjour", "le", "monde", "!", "Comment", "ça", "va", "?"), exercice.simplicite.SimpliciteMeilleur.solution("Bonjour le monde! Comment ça va?", List.of("B", "l", "m", "C", "v")));

// Test avec une chaîne contenant des caractères spéciaux
assertEquals(List.of("abc", "def", "ghi", "jkl"), exercice.simplicite.SimpliciteMeilleur.solution("abc@def#ghi$jkl", List.of("a", "d", "g", "j")));
```

- Il ne passe pas le cinquième. Il prend bien en compte les mots spéciaux (ici "!" et "?") mais ne les tries pas correctement.
    
    ![Untitled](./Rapport%2062/Untitled%202.png)
    
- Il ne passe pas le sixième. Il prend en compte les caractères spéciaux alors qu'il ne devrait pas.
    
    ![Untitled](./Rapport%2062/Untitled%203.png)
    

# Note : 13,5/20

Détail :

- -0 pour le respect de la nomenclature
- -1 pour la “non-simplicité” du code
- -1 x2 pour mes tests qui ne marchent pas donc -2
- -2 x2 pour les tests fournis qui ne marchent pas donc -4
- +0,5 car le test supplémentaire est dur à passer (peut être même faux) => je saurais l'expliquer à l'oral


[Retour](..//Simplicite%CC%81_meilleur.md)