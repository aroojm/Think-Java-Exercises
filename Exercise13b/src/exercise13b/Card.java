package exercise13b;

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


}


