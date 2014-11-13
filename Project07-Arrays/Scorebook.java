// Created by Kristie Nguyen on 10/18/2014.
// Scorebook - Gets the average of an array of scores.

public class Scorebook 
{
	private double[] scores;
	
	public Scorebook( double[] scoresArray )
	{
		scores = scoresArray;
	}

	public double getAverage()
	{
		double total = 0;
		
		for ( double score : scores )
		{
			total = total + score;
		}
		return ( total / scores.length );
	}
	
	public void displayAverage()
	{
		System.out.printf("The average score is: %.2f", getAverage() );
	}
}
