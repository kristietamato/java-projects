public class DateAndTimeTest 
{
   public static void main(String[] args)
   {
      DateAndTime t2 = new DateAndTime(22, 58, 58, 1, 1, 2014);
      displayTime("t2: specified with 22, 58, 58", t2);
      t2.incrementHour();
      displayTime("t2: hour incremented", t2);
      t2.incrementMinute();
      displayTime("t2: minute incremented", t2);
      t2.incrementSecond();
      displayTime("t2: second incremented", t2);
      t2.incrementSecond();
      displayTime("t2: second incremented to the next day", t2);
   }
   
   // displays a DateAndTime object in 24-hour and 12-hour formats
   private static void displayTime(String header, DateAndTime t)
   {
      System.out.printf("%s%n   %s%n   %s%n",
         header, t.toUniversalString(), t.toString());
   } 
} // end class Time2Test