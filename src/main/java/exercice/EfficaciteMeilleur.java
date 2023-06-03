package exercice;

import java.util.ArrayList;
import java.util.List;

public class EfficaciteMeilleur {
    public static List<String> solution(String str, List<Character> ordre) {
        List<String> result = new ArrayList<>();

        // On sépare la chaine de caractère en mots
        // On ne peut pas utiliser la méthode split
        // On va donc parcourir la chaine de caractère
        // On va stocker les mots dans une liste
        List<String> mots = new ArrayList<>();
        String mot = "";
        for (int i = 0; i < str.length(); i++) {
            // Si le caractère courant est une lettre ou un chiffre
            // On ne peut pas utiliser la méthode isLetterOrDigit, on va donc utiliser (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') || (str.charAt(i) >= '0' && str.charAt(i) <= '9')
            if ((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') || (str.charAt(i) >= '0' && str.charAt(i) <= '9')) {
                // On ajoute le caractère au mot
                mot += str.charAt(i);
            } else {
                // On ajoute le mot à la liste
                mots.add(mot);
                // On réinitialise le mot
                mot = "";
            }
        }
        // On ajoute le dernier mot à la liste
        mots.add(mot);

        // On supprime les mots vides de la liste
        for (int i = 0; i < mots.size(); i++) {
            // On ne peut pas utiliser la méthode isEmpty
            if (mots.get(i).equals("")) {
                mots.set(i, " ");
            }
        }

        // On parcours l'ordre donné
        for (Character c : ordre) {
            // On parcours les mots
            for (String m : mots) {
                // Si le mot commence par la lettre courante de l'ordre
                if (!m.isEmpty() && m.charAt(0) == c) {
                    // On l'ajoute à la liste
                    result.add(m);
                }
            }
        }

        // Si l'ordre n'est pas complet, on ajoute les mots restants
        for (String m : mots) {
            // Si le mot n'est pas vide et qu'il n'est pas déjà dans la liste
            // On ne peut pas utiliser la méthode contains, on va donc parcourir la liste
            boolean contient = false;
            for (String r : result) {
                if (r.equals(m)) {
                    contient = true;
                }
            }
            if (!contient && !m.equals(" ")) {
                // On l'ajoute à la liste
                result.add(m);
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