import java.util.*;

public class Q_1_a {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();

        if (a==0) {
            System.out.println("It's is Zero.");
        }
        else if (a<0) {
            System.out.println("It's is Negative Integer.");
        }
        else {
            System.out.println("It's is Postive Integer.");
        }
    }
}
