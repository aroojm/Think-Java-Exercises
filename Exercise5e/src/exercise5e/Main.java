package exercise5e;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many bottles of beer?");
        int j = input.nextInt();

        lyrics(j);

    }

    // recursive method, invokes "lines" method
    public static void lyrics(int n){
        if (n == 1){
            System.out.println("1 bottle of beer on the wall,");
            System.out.println("1 bottle of beer,");
            System.out.println("ya’ take one down, ya’ pass it around,");
            System.out.println("1 bottle of beer on the wall!");

            System.out.println();

            System.out.println("No bottles of beer on the wall,");
            System.out.println("no bottles of beer,");
            System.out.println("ya’ can’t take one down, ya’ can’t pass it around,");
            System.out.println("‘cause there are no more bottles of beer on the wall!");
        }
        else {
            lines (n);
            lyrics (n-1);

        }
    }

    // method to print stanza lines with different number of bottles
    public static void lines(int i){
        System.out.println(i + " bottles of beer on the wall,");
        System.out.println(i + " bottles of beer,");
        System.out.println("ya’ take one down, ya’ pass it around,");
        System.out.println(i + " bottles of beer on the wall!");
        System.out.println();
    }
}
