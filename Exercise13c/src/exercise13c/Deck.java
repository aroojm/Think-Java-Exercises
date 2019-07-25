package exercise13c;

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
    public void swapCards(int i, int j){
        Card temp = this.deckOfCards[i];
        this.deckOfCards[i] = this.deckOfCards[j];
        this.deckOfCards[j] = temp;
    }
    // method for shuffling cards in deck
    public void shuffle(){
        int swap;
        for(int i = 0;i < this.deckOfCards.length-1; i++){
            swap = randomInt(i, this.deckOfCards.length-1);
            swapCards(i, swap);
        }
    }
// method to find lowest card in a given range of deck
    public int indexLowest(int lowIndex, int highIndex){
        int lowest = lowIndex;
        for(int i = lowIndex + 1; i <= highIndex; i++){
            if ( this.deckOfCards[lowest].compareTo(this.deckOfCards[i])== 1){lowest = i;}
        }
        return lowest;
    }

// selectionSort method
  public void selectionSort(){
        int lowest;
      for(int i = 0;i < this.deckOfCards.length-1; i++){
          lowest = indexLowest(i, this.deckOfCards.length-1);
          swapCards(i, lowest);
      }
  }

// method to create subdecks
  public Deck subdeck(int low, int high){
      Deck sub = new Deck(high - low + 1);
      for (int i = 0; i < sub.deckOfCards.length;i++){
          sub.deckOfCards[i] = this.deckOfCards[low + i];
      }
      return sub;
  }
// method to merge two sorted decks
  public static Deck merge(Deck d1, Deck d2){
      Deck result = new Deck(d1.deckOfCards.length + d2.deckOfCards.length);
      Card winner;
      int i = 0;  //counter for first deck
      int j = 0;  //counter for second deck
      for (int k = 0; k < result.deckOfCards.length; k++){
          if (i == d1.deckOfCards.length){
              winner = d2.deckOfCards[j];
              j++;
          } else if(j == d2.deckOfCards.length){
              winner = d1.deckOfCards[i];
              i++;
          } else {
              if(d1.deckOfCards[i].compareTo(d2.deckOfCards[j]) == -1){
                  winner = d1.deckOfCards[i];
                  i++; }
              else {
                  winner = d2.deckOfCards[j];
                  j++; }
          }
          result.deckOfCards[k] = winner;

      }
      return result;
  }

// simple version of mergeSort
  public Deck mergeSortSimple(){
      Deck sub1 = this.subdeck(0,25);
      Deck sub2 = this.subdeck(26,51);
      sub1.selectionSort();
      sub2.selectionSort();

      return merge(sub1,sub2);
  }
// recursive version of mergeSort
  public Deck mergeSortRecursive(){
      int len, half;
      len = this.deckOfCards.length;

      if (len == 0 || len == 1) {
          return this;}
      half = len / 2;

      Deck sub1 = this.subdeck(0,half);
      Deck sub2 = this.subdeck(half,len-1);

      Deck sub3 = sub1.mergeSortRecursive();
      Deck sub4 = sub2.mergeSortRecursive();
      return merge(sub3,sub4);
  }
}