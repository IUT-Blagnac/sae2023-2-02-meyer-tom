import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

import exercice.EfficaciteMeilleur;
import exercice.EfficacitePire;
import exercice.SimpliciteMeilleur;
import exercice.SimplicitePire;

import java.util.*;

public class ExerciceTest {
    @Test
    public void testSolution() {
        // Chaine simple avec ordre complet
        assertEquals(List.of("666","the", "the", "number", "of", "beast"), SimpliciteMeilleur.solution("666, the number of the beast",List.of('6', 't', 'n', 'o', 'b')));
        assertEquals(List.of("666","the", "the", "number", "of", "beast"), SimplicitePire.solution("666, the number of the beast",List.of('6', 't', 'n', 'o', 'b')));
        assertEquals(List.of("666","the", "the", "number", "of", "beast"), EfficaciteMeilleur.solution("666, the number of the beast",List.of('6', 't', 'n', 'o', 'b')));
        assertEquals(List.of("666","the", "the", "number", "of", "beast"), EfficacitePire.solution("666, the number of the beast",List.of('6', 't', 'n', 'o', 'b')));
        //assertEquals(List.of("666","the", "the", "number", "of", "beast"), exercice.simplicite.simpliciteMeilleur.solution("666, the number of the beast",List.of("6", "t", "n", "o", "b")));
        assertEquals(List.of("666","the", "the", "number", "of", "beast"), exercice.simpliciteMeilleur.SimpliciteMeilleur2.solution("666, the number of the beast",List.of('6', 't', 'n', 'o', 'b')));
        assertEquals(List.of("666","the", "the", "number", "of", "beast"), exercice.simpliciteMeilleur.SimpliciteMeilleur3.solution("666, the number of the beast",List.of('6', 't', 'n', 'o', 'b')));  
        assertEquals(List.of("666","the", "the", "number", "of", "beast"), exercice.simplicitePire.SimplicitePire1.solution("666, the number of the beast",List.of('6', 't', 'n', 'o', 'b')));   
        //assertEquals(List.of("666","the", "the", "number", "of", "beast"), exercice.simplicitePire.SimplicitePire2.solution("666, the number of the beast",List.of('6', 't', 'n', 'o', 'b')));   



        // Chaine à 1 mot
        assertEquals("Erreur de chaine à 1 mot", List.of("OK"), SimpliciteMeilleur.solution("OK",List.of('a', 'b', 'c', 'd', 'e')));
        assertEquals("Erreur de chaine à 1 mot", List.of("OK"), SimplicitePire.solution("OK",List.of('a', 'b', 'c', 'd', 'e')));
        assertEquals("Erreur de chaine à 1 mot", List.of("OK"), EfficaciteMeilleur.solution("OK",List.of('a', 'b', 'c', 'd', 'e')));
        assertEquals("Erreur de chaine à 1 mot", List.of("OK"), EfficacitePire.solution("OK",List.of('a', 'b', 'c', 'd', 'e')));
        assertEquals("Erreur de chaine à 1 mot", List.of("OK"), exercice.simpliciteMeilleur.SimpliciteMeilleur.solution("OK",List.of("a", "b", "c", "d", "e")));
        assertEquals("Erreur de chaine à 1 mot", List.of("OK"), exercice.simpliciteMeilleur.SimpliciteMeilleur2.solution("OK",List.of('a', 'b', 'c', 'd', 'e')));
        assertEquals("Erreur de chaine à 1 mot", List.of("OK"), exercice.simpliciteMeilleur.SimpliciteMeilleur3.solution("OK",List.of('a', 'b', 'c', 'd', 'e')));
        assertEquals("Erreur de chaine à 1 mot", List.of("OK"), exercice.simplicitePire.SimplicitePire1.solution("OK",List.of('a', 'b', 'c', 'd', 'e')));
        assertEquals("Erreur de chaine à 1 mot", List.of("OK"), exercice.simplicitePire.SimplicitePire2.solution("OK",List.of('a', 'b', 'c', 'd', 'e')));





        // Chaine vide
        assertEquals(List.of(""), SimpliciteMeilleur.solution("",List.of('6', 't', 'n', 'o', 'b')));
        assertEquals(List.of(""), SimplicitePire.solution("",List.of('6', 't', 'n', 'o', 'b')));
        assertEquals(List.of(""), EfficaciteMeilleur.solution("",List.of('6', 't', 'n', 'o', 'b')));
        assertEquals(List.of(""), EfficacitePire.solution("",List.of('6', 't', 'n', 'o', 'b')));
        assertEquals(List.of(""), exercice.simpliciteMeilleur.SimpliciteMeilleur.solution("",List.of("6", "t", "n", "o", "b")));
        //assertEquals(List.of(""), exercice.simpliciteMeilleur.SimpliciteMeilleur2.solution("",List.of('6', 't', 'n', 'o', 'b')));
        assertEquals(List.of(""), exercice.simpliciteMeilleur.SimpliciteMeilleur3.solution("",List.of('6', 't', 'n', 'o', 'b')));
        //assertEquals(List.of(""), exercice.simplicitePire.SimplicitePire1.solution("",List.of('6', 't', 'n', 'o', 'b')));
        //assertEquals(List.of(""), exercice.simplicitePire.SimplicitePire2.solution("",List.of('6', 't', 'n', 'o', 'b')));




        // Chaine donnée en exemple
        assertEquals(List.of("fait", "Il", "aujourd", "aout", "beau", "hui", "comme", "en"), SimpliciteMeilleur.solution("Il fait beau aujourd'hui comme en aout",List.of('f', 'I', 'z', 'u', 'k', 'a', 'b', 'o')));
        assertEquals(List.of("fait", "Il", "aujourd", "aout", "beau", "hui", "comme", "en"), SimplicitePire.solution("Il fait beau aujourd'hui comme en aout",List.of('f', 'I', 'z', 'u', 'k', 'a', 'b', 'o')));
        assertEquals(List.of("fait", "Il", "aujourd", "aout", "beau", "hui", "comme", "en"), EfficaciteMeilleur.solution("Il fait beau aujourd'hui comme en aout",List.of('f', 'I', 'z', 'u', 'k', 'a', 'b', 'o')));
        assertEquals(List.of("fait", "Il", "aujourd", "aout", "beau", "hui", "comme", "en"), EfficacitePire.solution("Il fait beau aujourd'hui comme en aout",List.of('f', 'I', 'z', 'u', 'k', 'a', 'b', 'o')));
        assertEquals(List.of("fait", "Il", "aujourd", "aout", "beau", "hui", "comme", "en"), exercice.simpliciteMeilleur.SimpliciteMeilleur.solution("Il fait beau aujourd'hui comme en aout",List.of("f", "I", "z", "u", "k", "a", "b", "o")));
        //assertEquals(List.of("fait", "Il", "aujourd", "aout", "beau", "hui", "comme", "en"), exercice.simplicite.simpliciteMeilleur.solution("Il fait beau aujourd'hui comme en aout",List.of('f', 'I', 'z', 'u', 'k', 'a', 'b', 'o')));
        assertEquals(List.of("fait", "Il", "aujourd", "aout", "beau", "hui", "comme", "en"), exercice.simpliciteMeilleur.SimpliciteMeilleur3.solution("Il fait beau aujourd'hui comme en aout",List.of('f', 'I', 'z', 'u', 'k', 'a', 'b', 'o')));
        assertEquals(List.of("fait", "Il", "aujourd", "aout", "beau", "hui", "comme", "en"), exercice.simplicitePire.SimplicitePire1.solution("Il fait beau aujourd'hui comme en aout",List.of('f', 'I', 'z', 'u', 'k', 'a', 'b', 'o')));
        //assertEquals(List.of("fait", "Il", "aujourd", "aout", "beau", "hui", "comme", "en"), exercice.simplicitePire.SimplicitePire2.solution("Il fait beau aujourd'hui comme en aout",List.of('f', 'I', 'z', 'u', 'k', 'a', 'b', 'o')));
        // Ajoutez vos test ici...

        // Passe tout les tests fournis sauf le premier. Je pense que son erreur vient de son split qui prend en compte que les caractères non-alphabétiques, ce qui fait que le mot "666" pose problème.

        // Test avec une chaîne contenant des mots spéciaux
        //assertEquals(List.of("Bonjour", "le", "monde", "!", "Comment", "ça", "va", "?"), exercice.simplicite.simpliciteMeilleur.solution("Bonjour le monde! Comment ça va?", List.of("B", "l", "m", "C", "v")));
        //assertEquals(List.of("Bonjour", "le", "monde", "!", "Comment", "ça", "va", "?"), exercice.simplicite.simpliciteMeilleur.solution("Bonjour le monde! Comment ça va?", List.of('B', 'l', 'm', 'C', 'v')));
        //assertEquals(List.of("Bonjour", "le", "monde", "!", "Comment", "ça", "va", "?"), exercice.simplicite.simpliciteMeilleur.solution("Bonjour le monde! Comment ça va?", List.of('B', 'l', 'm', '!', 'C', 'ç', 'v', '?')));
        //assertEquals(List.of("Bonjour", "le", "monde", "!", "Comment", "ça", "va", "?"), exercice.simplicitePire.SimplicitePire1.solution("Bonjour le monde! Comment ça va?", List.of('B', 'l', 'm', 'C', 'v')));
        //assertEquals(List.of("Bonjour", "le", "monde", "!", "Comment", "ça", "va", "?"), exercice.simplicitePire.SimplicitePire2.solution("Bonjour le monde! Comment ça va?", List.of('B', 'l', 'm', '!', 'C', 'ç', 'v', '?')));

        // Test avec une chaîne contenant des caractères spéciaux
        assertEquals(List.of("abc", "def", "ghi", "jkl"), exercice.simpliciteMeilleur.SimpliciteMeilleur.solution("abc@def#ghi$jkl", List.of("a", "d", "g", "j")));
        //assertEquals(List.of("abc", "def", "ghi", "jkl"), exercice.simplicite.simpliciteMeilleur.solution("abc@def#ghi$jkl", List.of('a', 'd', 'g', 'j')));
        assertEquals(List.of("abc", "def", "ghi", "jkl"), exercice.simpliciteMeilleur.SimpliciteMeilleur3.solution("abc@def#ghi$jkl", List.of('a', 'd', 'g', 'j')));
        assertEquals(List.of("abc", "def", "ghi", "jkl"), exercice.simplicitePire.SimplicitePire1.solution("abc@def#ghi$jkl", List.of('a', 'd', 'g', 'j')));
        //assertEquals(List.of("abc", "def", "ghi", "jkl"), exercice.simplicitePire.SimplicitePire2.solution("abc@def#ghi$jkl", List.of('a', 'd', 'g', 'j')));
    }
}