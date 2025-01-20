package SpinningWords;

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {

        System.out.println(spinWords("Stop spinning my words"));

    }
    static String spinWords(String sentence){

        String[] splittedSentece = sentence.split(" ");

        String[] senteceWithTheWordsSpinned = Arrays.stream(splittedSentece)
                .map(word ->
                {if (word.length() >= 5) {
                StringBuilder sb = new StringBuilder(word);
                return sb.reverse().toString();
            }
            return word;
        }).toList().toArray(new String[0]);

        StringBuilder finalString = new StringBuilder();

        Arrays.stream(senteceWithTheWordsSpinned).forEach(string -> finalString.append(string + " "));

        return finalString.toString();

        //Just trying to challenge myself to solve the problem without using lambdas
        /*
        for(int i = 0; i < splittedSentece.length; i++){
            String[] letters = splittedSentece[i].split("");
            if (splittedSentece[i].length() >= 5){
                String[] reversedLetters = new String[letters.length];

                int k = 0;
                for(int j = letters.length; j > 0; j--){
                    reversedLetters[k] = letters[j-1];
                    k++;
                }
                for(String s : reversedLetters){
                    finalString.append(s);
                }
                finalString.append(" ");
            }else {
                for(String s : letters){
                    finalString.append(s);
                }
                finalString.append(" ");
            }
        }
        return finalString.toString();
        */
    }
}
