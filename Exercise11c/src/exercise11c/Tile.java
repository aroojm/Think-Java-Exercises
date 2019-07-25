package exercise11c;

public class Tile {
    private char letter ;
    private int value ;

    /**
     * Constructor: Construct a Tile object with given values
     */
    public Tile(char letter, int value) {
        this.letter = letter ;
        this.value = value ;
    }
    /**
     * Prints the tile in a reader-friendly manner
     */
    public static void printTile(Tile t){
        System.out.println("Letter is "+ t.letter);
        System.out.println("Value is " + t.value);
    }
    /**
     * Creates & prints a tile object
     */
    public static void testTile(){
        Tile mytile = new Tile('Z', 10) ;
        printTile(mytile);
    }
    /**
     * Returns a String representation of the tile
     */
    public  String toString() {
        return String.format("%c -> %d ", this.letter, this.value) ;

    }
    /**
     * Test whether two tiles are equivalent
     */
    public boolean equals(Tile that) {
        return this.letter == that.letter && this.value == that.value ;
    }

    /*
     * Getters & Setters for each of the attributes
     */
    public char getLetter() { return this.letter; }
    public int getValue() { return this.value; }
    public void setLetter(char letter) { this.letter = letter; }
    public void setValue(int value) {this.value = value; }
}
