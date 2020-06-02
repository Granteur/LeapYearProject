

public class LeapYear{
    public static boolean isLeapYear(String year){
        boolean leapYear = false;
        int numberYear = Integer.parseInt(year); // makes year a string
        if (numberYear > 9999){
            throw new RuntimeException("Come back from the future, you've gone too far!");
        } else if (isDivisibleBy4(numberYear)){
            leapYear = true;
        } else if (isDivisibleByHundreds(numberYear)){
            leapYear = true;
        }
        return leapYear;
    }

    private static boolean isDivisibleBy4(int numberYear){
        //checks to see if a number is divisible by 4
        return numberYear % 4 == 0;
    }
    private static boolean isDivisibleByHundreds(int numberYear){
        //since it's only a leap year if its divisible by both 100 and 400, i put them both in 1 method
        return ((numberYear%100==0)&&(numberYear%400==0)); 
    }



}