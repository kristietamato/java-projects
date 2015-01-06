// Created by Kristie Nguyen on 10/18/2014.
// ScorebookTest - main class to test Average class.

public class ScorebookTest 
{
	public static void main( String[] args )
	{
		double[] scores = { 7.572, 8.066, 8.186, 7.652, 41.860 };
		
		Scorebook myScorebook = new Scorebook( scores );
		myScorebook.getAverage();
		myScorebook.displayAverage();
	}
}
