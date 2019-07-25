package exercise6h;

// Ackermann function - gets very big very quickly
// Sample numbers to try: m from 0 to 3, n from 0 to 4
//
public class Main {

    public static void main(String[] args) {
    System.out.println(ack(2,4));
    }

    public static int ack(int m, int n){
        if (m == 0) {
            return n+1;
        }
        if (n == 0){
            return ack(m-1, 1);
        }
        return ack(m-1, ack(m,n-1));
    }
}
