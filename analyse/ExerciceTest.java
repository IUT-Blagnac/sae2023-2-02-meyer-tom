import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

import java.util.*;

public class ExerciceTest {
    @Test
    public void testSolution() {

        // Chaine simple avec ordre complet
        assertEquals(List.of("666","the", "the", "number", "of", "beast"), exercice.YOUR_PATH.solution("666, the number of the beast",List.of("6", "t", "n", "o", "b")));

        // Chaine à 1 mot
        assertEquals("Erreur de chaine à 1 mot", List.of("OK"), exercice.YOUR_PATH.solution("OK",List.of("a", "b", "c", "d", "e")));

        // Chaine vide
        assertEquals(List.of(""), exercice.YOUR_PATH.solution("",List.of("6", "t", "n", "o", "b")));

        // Chaine donnée en exemple
        assertEquals(List.of("fait", "Il", "aujourd", "aout", "beau", "hui", "comme", "en"), exercice.YOUR_PATH.solution("Il fait beau aujourd'hui comme en aout",List.of("f", "I", "z", "u", "k", "a", "b", "o")));

        // Test avec une chaîne contenant des mots spéciaux
        assertEquals(List.of("Bonjour", "le", "monde", "!", "Comment", "ça", "va", "?"), exercice.YOUR_PATH.solution("Bonjour le monde! Comment ça va?", List.of("B", "l", "m", "C", "v")));

        // Test avec une chaîne contenant des caractères spéciaux
        assertEquals(List.of("abc", "def", "ghi", "jkl"), exercice.YOUR_PATH.solution("abc@def#ghi$jkl", List.of("a", "d", "g", "j")));
    }
}