package exercice.simpliciteMeilleur;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class SimpliciteMeilleur3 {

    public static List<String> solution(String str, List<Character> ordre) {
        List<String> words = textToArray(str);
        words = sortWordsByOrder(words, ordre);
        return words;
    }

    /**
     * Classe un tableau de mots selon un ordre donné
     * 
     * @param list  le tableau de mots à trier
     * @param order l'ordre à utiliser pour le tri
     * @return
     */
    public static List<String> sortWordsByOrder(List<String> mots, List<Character> ordre) {
        List<String> motsTries = new ArrayList<>();
        LinkedHashSet<String> motsInconnus = new LinkedHashSet<>();

        for (char c : ordre) {
            for (String mot : mots) {
                if (mot.length() > 0 && mot.charAt(0) == c) {
                    motsTries.add(mot);
                }
            }
        }

        for (String mot : mots) {
            if (mot.length() == 0 || !ordre.contains(mot.charAt(0))) {
                motsInconnus.add(mot);
            }
        }

        motsTries.addAll(motsInconnus);

        return motsTries;
    }

         /**
     * Converti un texte en tableau de mots (séparateur : espace)
     *
     * @param text le texte à convertir
     * @return Tableau des mots du texte
     */
    public static List<String> textToArray(String text) {
        List<String> mots = new ArrayList<>();

        // Supprimer les caractères spéciaux et les espaces inutiles
        text = text.replaceAll("[^a-zA-Z0-9]+", " ").trim();
        mots = List.of(text.split(" "));

        return mots;
    }


    /**
     * Affiche tous les éléments du tableau donné.
     *
     * @param list Tableau d'éléments à afficher
     */
    public static void printList(List<String> list) {
        String result = "(";

        for (int i = 0; i < list.size(); i++) {
            result += list.get(i);
            if (i < list.size() - 1) {
                result += ", ";
            }
        }

        result += ")";
        System.out.println(result);
    }

    /*
     * Préléminaire :
     * Rien à signaler. La nomenclature est respectée.
     * 
     * Simplicité :
     * En termes de simplicité, cette implémentation correspond à mes attentes. Il découpe le code en plusieurs fonctions pour faciliter la compréhension et la modification du code. De plus, la syntaxe Java utilisée est simple.
     * Il y a également la javaDoc qui permet de comprendre rapidement le rôle de chaque fonction.
     * Il manque cependant des commentaires dans les fonctions pour expliquer le code plus en détail. Mais cela n'est pas nécessaire pour comprendre le code car le code des fonctions est petit et simple donc la javaDoc suffit.
     * 
     * Tests :
     * Il passe tous les tests fournis.
     * 
     * Parmi les tests supplémentaires :
     * - assertEquals(List.of("Bonjour", "le", "monde", "!", "Comment", "ça", "va", "?"), exercice.simplicite.SimpliciteMeilleur.solution("Bonjour le monde! Comment ça va?", List.of("B", "l", "m", "C", "v")));
     * - assertEquals(List.of("abc", "def", "ghi", "jkl"), exercice.simplicite.SimpliciteMeilleur.solution("abc@def#ghi$jkl", List.of("a", "d", "g", "j")));
     * 
     * Il ne passe pas le premier test supplémentaire car il ne prend pas en compte les mots spéciaux (ici "!" et "?").
     * Le second test supplémentaire passe.
     * 
     * Note : 19,5/20
     * Détail :
     * - -1 pour le premier test supplémentaire qui ne passe pas
     * - +0,5 pour car le test supplémentaire est dur à passer (peut être même faux) => je saurais l'expliquer à l'oral
     */
}
