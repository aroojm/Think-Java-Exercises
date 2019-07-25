package exercise5g;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        n = random.nextInt(100)+1; // generate the random number

//        System.out.println(n);  // just to see the random number

        System.out.println("I'm thinking of a number between 1 and 100 (including both). Can you guess" +
                " what it is?");
        System.out.println("Type a number:");
        Compare(input,n);
    }

// recursive method
    public static void Compare (Scanner in, int numChosen){
        int numGuessed, Difference;

        numGuessed = in.nextInt();
        in.nextLine(); // read the new line (to avoid Scanner Bug)

        Difference = numChosen - numGuessed;

        if (Difference < 0) {
            System.out.println("Your guess is high. Try again.");
            Compare(in, numChosen);
        }
        else if (Difference > 0) {
            System.out.println("Your guess is low. Try again.");
            Compare(in, numChosen);
        }
        else {
            System.out.println("Wow! Your guess is right!");
        }
    }
}

