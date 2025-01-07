package VowelCounter;

import java.util.*;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args){
        String word = "Accoutrements";
        System.out.println("The word \"" + word + "\" has " + vowelCount(word) + " vowels.");
    }
    static int vowelCount(String word){

        Set<String> vowels = Set.of("a", "e", "i", "o", "u");

        Set<String> letters = Arrays.stream(word.split("")).collect(Collectors.toSet());

        Set<String> vowelsWord = letters.stream().filter(s -> vowels.contains(s.toLowerCase()))
                .collect(Collectors.toSet());

        return vowelsWord.size();
    }
}
