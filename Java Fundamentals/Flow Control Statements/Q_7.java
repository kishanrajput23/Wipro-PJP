import java.util.*;

public class Q_7 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a character : ");
        char ch = sc.next().charAt(0);
        if (Character.isLowerCase(ch)) {
            System.out.println(Character.toUpperCase(ch));
        }
        else {
            System.out.println(Character.toLowerCase(ch));
        }
    }
}
