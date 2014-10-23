// Created by Kristie Nguyen on 10/22/14.
// Rectangle - Calculates a rectangle's perimeter and area; has set methods
// that verify that length and width are each floating-point numbers 
// larger than 0.0 and less than 20.0.

public class Rectangle
{
	// variables
	private float length;
	private float width;

	public Rectangle()
	{
		// constructor
		length = 1.0f;
		width = 1.0f;
	}

	// set length and width
	public void setLengthAndWidth( float newLength, float newWidth )
	{
		// validate length and width
		if ( newLength > 1.4E-45f && newLength < 340282346638528860000000000000000000000.000000f )
		{
			length = newLength;
			width = newWidth;
		}
		else
			throw new IllegalArgumentException( "length out of range" );
	}

	// get perimeter function
	public float getPerimeter()
	{
		return 2 * ( length + width);
	}

	// get area function
	public float getArea()
	{
		return length * width;
	}
}