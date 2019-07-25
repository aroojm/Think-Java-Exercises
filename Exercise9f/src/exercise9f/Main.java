package exercise9f;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String stg = "shanghaiings";

        stg = stg.toLowerCase();

        System.out.println(stg + " is a doubloon. " + isDoubloon(stg));

    }

    // method to check if every letter appears exactly twice in a string

    public static boolean isDoubloon(String s) {
        boolean flag = true ; // if string length is odd OR
                             // if string in even length a char does not appear exactly twice
                              //this will be changed to false
        int len = s.length();

        int count;

        if (len % 2 == 0){
            for (int i = 0; i < (len); i++) { //choosing one char and comparing with the whole string
                count = 2; // on comparison, the char should appear twice
                for (int j = 0; j < (len); j++){
                    if (s.charAt(i) == s.charAt(j)) {
                        count --;
                    }
                }
                if (count != 0){ // if any char doesn't appear twice stop the loop -
                                 // no need to test rest of chars in string
                    flag = false;
                    break;
                }
            }
        }
        else { flag = false;}

        return flag;
    }
}
