package exercise9d;

public class Main {

    public static void main(String[] args) {
    String s1 = "123456";
    String s2 = "wasitacaroracatisaw";

// print each letter of a word
    System.out.println("Letters of " + s1 + " in order:");
    printString(s1);

// print each letter of a word in reverse order
    System.out.println("Letters of " + s1 + " in reverse order:");
    printBackward(s1);

// print a word in reverse
    System.out.println( s1 + " in reverse order:");
    System.out.println(reverseString(s1));

// check whether a word is palindrome or not
    System.out.println(s2 + " is a palindrrome. " + isPalindrome(s2));

    }

 //Part 2 iterative: method that takes a string as parameter & displays letters of string one on each line
    public static void printString(String s) {
        int len = length(s);
        for (int i = 0; i < len; i++) {
            System.out.println(first(s));
            s = rest(s);
        }
    }

// Part 2 recursive: method that takes a string as parameter & displays letters of string one on each line
/*    public static void printString(String s) {
        int len = length(s);
        System.out.println(first(s));
        if (len != 1){
            s = rest(s);
            printString(s);}
    }*/

// Part 3 iterative: method that takes a string as parameter & displays letters of string backwards one on each line
    public static void printBackward(String s) {
        int len = length(s);
        char f = ' '; // initializing character variable 'f'
        String reverse = "";
        for (int i = 0; i < len; i++) {
            f = first(s);
            reverse = f + reverse;
            s = rest(s);
        }
        printString(reverse);
    }

//Part 3 recursive: method that takes a string as parameter & displays letters of string backwards one on each line
/*    public static void printBackward(String s) {
    int len = length(s);
    char f = first(s);
    if (len != 1){
        s = rest(s);
        printBackward(s);}
    System.out.println(f);
}*/


// Part 4 recursive: method that takes a string as parameter & displays letters of string backwards one on each line
    public static String reverseString(String s) {
        int len = length(s);
        char f = ' '; // initializing character variable 'f'
        String reverse = ""; // initializing with empty string
        for (int i = 0; i < len; i++) {
            f = first(s);
            reverse = f + reverse;
            s = rest(s);
        }
        return reverse;
    }

    // Part 5 : recursive method to check if a string is a palindrome or not
    public static boolean isPalindrome(String s) {
        boolean flag = false;
        int len = length(s);
        if (len == 1) {
            flag = true;
        }
        if ((len == 2) && (s.charAt(0) == s.charAt(1))) {
            flag = true;
        }
        if ((len > 2) && (s.charAt(0) == s.charAt(len - 1))) {
            s = middle(s);
            flag = isPalindrome(s);
        }

        return flag;

    }

// Given methods
    /**
     * Returns the first character of the given String.
     */
    public static char first(String s) {
        return s.charAt(0);
    }

    /**
     * Returns all but the first letter of the given String.
     */
    public static String rest(String s) {
        return s.substring(1);
    }

    /**
     * Returns all but the first and last letter of the String.
     */
    public static String middle(String s) {
        return s.substring(1, s.length() - 1);
    }

    /**
     * Returns the length of the given String.
     */
    public static int length(String s) {
        return s.length();
    }

}