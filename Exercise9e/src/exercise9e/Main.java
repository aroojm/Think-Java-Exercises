package exercise9e;

public class Main {

    public static void main(String[] args) {
        String s = "pqrstuvw";

        System.out.println(isAbecedarian(s));
    }
    // recursive method to check if a word is Abecedarian or not
    public static boolean isAbecedarian(String s){
        boolean flag = false;
        int len = s.length();
        //    System.out.println(s);  //optional: if want to see how string letters are compared & dropped

// not valid for one character string
        if (len == 1){
            System.out.println("String should have more than one character.");
            return flag;
        }

// base case
        if ((len == 2) && (s.charAt(0) < s.charAt(1))) {
            flag = true;
        }

// compare first two char of string & then drop first letter
        if ((len > 2) && (s.charAt(0) < s.charAt(1))){
            s = s.substring(1);
            flag = isAbecedarian(s);
        }
        return flag;
    }
}

