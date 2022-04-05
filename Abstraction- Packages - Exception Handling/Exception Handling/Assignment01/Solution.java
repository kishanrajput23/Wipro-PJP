import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number of elemets in the array");
		int len = scan.nextInt();
		int[] array = new int[len];
		System.out.println("Enter the elements in the array");
		try {
			for(int i = 0; i < array.length; i++)
				array[i] = scan.nextInt();
			System.out.println("Enter the index of the array you want to access");
			int keyIndex = scan.nextInt();
			System.out.println("The array element at index "+ keyIndex +" = "+ array[keyIndex]);
			System.out.println("The array element successfully accessed");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch(InputMismatchException e) {
			System.out.println("java.lang.NumberFormatException");
		}
	}

}
