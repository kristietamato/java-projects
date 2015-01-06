// Created by Kristie Nguyen on 9/26/2014.
// RectangularSolid - Computes the volume of a rectangular solid.
// With a loop to test the function wherein
// the length of the rectangular solid ranges from 1 to 5,
// the width ranges from 10 to 20, and the height ranges from 30 to 40.

public class RectangularSolid
{
    // function to get and print volume
    public void getVolume()
    {
    	int localLength;
    	int localWidth;
    	int localHeight;
    	int localVolume;
    	for ( localLength = 1; localLength <= 5; localLength++)
    	{
    		for ( localWidth = 10; localWidth <= 20; localWidth++)
    		{
        		for ( localHeight = 30; localHeight <= 40; localHeight++)
        		{
        			localVolume = localLength * localWidth * localHeight;
        			System.out.printf("%d\n" , localVolume );
        		}
    		}
        }
    }
}