// Created by Kristie Nguyen on 9/26/2014.
// SphereLoop - Computes the volume of a sphere with a loop to test 
// the function wherein the sphere radius ranges from 1 to 100.

public class SphereLoop
{
    // function to get and print volume
    public void getVolume()
    {
    	double localRadius;
    	double localVolume;
    	for ( localRadius = 1.0; localRadius <= 100.0; localRadius++)
    	{
            localVolume = Math.PI * localRadius * localRadius * localRadius * (4.0/3.0);
            System.out.printf( "%.1f\n" , localVolume );
        }
    }
}