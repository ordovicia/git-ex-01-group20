/*
 * DaysOfMonth.java
 *  Print number of days in a given month and year.
 *
 * Compile it: % javac DaysOfMonth.java
 * and exec. : % java DaysOfMonth 2019 4
 *
 */
public class DaysOfMonth {
  public static void main(String[] args){
    int year = Integer.parseInt(args[0]);
    int month = Integer.parseInt(args[1]);
    System.out.printf("Month of %d/%d has %d days\n",
        month, year, daysofmonth(month, year));
  }
  static int daysofmonth(int month, int year) {
    int[] days = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    if(isLeapYear(year) && month == 2) {
      return 29;
    }
    return days[month-1];
  }
  static boolean isLeapYear(int year) {
    if(year % 400 == 0) {
      return true;
    } else if(year % 100 == 0) {
      return false;
    } else if(year % 4 == 0) {
      return true;
    } else {
      return false;
    }
  }
}
