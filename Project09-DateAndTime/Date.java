// Fig. 8.7: Date.java 
// Date class declaration.
/*
 * 8.8 (Enhancing Class Date) Modify class Date of Fig. 8.7 
 * to perform error checking on the initializer values for 
 * instance variables month, day and year (currently it validates 
 * only the month and day). Provide a method nextDay to increment 
 * the day by one. Write a program that tests method nextDay in a loop 
 * that prints the date during each iteration to illustrate that 
 * the method works correctly. Test the following cases:
a) incrementing into the next month and b) incrementing into the next year.
 */

public class Date 
{
   private int month; // 1-12
   private int day; // 1-31 based on month
   private int year; // any year

   private static final int[] daysPerMonth = 
      {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
   
   // constructor: confirm proper value for month and day given the year
   public Date(int month, int day, int year)
   {
      // check if month in range
      if (month <= 0 || month > 12)
         throw new IllegalArgumentException(
            "month (" + month + ") must be 1-12");

      // check if day in range for month
      if (day <= 0 || 
         (day > daysPerMonth[month] && !(month == 2 && day == 29)))
         throw new IllegalArgumentException("day (" + day + 
            ") out-of-range for the specified month and year");

      // check for leap year if month is 2 and day is 29
      if (month == 2 && day == 29 && !(year % 400 == 0 || 
           (year % 4 == 0 && year % 100 != 0)))
         throw new IllegalArgumentException("day (" + day +
            ") out-of-range for the specified month and year");

      // check for nonnegative years
      if (year < 0)
      {
    	  throw new IllegalArgumentException("year (" + year + 
    		") must be greater than 0");
      }
      this.month = month;
      this.day = day;
      this.year = year;

      System.out.printf(
         "Date object constructor for date %s%n", this);
   }
   
   public void 	nextDay()
   {
	   if (day < daysPerMonth[month])
	   {
		   day++;
	   } 
	   else
	   {
		   day = 1;
		   incrementMonth();
	   }
   }

   private void incrementMonth()
   {
	   if (month < 12)
	   {
		   month++;
	   }
	   else
	   {
		   month = 1;
		   incrementYear();
	   }
   }

   private void incrementYear()
   {
	   year++;
   }

   // return a String of the form month/day/year
   public String toString()
   { 
      return String.format("%d/%d/%d", month, day, year); 
   } 
} // end class Date
