// Created by Kristie Nguyen on 10/22/14.
// RectangleTest - tests Rectangle class

public class RectangleTest
{
    public static void main( String[] args )
    {
    	// new cone object reference
    	Rectangle myRectangle = new Rectangle();


        // test
        try
        {
        	myRectangle.setLengthAndWidth( 56.0f, 5.0f );
        }
        catch ( IllegalArgumentException e )
        {
        	System.out.printf( "Exception: %s\n\n", e.getMessage() );
        }

        // outputs volume and surface area
        System.out.printf("The perimeter of the rectangle is %.1f.\n" , myRectangle.getPerimeter());
        System.out.printf("The area of the rectangle is %.1f.\n" , myRectangle.getArea());
    }
}
