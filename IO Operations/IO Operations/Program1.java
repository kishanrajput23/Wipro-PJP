package iooperations;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

class Program1 {
	public static void main(String[] args) {
		
		System.out.println("Enter the file name ");
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		
		int count=0;
		
		String file =sc.nextLine();

		try{
			FileReader fr = new FileReader(file+".txt");
			
			System.out.println("Enter the character to be counted ");
			char character1=sc1.nextLine().charAt(0);
			char character2='x';
			
			if(Character.isLowerCase(character1))
			{
				character2=Character.toUpperCase(character1);
			}
			else if(Character.isUpperCase(character1))
			{
				character2=Character.toLowerCase(character1);
			}
			
			int content;
			while ((content = fr.read()) != -1) 
			{
				
				if(content==(int)character1 || content==(int)character2)
				{
					count=count+1;
				}
				
			}
			System.out.println("File "+file+" has "+count+" instances of letter "+character1);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}