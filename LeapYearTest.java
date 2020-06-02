import org.junit.Test;

public class LeapYearTest {
    
    @Test(expected = RuntimeException.class)
    public void testToSeeIfYearIsGoingToThrowAnErrorIfGreaterThan9999(){
        LeapYear.isLeapYear("10000");
    }

    @Test
    public void testToSeeIfSeveralYearsAreActuallyLeapYears(){
        LeapYear.isLeapYear("1988");
        LeapYear.isLeapYear("1979");
        LeapYear.isLeapYear("1982");
        LeapYear.isLeapYear("2004");
        LeapYear.isLeapYear("800");

    }




    
}