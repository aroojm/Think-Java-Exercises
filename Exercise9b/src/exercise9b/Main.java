package exercise9b;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

    String word = "SearchForExtraTerrestrialIntelligence";


     System.out.println(Arrays.toString(letterHist(word)));

    }

    public static int[] letterHist(String word){
        int[] hist = new int[26];
        for (char letter: word.toCharArray()){
            for (int i = 0; i < 26; i++){
                if ((letter == (i+65)) || (letter == (i+97))){
                    hist[i] ++;
                }
            }
        }
        return hist;
    }
}
