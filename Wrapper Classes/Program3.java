import java.util.Scanner;

public class Program3 {
	public static void main(String[] args) {
		
		System.out.println("Enter number : ");
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		String output = String.format("%8s", Integer.toBinaryString(input)).replace(' ', '0');
		System.out.println(output);
		
		
		sc.close();

	}
}
