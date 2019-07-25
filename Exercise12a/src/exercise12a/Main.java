package exercise12a;

public class Main {

    public static void main(String[] args) {
        printDeck(makeDeck());

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
