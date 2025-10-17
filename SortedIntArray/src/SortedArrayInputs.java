import java.util.InputMismatchException;
import java.util.Scanner;

public class SortedArrayInputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        countArrayElements(scanner);
    }

    public static void countArrayElements(Scanner scanner) {
        int[] intArray = sortArray(fillIntArray(scanner));
        int count = 1;
        System.out.println("N   Count");

        for (int i = 0; i < intArray.length; i++) {
            if (i + 1 == intArray.length) {
                System.out.println(intArray[i] + "   " + count);
                break;
            } else if (intArray[i] != intArray[i + 1]) {
                System.out.println(intArray[i] + "   " + count);
                count = 1;
            } else if (intArray[i] == intArray[i + 1]) {
                count++;
            }
        }
    }

    public static int[] fillIntArray(Scanner scanner) {
        int[] tempIntArray = new int[50];
        int count = 0;
        while(true) {
            System.out.println("Input ints, input a non int to exit.");
            try {
                if (count == 50) {
                    System.out.println("Input limit reached.");
                    break;
                }
                int number = scanner.nextInt();
                tempIntArray[count] = number;
                count++;
            } catch (InputMismatchException e) {
                System.out.println("Exiting.");
                scanner.next();
                break;
            }
        }

        int[] correctSizeIntArray = new int[count];
        for (int i = 0; i < correctSizeIntArray.length; i++) {
            correctSizeIntArray[i] = tempIntArray[i];
        }
        return correctSizeIntArray;
    }

    public static int[] sortArray(int[] intArray) {
        for (int i = 0; i < intArray.length - 1; i++) {
            for (int x = 0; x < intArray.length - i - 1; x++) {
                if (intArray[x] > intArray[x + 1]) {
                    int temp = intArray[x];
                    intArray[x] = intArray[x + 1];
                    intArray[x + 1] = temp;
                }
            }
        }
        return intArray;
    }

    public static void printArray(int[] intArray) {
        for (int index : intArray) {
            System.out.println(index);
        }
    }

}