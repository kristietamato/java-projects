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
		length = 1;
		width = 1;
	}

	// set length
	public void setLength( float newLength )
	{
		length = newLength;
	}

	// set width
	public void setWidth( float newWidth )
	{
		width = newWidth;
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