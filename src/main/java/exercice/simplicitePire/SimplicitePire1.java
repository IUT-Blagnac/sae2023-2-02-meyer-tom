package exercice.simplicitePire;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SimplicitePire1 {

    public static List<String> solution(String s, List<Character> o) {

        int i, j;
        List<String> lm = new ArrayList<>();
        String[] m = s.split("[^a-zA-Z0-9]+");

        if (s.length() == 0) { return lm; } else { lm = new ArrayList<>(Arrays.asList(m)); }

        for (i = 0; i < lm.size()-1; i++) {
            for (j = 0; j < lm.size()-1-i ; j++) {
                if (cwO(lm.get(j), lm.get(j+1), o) > 0) { String t = lm.get(j); lm.set(j, lm.get(j+1)); lm.set(j+1, t); }
            }
        }

        return lm;
    }

    public static int cwO(String m1, String m2, List<Character> o) {
        int l = Math.min(m1.length(), m2.length());
        
        for (int i = 0; i < l; i++) {
            char c1 = m1.charAt(i);
            char c2 = m2.charAt(i);
            
            if (c1 != c2) {
                int ix1 = o.indexOf(c1);
                int ix2 = o.indexOf(c2);
                
                if (ix1 != -1 && ix2 != -1) { return Integer.compare(ix1, ix2); } else if (ix1 != -1) { return -1; } else if (ix2 != -1) { return 1; } else { return -1; }
            }
        }
        
        return Integer.compare(m1.length(), m2.length());
    }
    
    /*
     * Préléminaire :
     * Rien à signaler. La nomenclature est respectée.
     * 
     * Simplicité :
     * En termes de simplicité, cette implémentation ne correspond pas entièrement à mes attentes. La fonction manque de commentaires pour faciliter la compréhension et la modification du code. De plus, la syntaxe Java utilisée est complexe.
     * Le nom des variables n'est pas explicite. Il faut comprendre le code pour comprendre le rôle de chaque variable mais comme on a du mal à comprendre le code à cause de la syntaxe et du manque de commentaires, cela devient compliqué.
     * Les indentations ne sont pas respectées ce qui rend le code difficile à lire et à comprend aussi.
     * Il est difficile de comprendre le code d'où le fait qu'il soit en simplicité pire.
     * 
     * Tests :
     * Il passe tous les tests fournis. Sauf celui de la chaîne vide. Cela doit être dû au fait que la condition s.length() == 0 ne fonctionne pas correctement.
     * 
     * Parmi les tests supplémentaires :
     * - assertEquals(List.of("Bonjour", "le", "monde", "!", "Comment", "ça", "va", "?"), exercice.simplicite.SimpliciteMeilleur.solution("Bonjour le monde! Comment ça va?", List.of("B", "l", "m", "C", "v")));
     * - assertEquals(List.of("abc", "def", "ghi", "jkl"), exercice.simplicite.SimpliciteMeilleur.solution("abc@def#ghi$jkl", List.of("a", "d", "g", "j")));
     * 
     * Il ne passe pas le premier test supplémentaire car il ne prend pas en compte les mots spéciaux (ici "!" et "?") dans son split.
     * Le second test supplémentaire passe.
     * 
     * Note : 17,5/20
     * Détail :
     * - -0 car il correspond bien à la simplicité pire (lecture et compréhension du code très difficile)
     * - -2 car il ne passe pas le test de la chaîne vide
     * - -1 car il ne passe pas le premier test supplémentaire
     * - +0,5 car le test supplémentaire est dur à passer (peut être même faux) => je saurais l'expliquer à l'oral
     */
}
