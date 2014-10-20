// Created by Kristie Nguyen on 10/18/2014.
// StringArray - Use a loop to put strings into an array and outputs the strings.

public class StringArray 
{
	private String suits;
	
	public StringArray( String suitsString )
	{
		suits = suitsString;
	}
	
	public String toString()
	{
		return suits;
	}

	public double setArray( stringArray )
	{
		String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
		String temp = "";
		
		for ( int counter = 0; counter < String.length; counter++ )
		{
			temp = "Hearts" + counter;
			String[counter] = temp;
		}
	}
	
	public void displayArray()
	{
		String[] stringArray = new String[ 4 ];
		for ( int counter = 0; counter < stringArray.length; counter++ )
		System.out.printf("The strings in the array are: %s", stringArray[ counter ] );
	}
}
