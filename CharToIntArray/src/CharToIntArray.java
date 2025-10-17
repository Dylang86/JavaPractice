import java.util.InputMismatchException;
import java.util.Scanner;
public class CharToIntArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IntArray intArrayOne = new IntArray(createIntArray(scanner));
        IntArray intArrayTwo = new IntArray(createIntArray(scanner));
        System.out.println();

        int[] sumArray = addition(intArrayOne.getIntArray(), intArrayTwo.getIntArray());
        IntArray intArrayThree = new IntArray(sumArray);
        IntArray.printIntArray(intArrayThree);

    }

    public static int[] createIntArray(Scanner scanner) {
        int[] partialIntArray = new int[20];
        String userInput = "";
        int userInputLength = 0;
        while (true) {
            try {
                System.out.println("Input a positive integer that has up to 20 digits");
                userInput = scanner.nextLine();
                userInputLength = userInput.length();
                if (userInput.charAt(0) == '-') {
                    System.out.println("Integer is negative");
                    continue;
                }

                if (userInput.length() > 20) {
                    System.out.println("Integer is too long");
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Incorrect input");
                scanner.next();
                return createIntArray(scanner);
            }
        }


        int[] correctSizedIntArray = new int[userInputLength];
        for (int i = 0; i < userInputLength; i++) {
            correctSizedIntArray[i] = Integer.parseInt(String.valueOf(userInput.charAt(i)));
        }
        return correctSizedIntArray;
    }

    public static int[] addition(int[] arrayOne, int[] arrayTwo) {
        int smallestArrayLength = arrayOne.length;
        int largestArrayLength = arrayTwo.length;
        int[] smallestArray = arrayOne;
        int[] largestArray = arrayTwo;


        if(arrayOne.length < arrayTwo.length) {
            smallestArrayLength = arrayOne.length;
        } else if (arrayOne.length > arrayTwo.length) {
            smallestArrayLength = arrayTwo.length;
            largestArrayLength = arrayOne.length;
            smallestArray = arrayTwo;
            largestArray = arrayOne;
        }

        int[] correctSizeSmallestArray = new int[largestArrayLength];
        int index = smallestArrayLength - 1;

        if (arrayOne.length != arrayTwo.length) {
            if (arrayOne.length < arrayTwo.length) {
                smallestArray = arrayOne;
            } else {
                smallestArray = arrayTwo;
            }

            for (int i = correctSizeSmallestArray.length - 1; i > 0; i--) {
                if (index == - 1) {
                    break;
                }
                correctSizeSmallestArray[i] = smallestArray[index];
                index--;
            }
        }

        int carry = 0;
        int count = 0;
        int[] additionArray = new int[20];
        index = smallestArrayLength - 1;
        int additionArrayIndex = 19;

        for (int i = largestArrayLength - 1; i >= -1; i--) {
            if (i == - 1) {
                additionArray[additionArrayIndex] = carry;
                break;
            }
            if (index == -1) {
                if (largestArray[i] + carry >= 10) {
                    additionArray[additionArrayIndex] = (largestArray[i] + carry) % 10;
                    continue;
                } else {
                    additionArray[additionArrayIndex] = largestArray[i] + carry;
                    carry = 0;
                    continue;
                }
            }
            if (largestArray[i] + smallestArray[index] + carry >= 10) {
                additionArray[additionArrayIndex] = (largestArray[i] + smallestArray[index] + carry) % 10;
                carry = 1;
            } else if (largestArray[i] + smallestArray[index] + carry < 10) {
                additionArray[additionArrayIndex] = largestArray[i] + smallestArray[index] + carry;
                carry = 0;
            }
            index--;
            additionArrayIndex--;
        }

        return additionArray;
    }
}