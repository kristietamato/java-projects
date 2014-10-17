/* Created by Kristie Nguyen on 9/11/2014.
 * Cone - A Cone class for a 3D cone that includes:
 * 1. A Constructor
 * 2. Function Volume( )
 * 3. Function SurfaceArea( )
 * 4. get & set methods.
 * Area = PI * r * s where r is the radius of the base and s is the slant height
 * Volume = PI * r * r * h* (1/3) where h is the height
 * SA = Area + PI * r * r
 */

public class Cone
{
	// instance variables
	private double radius;
    private double slantheight;
    private double height;

    // class constructor
    public Cone()
    {
    	radius = 1.0;
    	slantheight = 1.0;
    	height = 1.0;
    }

    // function (method) to change height
    public void setHeight (double newHeight)
    {
    	height = newHeight;
    }

    // function to get radius
    public double getRadius()
    {
    	return radius;
    }

    // function to get volume of cone
    public double getVolume()
    {
    	return Math.PI * radius * radius * height * (1.0/3.0);
    }

    // function to get surface area of cone
    public double getSurfaceArea()
    {
    	return ( Math.PI * radius * slantheight ) + ( Math.PI * radius * radius );
    }
}
