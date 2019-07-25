package exercise9g;

public class Main {

    public static void main(String[] args) {
	System.out.println(areAnagrams("makes","epamk"));
    }

    public static boolean areAnagrams(String s1, String s2){
        boolean flag = true; // will change to false: if both words are not of equal length
                             // OR if all letters don't match
        int len1 = s1.length();
        int len2 = s2.length();
        int counter = len1; // counter will decrease by 1 as one char is present in both words

        if (len1 == len2){
            for (int i = 0; i < len1; i++) { // loop over 1st word
               // System.out.println(s1.charAt(i) + " of " + s1 + " ");
                for (int j = 0; j < len2; j++) { // loop over 2nd word
                  //  System.out.println(s2.charAt(j) + " of " + s2 + " ");
                    if (s1.charAt(i) == s2.charAt(j)) { // when char from 1st word matches with char from 2nd word
                        s2 = replaceChar(s2, j); // replace that char from 2nd word
                        counter--;
                        break;
                    }
                    //System.out.println(s2.charAt(j) + " of " + s2 + " ");
                }
               // System.out.println();
            }
            if (counter != 0){ flag = false; System.out.print("reached");}

        }
        else{
            flag = false; // unequal length words are not anagrams
        }

        return flag;
    }

// method to return string after replacing: a)  1st element b) last element c) any middle element
    public static String replaceChar(String s, int i){
        int len = s.length();
        if (i == 0){
            s = s.substring(1);}
        else if (i == (len - 1)){
            s = s.substring(0, (len - 1));}
        else { s = s.substring(0,i) + s.substring(i+1);}

        return s;
    }
}
