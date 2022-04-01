package iooperations;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input file name");
		String inputFilename = sc.nextLine();
		System.out.println("Enter the output file name");
		String outputFilename = sc.nextLine();
	
		File filein = new File(inputFilename);
		File fileout = new File(outputFilename);
		
		BufferedReader br = new BufferedReader(new FileReader(filein+".txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter(fileout+".txt"));
		
		int ch;
		while ((ch = br.read()) != -1) {
			bw.write(ch);
		};
		System.out.print("File is copied.");
		
		br.close();
		bw.close();
		sc.close();
	}
}
