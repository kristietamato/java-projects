// Created by Kristie Nguyen on 10/11/2014.
// Calculator - Main program to run cases.

import java.util.Scanner;

public class CalculatorMain 
{
	public static void main( String[] args ) 
	{
		Calculator myCalculator = new Calculator();

		Scanner input = new Scanner( System.in );
		
		System.out.print("Enter a choice 1 - 10: ");
		int choice = input.nextInt();

		switch ( choice )
		{
			case 1:
				myCalculator.getAddition();
				break;

			case 2:
				myCalculator.getSubtraction();
				break;

			case 3:
				myCalculator.getMultiplication();
				break;

			case 4:
				myCalculator.getDivision();
				break;

			case 5:
				myCalculator.getRemainder();
				break;

			case 6:
				myCalculator.getPrimeNumbers();
				break;

			case 7:
				myCalculator.getCylinderSurfaceArea();
				break;

			case 8:
				myCalculator.getTypeOfConic();
				break;

			case 9:
				myCalculator.getEndAmountOnDeposit();
				break;

			case 10:
				myCalculator.getRemainingLoanBalance();
				break;
		}
	}

}
