# Rapport 16

## Préliminaire

La nomenclature est respectée.

Suspicion de chatGPT pour l'utilisation de la méthode `computeIfAbsent` (mais pas sûr).

## Efficacité

- En termes d'efficacité, cette implémentation ne correspond pas à mes attentes. Le temps d'exécution est d'environ 6,7 ms. Alors qu'avec mon efficacité meilleur je suis à 0,7 ms. Je pense que le problème vient de la méthode `computeIfAbsent` qui est très gourmande en temps d'exécution.

⇒ Le temps d'exécution est donc assez mauvais. Je met donc un 8/10 pour l'efficacité.

## Tests

- Il ne passe aucun tests fournis. (il doit avoir un gros problème avec l'équivalent du `split`)
    - le premier
        
        ![Untitled](./Rapport%2016/Untitled.png)
        
    - le deuxième
        
        ![Untitled](./Rapport%2016/Untitled%201.png)
        
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
    

# Note : 8,5/20

Détail :

- -0 pour le respect de la nomenclature
- -2 car il correspond pas trop à efficacité meilleur (temps d'exécution très mauvais dû à la méthode `computeIfAbsent`)
- -2 x4 car il ne passe aucun test fourni donc -8
- -1 x2 car il ne passe aucun test supplémentaire donc -2
- +0,5 car le test supplémentaire est dur à passer (peut être même faux) => je saurais l'expliquer à l'oral


[Retour](..//Efficacite%CC%81_meilleur.md)