import java.util.Scanner;

public class PasswordProtector {
    public static void main(String[] args) {
        UserPassword userOne = new UserPassword(76364);

        Scanner scanner = new Scanner(System.in);
        boolean correctPin = false;
        while (!correctPin) {
            correctPin = checkPin(scanner, userOne);
        }
    }

    public static int[] randomNumGenerator() {
        int[] numArray = new int[9];
        for (int i = 0; i < numArray.length; i++) {
            int randomNum = (int)(Math.random() * (4));
            numArray[i] = randomNum;
        }
        return numArray;
    }

    public static int getUserInput(Scanner scanner) {
        int userInput = scanner.nextInt();
        if (String.valueOf(userInput).length() != 5) {
            System.out.println("Incorrect Pin");
            return getUserInput(scanner);
        }
        return userInput;
    }

    public static boolean checkPin(Scanner scanner, UserPassword userOne) {
        int[] pinArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] randomArray = randomNumGenerator();

        System.out.print("PIN: ");
        for (int value : pinArray) {
            System.out.print(value + " ");
        }
        System.out.println();
        System.out.print("NUM: ");
        for(int value : randomArray) {
            System.out.print(value + " ");
        }
        System.out.println();
        System.out.println("Enter your pin corresponding to nums: ");
        int userInput = getUserInput(scanner);

        int[] chosenNums = new int[5];
        String nums = String.valueOf(userInput);
        for (int i = 0; i < 5; i++) {
                char digit = nums.charAt(i);
                int convertChar = Character.getNumericValue(digit);
                chosenNums[i] = convertChar;
        }

        int[] userPinArray = new int[5];
        String pin = String.valueOf(userOne.getPin());
        for (int i = 0; i < 5; i++) {
                char digit = pin.charAt(i);
                int convertChar = Character.getNumericValue(digit);
                userPinArray[i] = convertChar;
        }

        int correspondingNumber = 0;
        for (int i = 0; i < 5; i++) {
            int pinNum = userPinArray[i];
            for (int x = 0; x < pinArray.length; x++) {
                if (pinNum == pinArray[x]) {
                    correspondingNumber = randomArray[x];
                    if (correspondingNumber != chosenNums[i]) {
                        System.out.println("Incorrect Pin");
                        return false;
                    }
                }
                }
            }
        System.out.println("Correct Pin");
        return true;
    }
}