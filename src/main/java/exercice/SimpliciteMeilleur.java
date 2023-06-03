package exercice;

import java.util.ArrayList;
import java.util.List;

public class SimpliciteMeilleur {
    public static List<String> solution(String str, List<Character> ordre) {
        List<String> result = new ArrayList<>();

        // On sépare la chaine de caractère en mots
        String[] mots = str.split("[^a-zA-Z0-9]");

        // On supprime les mots vides de la liste
        for (int i = 0; i < mots.length; i++) {
            if (mots[i].isEmpty()) {
                mots[i] = " ";
            }
        }

        // On parcours l'ordre donné
        for (Character c : ordre) {
            // On parcours les mots
            for (String mot : mots) {
                // Si le mot commence par la lettre courante de l'ordre
                if (!mot.isEmpty() && mot.charAt(0) == c) {
                    // On l'ajoute à la liste
                    result.add(mot);
                }
            }
        }

        // Si l'ordre n'est pas complet, on ajoute les mots restants
        for (String mot : mots) {
            // Si le mot n'est pas vide et qu'il n'est pas déjà dans la liste
            if (!result.contains(mot) && !mot.equals(" ")) {
                // On l'ajoute à la liste
                result.add(mot);
            }
        }

        // Si la chaine est vide, on ajoute une chaine vide à la liste
        if (str.isEmpty()) {
            // On ajoute une chaine vide à la liste
            result.add("");
        }

        return result;
    }
}