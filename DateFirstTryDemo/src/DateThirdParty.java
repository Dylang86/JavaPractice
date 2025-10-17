public class DateThirdParty {
    private String month;
    private int day;
    private int year;

    public void setDate(int newMonth, int newDay, int newYear) {
        month = monthString(newMonth);
        day = newDay;
        year = newYear;
    }

    public double fractionDone(int targetDay) {
        double dayToDouble = day;
        return dayToDouble / targetDay;
    }

    public void advanceYear(int advance) {
        year = year + advance;
    }
}