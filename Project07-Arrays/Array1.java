// Created by Kristie Nguyen on 10/17/2014.
// A for loop for an array.

public class Array1
{
	public static void main( String[] args )
	{
		int[] arrayX = new int[ 3 ];
		int[] arrayY = { 1, 2, 3 };

		for ( int i = 0; i < 3; i++ )
			arrayX[ i ] = arrayY[ 2 - i ];
		System.out.printf("%d", arrayX);
	}
}
