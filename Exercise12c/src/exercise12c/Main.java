package exercise12c;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int n = 20; //number of cards in hand
        Deck mydeck = new Deck(); // create a standard deck
        Hand hand1 = new Hand(n, mydeck); // choose cards out of the deck

        System.out.println("Hand 1 cards");
        System.out.println(hand1);

        System.out.println(Arrays.toString(Card.SUITS));
        System.out.println(Arrays.toString(suitHist(hand1.getcardsInHand())));

        System.out.print("Given hand is a flush --> ");
        System.out.println(hasFlush(hand1.getcardsInHand()));
    }

// method takes an array of cards as a parameter and returns a histogram of suits in hand
    public static int[] suitHist(Card[] hand){
        int[] hist = new int[4];

        for (int i = 0; i < hand.length; i++){
            int suit = hand[i].getSuit();
            if (suit == 0) {hist[0]++;}
            if (suit == 1) {hist[1]++;}
            if (suit == 2) {hist[2]++;}
            if (suit == 3) {hist[3]++;}
        }
        return hist;
    }
// method takes an array of cards as a parameter and returns true if hand contains a flush
    public static boolean hasFlush(Card[] hand){
        boolean flag = false;
        int[] histogram = suitHist(hand);
        for(int i = 0; i < histogram.length; i++){
            if (histogram[i] >= 5){flag = true;}
        }
        return flag;
    }
}
