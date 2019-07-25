package exercise9c;

public class Main {

    public static void main(String[] args) {
        String s = "[{(3 + 7) * 2} - {(3 - 1) / <2 + (7 * 3)>}}]";


        System.out.println("Number of unbalanced brackets: " + balanceString(s));
        System.out.println("Positive integer --> bracket missing on left. " +
        "Negative integer --> bracket missing on right.");
    }

    public static int balanceString(String s){
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ((c == '(') || (c == '[') || (c == '{')) {
                count++;
            } else if ((c == ')') || (c == ']') || (c == '}')) {
                count--;
            }
        }
        if (count == 0){
            System.out.println("String is balanced.");
        }
        else {
            System.out.println("String is not balanced.");
        }
        return count;

    }
}
