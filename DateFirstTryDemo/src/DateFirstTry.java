public class DateFirstTry {
    public String month;
    public int day;
    public int year;

    public void writeOutput() {
        System.out.println(month + " " + day + ", " + year);
    }

    public void makeItNewYears() {
        month = "January";
        day = 1;
    }

    public void yellIfNewYear() {
        if (month.equals("January") && day == 1) {
            System.out.println("Hurrah!");
        } else {
            System.out.println("Not New Year's Day");
        }
    }
}