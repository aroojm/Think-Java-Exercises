package exercise6f;

public class Main {

    public static void main(String[] args) {
    System.out.println(prod(3,6));
    }

    public static int prod(int m, int n) {
    if (m == n) {
        return n;
    }
    else {
        return n * prod(m, n-1);
    }

    }

}
