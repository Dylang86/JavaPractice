public class DateOkDemo {
    private String month;
    private int day;
    private int year;

    private boolean dateOK(int monthInt, int dayInt, int yearInt) {
        if (dayInt > 31 || dayInt < 1 || monthInt > 12 || monthInt < 1 || yearInt < 1000 || yearInt > 9999) {
            return false;
        }
        if (dayInt == 31 && (monthInt == 4 || monthInt == 6 || monthInt == 9 || monthInt == 11)) {
            return false;
        }
        if (monthInt == 2) {
            if (dayInt == 29 && checkLeapYear(yearInt)) {
                return true;
            } else if (dayInt > 28) {
                return false;
            }
        }
        return true;
    }

    private boolean checkLeapYear(int yearInt) {
        if ((yearInt % 4 == 0 && yearInt % 100 != 0) || (yearInt % 400 == 0)) {
            return true;
        }
        return false;
    }
}