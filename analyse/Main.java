package exercice;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        long beforeUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
        String texte = "exemple de texte a classer";
        List<Character> ordre = List.of('c', 't', 'e', 'x', 'a', 'm', 'p', 'l', 's', 'r', 'd');
        System.out.println(exercice.YOUR_PATH.solution(texte,ordre));
        long endTime = System.nanoTime();
        long afterUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
        long duration = (endTime - startTime);
        long actualMemUsed=afterUsedMem-beforeUsedMem;
        double durationMillis = (double) duration / 1_000_000.0;
        System.out.println("Temps d'exécution : " + durationMillis + " ms");
        System.out.println("Memoire utilisée : " + actualMemUsed + " octets");
    }
}
