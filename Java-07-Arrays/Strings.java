// Created by Kristie Nguyen on 10/18/2014.
// StringArray - Modifies a declared string array.

public class Strings
{
	public static void main( String[] args )
	{
		String[] stringArray = new String[ 4 ];

		System.out.println( "The strings in the array are:" );
		System.out.printf( "%-10s%-20s\n", "Index:", "Element:" );
		System.out.println();
		
		String temp = "string";

		for ( int counter = 0; counter < stringArray.length; counter++ )
		{
				temp = "string " + counter;
				stringArray[counter] = temp;
		}

		for ( int counter = 0; counter < stringArray.length; counter++ )
		System.out.printf( "%-10d%-20s\n", counter, stringArray[ counter ] );
	}
}