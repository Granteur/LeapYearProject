public class LeapYearFinalSolution {
    //this was a leap year calculator I actually created for a Udemy course, so I'm using it to craft this problem
    public static boolean isStillLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        } else if (year % 4 == 0 && year % 100 != 0) {
            return true;
        } else if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
}