package exercise11c;

public class Main {

    public static void main(String[] args) {
        Tile mytile = new Tile('s', 1) ;
        Tile mytile1 = new Tile('t', 1) ;

        System.out.println(mytile.getLetter()); // invoke getLetter from class Tile
        System.out.println(mytile.getValue()); // invoke getValue from class Tile

        mytile.setLetter('M'); // invoke setLetter from class Tile
        mytile.setValue(2); // invoke setValue from class Tile


        Tile.testTile(); // invoke the method testTile from class Tile

        System.out.println(mytile); // implement toString method for Tile object
        System.out.println(mytile1); // implement toString method for Tile object

        System.out.println(mytile.equals(mytile1)); // invoke equal method from class Tile
    }

}
