package exercise6a;

public class Main {

    public static void main(String[] args) {
        int y;

        System.out.println("Invoking a value method and using(printing) it's return value below");

        // invoke a value method & do "something" with the result i.e. assign
        // it to a varibale or use it in a larger expression
        y = testMethod();
        System.out.println(y);

        // invoke a value method & do nothing with it's return value
        System.out.println("Just Invoking a value method and not doing anything with it's return value below");
        testMethod();

    }
    // simple value method that returns an integer
    public static int testMethod(){
        return 1;
    }
}
