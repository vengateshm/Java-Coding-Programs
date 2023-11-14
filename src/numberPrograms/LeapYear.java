package numberPrograms;

import java.util.GregorianCalendar;

public class LeapYear {
    public static boolean isLeapYear(Integer year) {
        return new GregorianCalendar().isLeapYear(year);
    }

    public static boolean isLeapYear1(Integer year) {
        boolean isLeapYear = false;
        if (year % 4 == 0) {
            // To identify century year
            if (year % 100 == 0) {
                isLeapYear = year % 400 == 0;
            } else {
                isLeapYear = true;
            }
        } else {
            isLeapYear = false;
        }
        return isLeapYear;
    }
}
