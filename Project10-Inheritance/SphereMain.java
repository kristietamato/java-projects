// Created by Kristie Nguyen on 9/9/2014
// SphereMain - Test the Sphere class.

public class SphereMain
{
	public static void main(String [] args)
	{
		// new circle object
		Circle2D myCircle = new Circle2D(1.5, 2.5, 5.0);

		// print area of circle
		System.out.printf("%s", myCircle);

		System.out.println();
		System.out.println();

		// new circle object with arguments
		Sphere mySphere = new Sphere(1.5, 2.5, 2.0, 5.0);
 	
		// print sphere surface area using toString
		System.out.printf("%s\n\n", mySphere);
    
		// Sphere array
		// print headings
		System.out.printf("%s\n\n", "Sphere Array");
		System.out.printf("%8s\t%8s\t%8s\n", 
						  "Radius", "Area", "Volume");
		// array of pointers, allocates a point in memory for each index location
		Sphere [] sphereArray = new Sphere[10];
		// set radius from 0 to 9
		for (int counter = 0; counter < sphereArray.length; counter++)
		{
			sphereArray[counter] = new Sphere(0, 0, 0, 0);
			sphereArray[counter].setRadius((double) counter);
		}

		// prints radius, area, and volume of sphere
		mySphere.printSphereArray(sphereArray);
	}
}