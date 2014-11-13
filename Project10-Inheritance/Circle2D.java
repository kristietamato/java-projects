// Created by Kristie Nguyen on 11/8/2014
// Circle2D - computes area of a circle

public class Circle2D
{
	// instance variables
	private double xCoordinate;
	private double yCoordinate;
	private double radius;

	// constructor
	public Circle2D(double x, double y, double r)
    {
		xCoordinate = x;
		yCoordinate = y;
    	radius = r;
    }

	// method to change xCoordinate
	public void setxCoordinate (double x)
    {
		xCoordinate = x;
    }

	// method to get xCoordinate
	public double getxCoordinate()
    {
    	return xCoordinate;
    }
	
	// method to change yCoordinate
	public void setyCoordinate (double y)
    {
		yCoordinate = y;
    }

	// method to get yCoordinate
	public double getyCoordinate()
    {
    	return yCoordinate;
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
	
	public String toString()
	{
	    return String.format("The area of the circle with radius %.1f"
	    					 + " \nand center (%.1f, %.1f) is %.1f.", 
        					  getRadius(), getxCoordinate(), 
        					  getyCoordinate(), getArea());
    }
}