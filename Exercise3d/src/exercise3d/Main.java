package exercise3d;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int numChosen, numGuessed;
	Random random = new Random();
	Scanner in = new Scanner(System.in);

	numChosen = random.nextInt(100)+1;

	System.out.println("I'm thinking of a number between 1 and 100 (including both). Can you guess" +
            " what it is?");
	System.out.println("Type a number:");

	numGuessed = in.nextInt();
	in.nextLine(); // read the new line (to avoid Scanner Bug)

    System.out.println("Your guess is "+ numGuessed);
    System.out.println("The number I am thinking of is "+ numChosen);
    System.out.println("You were off by " + Math.abs(numChosen-numGuessed));
    }
}
