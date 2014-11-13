// Fig. 8.6: Time2Test.java
// Overloaded constructors used to initialize Time2 objects.

public class Time2Test 
{
   public static void main(String[] args)
   {

      Time2 t2 = new Time2(22, 58, 58);
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
   
   // displays a Time2 object in 24-hour and 12-hour formats
   private static void displayTime(String header, Time2 t)
   {
      System.out.printf("%s%n   %s%n   %s%n",
         header, t.toUniversalString(), t.toString());
   } 
} // end class Time2Test