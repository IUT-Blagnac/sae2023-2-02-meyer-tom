package exercice.simpliciteMeilleur;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class SimpliciteMeilleur {

    public static List<String> solution(String texte, List<String> ordre) {

        // Expression Regex pour séparer les mots à chaque caractère non-alphabétique
        List<String> decoupage = Arrays.asList(texte.split("[^\\p{L}]"));

        // Tri en fonction de l'ordre
        List<String> resultat = new ArrayList<String>();
        for(int i=0 ; i < ordre.size() ; i++) {
            for(int j=0 ; j < decoupage.size() ; j++) {
                if(decoupage.get(j).startsWith(ordre.get(i))) {
                    resultat.add(decoupage.get(j));
                }
            }
        }

        // Ajout des mots restants
        for(int i=0 ; i < decoupage.size() ; i++) {
            if(!resultat.contains(decoupage.get(i))) {
                resultat.add(decoupage.get(i));
            }
        }

        return resultat;

    }

    /*
     * Préléminaire :
     * Non-respect de la nomenclature précise (-1). Dans les paramètres de la fonction solution, on a : (String texte, List<String> ordre).Or, il est attendu : (String str, List<Character> ordre)
     * 
     * Simplicité :
     * En terme de simplicité, ce programme correspond à mes attentes.  Il est simple à comprendre et à modifier grâce aux commentaires et aux noms de variables explicites.  Mais aussi grâce à la simplicité de la syntaxe Java.
     * 
     * Tests : 
     * Il passe tous les tests fournis, sauf le premier. Je pense que son erreur vient de son split qui ne prend en compte que les caractères non-alphabétiques, ce qui pose problème pour le mot "666".
     * Parmi les tests supplémentaires :
     * - assertEquals(List.of("Bonjour", "le", "monde", "!", "Comment", "ça", "va", "?"), exercice.simplicite.SimpliciteMeilleur.solution("Bonjour le monde! Comment ça va?", List.of("B", "l", "m", "C", "v")));
     * - assertEquals(List.of("abc", "def", "ghi", "jkl"), exercice.simplicite.SimpliciteMeilleur.solution("abc@def#ghi$jkl", List.of("a", "d", "g", "j")));
     * 
     * Il ne passe pas le premier test car il ne prend pas en compte les mots spéciaux (ici "!" et "?").
     * Il passe le deuxième test car il prend en compte les caractères spéciaux.
     * 
     * Note : 16,5/20
     * Détail :
     * - -1 pour le non-respect de la nomenclature
     * - -1 pour le premier test supplémentaire qui ne passe pas
     * - -2 pour le premier test fourni qui ne passe pas
     * - +0,5 pour car le test supplémentaire est dur à passer (peut être même faux) => je saurais l'expliquer à l'oral
     */
}