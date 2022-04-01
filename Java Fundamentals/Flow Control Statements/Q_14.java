import java.util.*;

public class Q_14 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int sum;
        int num = sc.nextInt();

        for(sum=0; num !=0; num=num/10) {
            sum = sum + num % 10; 
        }
        System.out.println(sum);
    }   
}