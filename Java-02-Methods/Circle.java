// Created by Kristie Nguyen on 9/9/2014
// Circle - Change radius of a circle and output the new radius
// and the area based on the new radius.
public class Circle
{
	// instance variable radius
	private double radius;

	// constructor
	public Circle()
    {
    	radius = 0;
    }

	// method to change radius
	public void setRadius (double newRadius)
    {
    	radius = newRadius;
    }

	// method to get radius
	public double getRadius()
    {
    	return radius;
    }
	// method to get area
	public double getArea()
    {
    	return radius * radius * Math.PI;
    }
}