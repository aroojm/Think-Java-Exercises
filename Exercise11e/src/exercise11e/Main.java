package exercise11e;

public class Main {

    public static void main(String[] args) {
        Rational r1 = new Rational();
        Rational r2 = new Rational(4,12);
        Rational r3 = new Rational(1,2);


        Rational.printRational(r1); // printRational method from class Rational

        System.out.print(r1);  // invoke toString method indirectly from class Rational

// testing negate method
        r1.negate();
        System.out.print(r1);
// testing invert method
        r1.invert();
        System.out.print(r1);
// testing toDouble method
        System.out.println(r2.toDouble());
// reducing a rational number
        System.out.print(r2.reduce());
// adding two rational numbers
        System.out.print(r2.add(r3));
    }

}
