import java.util.Scanner;

public class AirplaneSeatChart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] seatingChart = createSeating();
        while(true) {
            pickSeat(seatingChart, scanner);
            System.out.println();
            printSeating(seatingChart);
            System.out.println();
            System.out.println("Continue Y/N");
            String userInput = scanner.nextLine();
            if (userInput.equalsIgnoreCase("n")) {
                break;
            }

            if (booked(seatingChart) == true) {
                System.out.println("The Plane is completely booked");
                break;
            }

        }

    }

    public static char[][] createSeating() {
        char[][] seating = new char[7][5];
        int row = 1;

        for (int x = 0; x < 7; x++) {
            seating[x][0] = (char) (row + '0');
            for (int i = 0; i < 1; i++) {
                seating[x][i + 1] = 'A';
                seating[x][i + 2] = 'B';
                seating[x][i + 3] = 'C';
                seating[x][i + 4] = 'D';
                row++;
            }
        }
        return seating;
    }

    public static char[][] pickSeat(char[][] seatingChart, Scanner scanner) {
        System.out.println("Pick a seat, Ex: 1C");
        printSeating(seatingChart);
        String userInput = scanner.nextLine();

        if (userInput.length() != 2) {
            System.out.println("Incorrect input");
            return pickSeat(seatingChart, scanner);
        }

        int row = (userInput.charAt(0) - '0') - 1;


        char letter = userInput.charAt(1);
        int seatNumber;

        switch (Character.toLowerCase(letter)) {
            case 'a':
                seatNumber = 1;
                break;
            case 'b':
                seatNumber = 2;
                break;
            case 'c':
                seatNumber = 3;
                break;
            case 'd':
                seatNumber = 4;
                break;
            default:
                System.out.println("Incorrect Seat Input");
                return pickSeat(seatingChart, scanner);
        }

        if (seatingChart[row][seatNumber] == 'X') {
            System.out.println("Seat already taken");
            return pickSeat(seatingChart, scanner);
        }

        seatingChart[row][seatNumber] = 'X';

        return seatingChart;
    }

    public static boolean booked(char[][]seatingChart) {
        for (int i = 0; i < seatingChart.length; i++) {
            for (int x = 1; x < 5; x++) {
                if (seatingChart[i][x] != 'X') {
                    return false;
                }
            }
        }
        return true;
    }

    public static void printSeating(char[][] seatingChart) {
        for (int i = 0; i < seatingChart.length; i++) {
            System.out.print(seatingChart[i][0] + " ");
            System.out.print(seatingChart[i][1] + " ");
            System.out.print(seatingChart[i][2] + " ");
            System.out.print(seatingChart[i][3] + " ");
            System.out.print(seatingChart[i][4]);
            System.out.println();
        }
    }
}