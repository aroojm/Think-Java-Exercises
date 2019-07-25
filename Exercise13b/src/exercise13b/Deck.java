package exercise13b;

import java.util.Random;

public class Deck {

    private static final int TOTAL_CARDS = 52;
    private Card[] deckOfCards;
    private static Random rndmno = new Random();


    // Constructors
    public Deck() {
        this.deckOfCards = new Card[TOTAL_CARDS];
        int index = 0;
        for(int suit = 0; suit <= 3; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                this.deckOfCards[index] = new Card(rank, suit);
                index++;
            }
        }
    }

    public Deck(int n){
        this.deckOfCards = new Card[n];
    }

    // getters
    public Card[] getDeckOfCards(){ return this.deckOfCards;}

    // toString method
    public String toString() {
        String str = "";
        for (int i = 0; i < this.deckOfCards.length; i++) {
            str = str + this.deckOfCards[i].toString() +"\n";
        }
        return str;
    }

    // helper method - takes two integers & returns a random integer between the two,
    // including both
    public static int randomInt(int low, int high){
        return rndmno.nextInt(high+1-low)+low;
    }
    // helper method - takes two indexes and swaps cards at these locations
    public static void swapCards(int i, int j, Card[] arrayCards){
        Card temp = arrayCards[i];
        arrayCards[i] = arrayCards[j];
        arrayCards[j] = temp;
    }
    // method for shuffling cards in deck
    public static void shuffle(Card[] arrayCards){
        int swap;
        for(int i = 0;i < arrayCards.length-1; i++){
            swap = randomInt(i, arrayCards.length-1);
            swapCards(i, swap, arrayCards);
        }
    }

}

