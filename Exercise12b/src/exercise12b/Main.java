package exercise12b;

public class Main {

    public static void main(String[] args) {
	Card card1 = new Card(5,3);
	Card card2 = new Card(1,3);

	Card card3 = new Card(6,1);
	Card card4 = new Card(3,1);

    System.out.println(card1.compareTo(card2));
    System.out.println(card3.compareTo(card4));

    }
}
