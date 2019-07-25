package exercise12c;

public class Deck {

    private static final int TOTAL_CARDS = 52;
    private Card[] deckOfCards;

    // Constructor
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

}
