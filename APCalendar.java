public class APCalendar {
   /*
    * @return true if year is a leap year and false otherwise
    */
   private static boolean isLeapYear(int year) {
     if((year%4==0) && (year%100!==0) && (year%400==0) ){
       return true;
     } else{
       return false;
     }
   }

   /**
    * @return the number of leap years between year1 and year2, inclusive
    *
    * Precondition: 0 <= year1 <= year2
    */
   public static int numberOfLeapYears(int year1, int year2) {
      boolean isLeapYear = year1.isLeapYear;
      boolean isLeapYear2 = year2.isLeapYear;
      if(isLeapYear && isLeapYear2){
        return year2 - year1;
      }else{
        System.out.println("One of the years is not a leap year.")
      }

   }

   /*
    * @return the value representing the day of the week for the first day of the year
    *         where 0 denotes Sunday, 1 denotes Monday, ..., and 6 denotes Saturday
    */
   private static int firstDayOfYear(int year) {
      // implementation not shown
   }

   /*
    * @return n, where month, day, and year specify the nth day of the year
    *         (returns 1 for January 1 -- month = 1, day = 1 -- of any year)
    *
    * Precondition: the data represented by month, day, and year is a valid date
    */
   private static int dayOfYear(int month, int day, int year) {
      // implementation not shown
   }

   /**
    * @return the value representing the day of the week for a given date
    *         (month, day, yes ear), where 0 denotes Sunday, 1 denotes Monday, ...,
    *         and 6 denotes Saturday
    *
    * Precondition: the date represented by month, day, year is a valid date
    */
   public static int dayOfWeek(int month, int day, int year) {
      // to be implemented by you in part B
   }

   // there may be instance variables, constructors, and other methods not shown
}
