// Created by Kristie Nguyen on 9/9/2014
// CircleTest - Test the class using main.

public class CircleTest
{
    public static void main(String [ ] args)
    {
    	// new circle object and reference
    	Circle myCircle = new Circle();
    	
        // change radius
    	double newRadius = 5.0;
        myCircle.setRadius( newRadius );

        // get and print radius and area
        System.out.printf("The radius of the circle is %.1f.\n" , myCircle.getRadius());
        System.out.printf("The area of the circle is %.1f." , myCircle.getArea());
     }
}