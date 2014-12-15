// Created by Kristie Nguyen on 11/25/14
// ReverseString - an application that inputs a line of text,
// tokenizes the line with String method split 
// and outputs the tokens in reverse order.
// Use space characters as delimiters.

import java.util.Scanner;
import java.util.StringTokenizer;

public class ReverseString
{
	public static void main(String[] args)
	{
		// get sentence
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a sentence and press ENTER: ");
		String sentence = scanner.nextLine();

		// process user sentence
		String[] tokens = sentence.split(" ");

		// print tokens in reverse
		System.out.println("\nThe tokens in reverse are:\n");
		for ( int counter = tokens.length - 1; counter >= 0; counter-- )
		{
			System.out.println( tokens[counter] );
		}
	}
}
