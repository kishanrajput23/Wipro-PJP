import java.util.*;

public class Q_5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char ch1 = sc.next().charAt(0);
        if (Character.isAlphabetic(ch1)) {
            System.out.println("It's an Alphabet.");
        }
        else if (Character.isDigit(ch1)) {
            System.out.println("It's a Digit.");
        }
        else {
            System.out.println("It's a Special Character.");
        }   
    }
}