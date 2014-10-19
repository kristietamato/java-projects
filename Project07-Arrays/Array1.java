// Created by Kristie Nguyen on 10/17/2014.
// Array1 - find values of an array given another array.

public class Array1
{
	public static void main( String[] args )
	{
		int[] arrayX = new int[ 3 ];
		int[] arrayY = { 1, 2, 3 };

		for ( int counter = 0; counter < 3; counter++ )
		{
			arrayX[ counter ] = arrayY[ 2 - counter ];
			System.out.printf("%d ", arrayX[counter]);
		}
	}
}
