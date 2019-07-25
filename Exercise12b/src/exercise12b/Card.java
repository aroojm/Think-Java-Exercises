package exercise12b;


public class Card {
    private int rank;
    private int suit;

    public static final String[] RANKS = {null, "Ace", "2", "3", "4", "5", "6",
            "7", "8", "9", "10", "Jack", "Queen", "King"};
    public static final String[] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};

    // Constructor
    public Card(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
    }

    // getters
    public int getRank(){ return this.rank;}
    public int getSuit() {return this.suit;}

    // toString method
    public String toString() {
        return RANKS[this.rank] + " of " + SUITS[this.suit];
    }

    // equals method
    public boolean equals(Card that){
        return this.rank == that.rank && this.suit == that.suit;
    }

    // compareTo method
    public int compareTo(Card that){
        System.out.println("Returning values: Calling Card smaller -1     Calling Card bigger 1.");
        if (this.suit < that.suit){ return -1;}
        if (this.suit > that.suit){ return 1;}
        if (this.rank < that.rank){
            if (this.rank == 1) {
                return 1; }
                else
                    {return -1;}
        }
        if (this.rank > that.rank){
            if (that.rank == 1) {
                return -1; }
                else
                    {return 1;}
        }
        return 0;
    }
    // makeDeck method
    public static Card[] makeDeck(){
        Card[] deck = new Card[52];
        int index = 0;
        for(int suit = 0; suit <= 3; suit++){
            for(int rank = 1; rank <= 13; rank++){
                deck[index] = new Card(rank, suit);
                index++ ;
            }
        }
        return deck;
    }
    // printDeck method
    public static void printDeck(Card[] deck){
        for(int i = 0; i < deck.length; i++){
            System.out.println(deck[i]);
        }
}
}


