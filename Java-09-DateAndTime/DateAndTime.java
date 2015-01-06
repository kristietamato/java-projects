// 8.12 (DateAndTime and Time Class) Create class DateAndTime that 
// combines the modified DateAndTime class of Exercise 8.7 and 
// the modified DateAndTime class of Exercise 8.8. Modify method 
// incrementHour to call method nextDay if the time is incremented 
// into the next day. Modify methods toString and toUniversalString 
// to output the DateAndTime in addition to the time. Write a program to 
// test the new class DateAndTime. Specifically, test incrementing 
// the time to the next day.

public class DateAndTime
{
   private int hour; // 0 - 23 "private" no one else can access this data, data is secure; default is public
   private int minute; // 0 - 59
   private int second; // 0 - 59
   private int month; // 1-12
   private int day; // 1-31 based on month
   private int year; // any year

   private static final int[] daysPerMonth = 
      {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
  
   // DateAndTime constructor: hour, minute and second supplied
   public DateAndTime(int hour, int minute, int second, int month, int day, int year) 
   { 
      if (hour < 0 || hour >= 24)
         throw new IllegalArgumentException("hour must be 0-23");

      if (minute < 0 || minute >= 60)
         throw new IllegalArgumentException("minute must be 0-59");

      if (second < 0 || second >= 60)
         throw new IllegalArgumentException("second must be 0-59");

      this.hour = hour;
      this.minute = minute; 
      this.second = second; 
      
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
         "DateAndTime object constructor for DateAndTime %s%n", this);
   } 

   public void setTime(int hour, int minute, int second)
   {
      if (hour < 0 || hour >= 24)
         throw new IllegalArgumentException("hour must be 0-23");

      if (minute < 0 || minute >= 60)
         throw new IllegalArgumentException("minute must be 0-59");

      if (second < 0 || second >= 60)
         throw new IllegalArgumentException("second must be 0-59");

      this.hour = hour;
      this.minute = minute; 
      this.second = second; 
   } 

   // validate and set hour 
   public void setHour(int hour) 
   { 
      if (hour < 0 || hour >= 24)
         throw new IllegalArgumentException("hour must be 0-23");

      this.hour = hour;
   } 

   // validate and set minute 
   public void setMinute(int minute) 
   { 
      if (minute < 0 || minute >= 60)
         throw new IllegalArgumentException("minute must be 0-59");

      this.minute = minute; 
   } 

   // validate and set second 
   public void setSecond(int second) 
   { 
      if (second < 0 || second >= 60)
         throw new IllegalArgumentException("second must be 0-59");

       this.second = second; 
   } 

   // Get Methods
   // get hour value
   public int getHour() 
   { 
      return hour; 
   } 

   // get minute value
   public int getMinute() 
   { 
      return minute; 
   } 

   // get second value
   public int getSecond() 
   { 
      return second; 
   } 

   // increment methods
   public void incrementHour()
   {
	   if (hour < 23)
	   {
		   hour++;
	   }
	   else
	   {
		   hour = 0;
		   nextDay();
	   }
   }

   public void incrementMinute()
   {
	   if (minute < 59)
	   {
		   minute++;
	   }
	   else 
	   {
		   minute = 0;
		   incrementHour();
	   }
   }
   
   public void incrementSecond()
   {
	   if(second < 59)
	   {
		   second++;
	   }
	   else
	   {
		   second = 0;
		   incrementMinute();
	   }
   }
   
   // convert to String in universal-time format (HH:MM:SS)
   public String toUniversalString()
   {
      return String.format(
         "%02d:%02d:%02d %d/%d/%d", getHour(), getMinute(), getSecond(), 
      		month, day, year);
   } 

   // convert to String in standard-time format (H:MM:SS AM or PM)
   public String toString()
   {
      return String.format("%d:%02d:%02d %s %d/%d/%d", 
         ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
         getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"), 
         	month, day, year);
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
}