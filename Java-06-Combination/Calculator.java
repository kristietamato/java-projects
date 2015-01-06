// Created by Kristie Nguyen on 10/11/2014.
// test commit
// Calculator - A program with choices for multiple 
// algebraic cases and outputs a solution for the chosen case.

import java.util.Scanner;

public class Calculator 
{
	// Prompts user for what type of operation to perform.
	// Give user different cases representing varying operations.
	// Take input from user and outputs prompt for required data for that case.
	
	// Process data for chosen case.

	Scanner input = new Scanner( System.in );
	
	// Case 1, addition of numbers
	public void getAddition()
	{
		System.out.printf("%s\n%s\n  %s\n  %s\n",
				"Enter the numbers to be added:",
				"Type the end-of-file inidicator to terminate input:",
				"On UNIX/Linux/Mac OS X type <Ctrl> d then press Enter",
				"On Windows type <Ctrl> z then press Enter");

		double number;
		double sum = 0;
		
		while ( input.hasNext() )
		{
			number = input.nextDouble();
			sum = sum + number;
		}

		System.out.println();
		System.out.printf("%s%.1f\n", "The sum is: ", sum );
		System.out.println();
	}

	// Case 2, subtraction of numbers
	public void getSubtraction()
	{
		System.out.println("Enter a number: ");
		double number1 = input.nextDouble();
		System.out.println("Enter the number to be subtracted: ");
		double number2 = input.nextDouble();
		double result;
		result = number1 - number2;
		
		// Output
		System.out.printf("%s%.1f", "The result is: ", result );
		System.out.println();
	}

	// Case 3, multiplication of numbers
	public void getMultiplication()
	{
		System.out.printf("%s\n%s\n  %s\n  %s\n",
				"Enter the numbers to multiply:",
				"Type the end-of-file inidicator to terminate input:",
				"On UNIX/Linux/Mac OS X type <Ctrl> d then press Enter",
				"On Windows type <Ctrl> z then press Enter");

		double number;
		double result = 1;
		
		while ( input.hasNext() )
		{
			number = input.nextDouble();
			result = ( result * number );
		}
		System.out.println();
		System.out.printf("%s%.2f\n", "The result is: ", result );
		System.out.println();
	}

	// Case 4, division of numbers (fraction to decimal conversion)
	// http://www.math.com/tables/general/arithmetic/fradec.htm
	public void getDivision()
	{
		System.out.println("Enter a number: \n ");
		double number1 = input.nextDouble();
		System.out.print(" / ");
		double number2 = input.nextDouble();
		double result;
		result = number1 / number2;
		
		// Output
		System.out.printf("%s%.1f", "= ", result );
		System.out.println();
	}

	// Case 5, finding the remainder
	public void getRemainder()
	{

	}
	// Case 6, find all prime numbers of a number
	public void getPrimeNumbers()
	{
		
	}
	
	// Case 7, surface area of cylinder
	// Surface Area of a Cylinder = 2 pi r 2 + 2 pi r h
	// http://www.math.com/tables/geometry/surfareas.htm
	public void getCylinderSurfaceArea()
	{
		
	}
	/* Case 8
	 * http://www.math.com/tables/algebra/conics.htm
	 * The General Equation for a Conic Section:
		Ax2 + Bxy + Cy2 + Dx + Ey + F = 0
		The type of section can be found from the sign of: B2 - 4AC
		If B2 - 4AC is...	then the curve is a...
		 < 0	ellipse, circle, point or no curve.
		 = 0	parabola, 2 parallel lines, 1 line or no curve.
		 > 0	hyperbola or 2 intersecting lines.
	 */
	public void getTypeOfConic()
	{
		
	}
	
	// Case 9, compound interest
	// amountOnDeposit = principal ( 1 + anualInterestRate ) ^ numberOfYears
	public void getEndAmountOnDeposit()
	{

		System.out.print("Enter principal or initial ammount e.g. '1000.21' : ");
		double principal = input.nextDouble();
		
		System.out.print("Enter yearly interest rate e.g. '0.05' : ");
		double annualInterestRate = input.nextDouble();
		
		System.out.print("Enter the number of year(s) e.g. '1, 2, 3...': ");
		int year = input.nextInt();
		
		double endAmountOnDeposit;
		System.out.println();
		
		for (int count = 1; count <= year; count++)
		{
			System.out.printf("%s%20s\n", "Year", "Amount on deposit");
			endAmountOnDeposit = principal * Math.pow( 1.0 + annualInterestRate, count );
			System.out.printf("%4d%,20.2f\n", count, endAmountOnDeposit );
			System.out.println();
		}
	}
	
	// Case 10, remaining loan balance
	// http://www.math.com/tables/general/interest.htm
	public void getRemainingLoanBalance()
	{
		
	}
	
	// Prompt user option to choose another case or exit.
	// Repeat.
	// Exit.
	
}
