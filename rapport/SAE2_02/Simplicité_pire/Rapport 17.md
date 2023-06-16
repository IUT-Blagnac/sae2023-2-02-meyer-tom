# Rapport 17

## Préliminaire

Rien à signaler. La nomenclature est respectée.

## Simplicité

- En termes de simplicité, cette implémentation ne correspond pas entièrement à mes attentes. La fonction manque de commentaires pour faciliter la compréhension et la modification du code. De plus, la syntaxe Java utilisée est complexe.
- Le nom des variables n'est pas explicite. Il faut comprendre le code pour comprendre le rôle de chaque variable mais comme on a du mal à comprendre le code à cause de la syntaxe et du manque de commentaires, cela devient compliqué.

⇒ Il est difficile de comprendre le code d'où le fait qu'il soit en simplicité pire. Donc il répond aux exigences de simplicité pire. Donc je met 10/10 pour la simplicité pire.

## Tests

- Il passe tous les tests fournis. Sauf celui de la chaîne vide. Cela doit être dû au fait que la condition `s.length() == 0` ne fonctionne pas correctement.
    
    ![Untitled](./Rapport%2017/Untitled.png)
    

Parmi les tests supplémentaires :

```sql
// Test avec une chaîne contenant des mots spéciaux
assertEquals(List.of("Bonjour", "le", "monde", "!", "Comment", "ça", "va", "?"), exercice.simplicite.SimpliciteMeilleur.solution("Bonjour le monde! Comment ça va?", List.of("B", "l", "m", "C", "v")));

// Test avec une chaîne contenant des caractères spéciaux
assertEquals(List.of("abc", "def", "ghi", "jkl"), exercice.simplicite.SimpliciteMeilleur.solution("abc@def#ghi$jkl", List.of("a", "d", "g", "j")));
```

- Il ne passe pas le premier test supplémentaire car il ne prend pas en compte les mots spéciaux (ici "!" et "?") dans son `split`.
    
    ![Untitled](./Rapport%2017/Untitled%201.png)
    
- Le second test supplémentaire passe.

# Note : 17,5/20

Détail :

- -0 pour le respect de la nomenclature
- -0 car il correspond bien à la simplicité pire (lecture et compréhension du code très difficile)
- -2 car il ne passe pas le test de la chaîne vide
- -1 car il ne passe pas le premier test supplémentaire
- +0,5 car le test supplémentaire est dur à passer (peut être même faux) => je saurais l'expliquer à l'oral


[Retour](..//Simplicite%CC%81_pire.md)