// Fig. 8.5: Time2.java
// Time2 class declaration with overloaded constructors.  
/* 8.7 (Enhancing Class Time2) Modify class Time2 of Fig. 8.5 
 * to include a tick method that increments the time stored 
 * in a Time2 object by one second. Provide method incrementMinute 
 * to increment the minute by one and method incrementHour to increment 
 * the hour by one. Write a program that tests the tick method, 
 * the incrementMinute method and the incrementHour method to ensure 
 * that they work correctly. Be sure to test the following cases: 
a) incrementing into the next minute,
b) incrementing into the next  hour and
c) incrementing into the next day (i.e., 11:59:59 PM to 12:00:00 AM). 
 */

public class Time2
{
   private int hour; // 0 - 23 "private" no one else can access this data, data is secure; default is public
   private int minute; // 0 - 59
   private int second; // 0 - 59

   // Time2 constructor: hour, minute and second supplied
   public Time2(int hour, int minute, int second) 
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
         "%02d:%02d:%02d", getHour(), getMinute(), getSecond());
   } 

   // convert to String in standard-time format (H:MM:SS AM or PM)
   public String toString()
   {
      return String.format("%d:%02d:%02d %s", 
         ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
         getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
   } 
}