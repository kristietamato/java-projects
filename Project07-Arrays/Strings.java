// Created by Kristie Nguyen on 10/18/2014.
// StringArray - Modifies a declared string array.

public class Strings 
{
	public static void main( String[] args )
	{
		final int ARRAY_LENGTH = 4;
		String[] stringArray = new String[ ARRAY_LENGTH ];
		
		System.out.println( "The strings in the array are:" );
		System.out.printf( "%-10s%-20s\n", "Index:", "Element:" );
		System.out.println();
		
		for ( int counter = 0; counter < stringArray.length; counter++ )
		{
				stringArray[ 0 ] =  "Hearts";
				stringArray[ 1 ] =  "Diamonds";
				stringArray[ 2 ] =  "Clubs";
				stringArray[ 3 ] = "Spades";
		}

		for ( int counter = 0; counter < stringArray.length; counter++ )
		System.out.printf( "%-10d%-20s\n", counter, stringArray[ counter ] );
	}
}