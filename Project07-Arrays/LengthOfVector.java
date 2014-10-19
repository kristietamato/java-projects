// Created by Kristie Nguyen on 10/18/2014.
// LengthOfVector - A function that finds the length of a vector.
// The length of a vector is the square root of
// the sum of the squares of the elements in a given array.

public class LengthOfVector
{
	public static void main( String[] args )
	{
		// input for array
		double[] arrayX = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		
		// output vector lengths.
		System.out.println("The lengths of the vectors are:");
		getLength( arrayX );
		for ( double length : arrayX )
			System.out.printf("%.1f\n", length );
	}
	
	public static void getLength( double[] arrayX )
	{
		double sum = 0;
		
		for (int counter = 0; counter < arrayX.length; counter++)
		{
			sum = sum + ( arrayX[ counter ] * arrayX[ counter ] );
			arrayX[ counter ] = Math.sqrt( sum );
		}
	}
}