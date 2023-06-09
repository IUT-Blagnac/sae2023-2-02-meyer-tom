package exercice.simplicite;

import java.util.*;

public class SimpliciteMeilleur2 {
    public static List<String> solution(String str, List<Character> ordre) {
        if (str.isEmpty()) {
            return Collections.emptyList();
        }

        List<String> words = new ArrayList<>();
        String[] wordArray = str.split("\\s+");
        for (String word : wordArray) {
            if (word.endsWith(",")) {
                word = word.substring(0, word.length() - 1);
            }
            String[] subWords = word.split("'");
            for (String subWord : subWords) {
                words.add(subWord);
            }
        }

        words.sort((a, b) -> {
            int minLength = Math.min(a.length(), b.length());
            for (int i = 0; i < minLength; i++) {
                char charA = Character.toLowerCase(a.charAt(i));
                char charB = Character.toLowerCase(b.charAt(i));
                int indexA = ordre.indexOf(charA);
                int indexB = ordre.indexOf(charB);
                if (indexA == -1 && indexB == -1) {
                    continue;
                } else if (indexA == -1) {
                    return 1;
                } else if (indexB == -1) {
                    return -1;
                } else if (indexA != indexB) {
                    return Integer.compare(indexA, indexB);
                }
            }
            return Integer.compare(a.length(), b.length());
        });

        return words;
    }

    /*
     * Préléminaire :
     * Rien à signaler. La nomenclature est respectée.
     * 
     * Simplicité :
     * En termes de simplicité, cette implémentation ne correspond pas entièrement à mes attentes. La fonction manque de commentaires pour faciliter la compréhension et la modification du code. De plus, la syntaxe Java utilisée est complexe.
     * Une confusion est également présente avec l'utilisation de `word.sort`. Nous le verrons plus en détail dans les tests.
     * 
     * Tests : 
     * Il passe les 2 premiers tests
     * Il ne passe pas le troisième. La condition str.isEmpty() n'a pas l'air de fonctionner.
     * Il ne passe pas le quatrième. Le word.sort ne fonctionne pas correctement. Il ne trie pas les mots dans l'ordre attendu.
     * 
     * Parmi les tests supplémentaires :
     * - assertEquals(List.of("Bonjour", "le", "monde", "!", "Comment", "ça", "va", "?"), exercice.simplicite.SimpliciteMeilleur.solution("Bonjour le monde! Comment ça va?", List.of("B", "l", "m", "C", "v")));
     * - assertEquals(List.of("abc", "def", "ghi", "jkl"), exercice.simplicite.SimpliciteMeilleur.solution("abc@def#ghi$jkl", List.of("a", "d", "g", "j")));
     * 
     * Il ne passe pas le cinquième. Il prend bien en compte les mots spéciaux (ici "!" et "?") mais ne les trie pas correctement.
     * Il ne passe pas le sixième. Il prend en compte les caractères spéciaux alors qu'il ne devrait pas.  
     * 
     * Note : 13,5/20
     * Détail :
     * - -1 x2 pour mes tests qui ne marchent pas donc -2
     * - -2 x2 pour les tests fournis qui ne marchent pas donc -4
     * - -1 pour la "non-simplicité" du code
     * - +0,5 pour car le test supplémentaire est dur à passer (peut être même faux) => je saurais l'expliquer à l'oral
     */
}