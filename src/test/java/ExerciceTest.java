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

        // Chaine à 1 mot
        assertEquals("Erreur de chaine à 1 mot", List.of("OK"), SimpliciteMeilleur.solution("OK",List.of('a', 'b', 'c', 'd', 'e')));
        assertEquals("Erreur de chaine à 1 mot", List.of("OK"), SimplicitePire.solution("OK",List.of('a', 'b', 'c', 'd', 'e')));
        assertEquals("Erreur de chaine à 1 mot", List.of("OK"), EfficaciteMeilleur.solution("OK",List.of('a', 'b', 'c', 'd', 'e')));
        assertEquals("Erreur de chaine à 1 mot", List.of("OK"), EfficacitePire.solution("OK",List.of('a', 'b', 'c', 'd', 'e')));

        // Chaine vide
        assertEquals(List.of(""), SimpliciteMeilleur.solution("",List.of('6', 't', 'n', 'o', 'b')));
        assertEquals(List.of(""), SimplicitePire.solution("",List.of('6', 't', 'n', 'o', 'b')));
        assertEquals(List.of(""), EfficaciteMeilleur.solution("",List.of('6', 't', 'n', 'o', 'b')));
        assertEquals(List.of(""), EfficacitePire.solution("",List.of('6', 't', 'n', 'o', 'b')));

        // Chaine donnée en exemple
        assertEquals(List.of("fait", "Il", "aujourd", "aout", "beau", "hui", "comme", "en"), SimpliciteMeilleur.solution("Il fait beau aujourd'hui comme en aout",List.of('f', 'I', 'z', 'u', 'k', 'a', 'b', 'o')));
        assertEquals(List.of("fait", "Il", "aujourd", "aout", "beau", "hui", "comme", "en"), SimplicitePire.solution("Il fait beau aujourd'hui comme en aout",List.of('f', 'I', 'z', 'u', 'k', 'a', 'b', 'o')));
        assertEquals(List.of("fait", "Il", "aujourd", "aout", "beau", "hui", "comme", "en"), EfficaciteMeilleur.solution("Il fait beau aujourd'hui comme en aout",List.of('f', 'I', 'z', 'u', 'k', 'a', 'b', 'o')));
        assertEquals(List.of("fait", "Il", "aujourd", "aout", "beau", "hui", "comme", "en"), EfficacitePire.solution("Il fait beau aujourd'hui comme en aout",List.of('f', 'I', 'z', 'u', 'k', 'a', 'b', 'o')));
        // Ajoutez vos test ici...
    }
}