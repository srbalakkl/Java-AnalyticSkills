package LeapYearCalculatory;

public class LeapYear {
    public static boolean isLeapYear(int year) {
        boolean result = false;
        if (year > 0 && year < 9999) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    result = year % 400 == 0;
                } else return true;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(1922));
    }
}
