import java.util.Scanner;

public class DateSecondTry {
    private String month;
    private int day;
    private int year;

    public void writeOutput() {
        System.out.println(month + " " + day + ", " + year);
    }

    public void readInput() {
        Scanner getInput = new Scanner(System.in);
        System.out.println("Enter month, day, and year.");
        System.out.println("Do not use a comma.");
        month = getInput.next();
        day = getInput.nextInt();
        year = getInput.nextInt();
        getInput.close();
    }

    public int getDay() {
        return this.day;
    }

    public int getYear() {
        return this.year;
    }

    public int getMonth() {
        int gotMonth = 0;

        switch (month) {
            case "January":
                gotMonth = 1;
                break;
            case "February":
                gotMonth = 2;
                break;
            case "March":
                gotMonth = 3;
                break;
            case "April":
                gotMonth = 4;
                break;
            case "May":
                gotMonth = 5;
                break;
            case "June":
                gotMonth = 6;
                break;
            case "July":
                gotMonth = 7;
                break;
            case "August":
                gotMonth = 8;
                break;
            case "September":
                gotMonth = 9;
                break;
            case "October":
                gotMonth = 10;
                break;
            case "November":
                gotMonth = 11;
                break;
            case "December":
                gotMonth = 12;
                break;
            default:
                System.out.println("Fatal Error");
                System.exit(0);
        }
        return gotMonth;
    }



    public int getNextYear() {
        return year + 1;
    }

    public void happyGreeting() {
        for (int i = 0; i < day; i++) {
            System.out.println("Happy Days!");
        }
    }
}