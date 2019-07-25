package exercise13b;

public class Main {

    public static void main(String[] args) {
	Deck deck1 = new Deck();
	System.out.println(deck1);
	Deck.shuffle(deck1.getDeckOfCards());

	System.out.println("Shuffled deck");
	System.out.println("-------------");
	System.out.println(deck1);
    }
}
