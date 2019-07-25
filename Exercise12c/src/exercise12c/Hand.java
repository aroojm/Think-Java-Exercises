package exercise12c;

import java.util.Random;

public class Hand {
    private Card[] cardsInHand;
    private int numbersOfCardsInHand;

    // Constructor
    // this method doesn't prevent a hand from having more than 1 card of same rank & suit
//    public Hand(int n) {
//        this.hand = new Card[n];
//        Random randomnumber = new Random();
//        int index = 0;
//        while (index <= n){
//            int rank = randomnumber.nextInt(13);
//            int suit = randomnumber.nextInt(3);
//            this.hand[index] = new Card(rank, suit);
//            index++;
//        }
//
//    }

   // Constructor
    public Hand(int n, Deck mydeck){
        numbersOfCardsInHand = n;
        cardsInHand = new Card[numbersOfCardsInHand];
        populate(mydeck);
        }

    private void populate(Deck mydeck){
        int counter = 0;
        Random rdmno = new Random();

        while (counter < numbersOfCardsInHand){
            int index = rdmno.nextInt(51);
            if (!mydeck.getDeckOfCards()[index].getDrawn()) {
                cardsInHand[counter] = mydeck.getDeckOfCards()[index] ;
                counter++;
                mydeck.getDeckOfCards()[index].setDrawn(true);
            }
        }

    }

    // toString method
    public String toString() {
        String str = "";
        for (int i = 0; i < this.cardsInHand.length; i++) {
            str = str + this.cardsInHand[i].toString() +"\n";
        }
        return str;
    }

    // getters
    public Card[] getcardsInHand(){ return this.cardsInHand;}

}
