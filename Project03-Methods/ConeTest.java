// Created by Kristie Nguyen on 9/11/2014
// ConeTest - Use main to test methods.

public class ConeTest
{
    public static void main(String [ ] args)
    {
    	// new cone object reference
        Cone myCone = new Cone();

        // procedure to change height
        double newHeight = 10.0;
        myCone.setHeight( newHeight );

        // outputs volume and surface area
        System.out.printf("The volume of the cone is %.1f.\n" , myCone.getVolume());
        System.out.printf("The surface area of the cone is %.1f.\n" , myCone.getSurfaceArea());
     }
}