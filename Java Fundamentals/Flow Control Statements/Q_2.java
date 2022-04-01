import java.util.*;

public class Q_2 {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();

        if (a%2 == 0) {
            System.out.println("It's a Even Number.");
        }
        else {
            System.out.println("It's an Odd Number.");
        }
    }
}