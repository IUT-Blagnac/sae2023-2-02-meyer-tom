package exercice;

import java.util.ArrayList;
import java.util.List;

public class efficaciteMeilleure {

    public static List<String> solution(String str, List<Character> ordre) {
        long startTime = System.nanoTime();
        List<String> output = new ArrayList<String>();
        List<String> strSeparate = new ArrayList<String>();
        String word = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ' || str.charAt(i) == '\'') {
                strSeparate.add(word);
                word = "";
            } else {
                word += str.charAt(i);
                if (i == str.length() - 1) {
                    strSeparate.add(word);
                }
            }
        }

        for (String wordString : strSeparate) {
            if (ordre.contains(wordString.charAt(0))) {
                output.add(wordString);
            }
        }

        for (String wordString : strSeparate) {
            if (!output.contains(wordString)) {
                output.add(wordString);
            }
        }

        long duration = (System.nanoTime() - startTime);

        System.out.println("Execution time in nanoseconds : " + duration);
        System.out.println("Execution time in milliseconds " + duration / 1000000);

        return output;

    }
}
