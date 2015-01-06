// Created by Kristie Nguyen on 9/9/2014
// Sphere - extends class circle; addition of z coordinate and a sphere loop

public class Sphere extends Circle2D
{
	private double zCoordinate;

	public Sphere(double xCoordinate, double yCoordinate, 
				  double zCoordinate, double radius) 
	{
		super(xCoordinate, yCoordinate, radius);
		setzCoordinate (zCoordinate);
	}
	
	// method to change zCoordinate
	public void setzCoordinate (double newzCoordinate)
    {
		zCoordinate = newzCoordinate;
    }
	
	// method to get yCoordinate
	public double getzCoordinate()
    {
    	return zCoordinate;
    }
	
	@Override
	public double getArea()
    {
    	return 4 * super.getArea();
    }

	public double getVolume()
    {
    	return (4.0/3.0) * Math.PI * getRadius() * getRadius() * getRadius();
    }
	
	@Override
	public String toString()
	{
	    return String.format("The surface area of the sphere with \nradius "
	    					 + "%.1f and center (%.1f, %.1f, %.1f) \nis %.1f.", 
        					  getRadius(), getxCoordinate(), 
        					  getyCoordinate(), getzCoordinate(), getArea());
    }
	
	public void printSphereArray(Sphere[] sphereArray)
	{
	  	for (int counter = 0; counter < sphereArray.length; counter++)
	  	{
	  		double area, volume;
	  		area = sphereArray[counter].getArea();
	  		volume = sphereArray[counter].getVolume();
	  	  	System.out.printf("%8.1f\t%8.1f\t%8.1f\n", (double)counter, area, volume);
	  	}

	}
}
