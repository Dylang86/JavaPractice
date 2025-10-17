import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] inputWord = userInput(scanner);
        checkFile(inputWord);
    }

    public static char[] userInput(Scanner scanner) {
        System.out.println("Input a word.");
        String getInput = scanner.nextLine();

        char[] inputToArray = new char[getInput.length()];
        for (int i = 0; i < inputToArray.length; i++) {
            inputToArray[i] = getInput.charAt(i);
        }
        return inputToArray;
    }

    public static char[] uniqueLettersArray(char[] inputWord) {
        char[] charArray = new char[inputWord.length];
        for (int i = 0; i < inputWord.length; i++) {
            char letter = inputWord[i];
            for (int x = 0; x < inputWord.length; x++) {
                if (letter == charArray[x]) {
                    break;
                } else if (x == inputWord.length - 1) {
                    charArray[i] = letter;
                }
            }
        }

        int count = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] != '\u0000') {
                count++;
            }
        }

        char[] correctLengthCharArray = new char[count];
        int index = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] != '\u0000') {
                correctLengthCharArray[index] = charArray[i];
                index++;
            }
        }
        return correctLengthCharArray;
    }

    public static int[] uniqueLettersAmount(char[] inputWord) {
        char[] charArray = uniqueLettersArray(inputWord);
        int[] letterCountArray = new int[charArray.length];

        for (int i = 0; i < charArray.length; i++) {
            int count = 0;
            char letter = charArray[i];
            for (int x = 0; x < inputWord.length; x++) {
                if (letter == inputWord[x]) {
                    count++;
                }
                if (x == inputWord.length - 1) {
                    letterCountArray[i] = count;
                }
            }
        }
        return letterCountArray;
    }

    public static boolean compareArrays(String line, char[] inputWord) {
        int[] letterCountArray = uniqueLettersAmount(inputWord);
        char[] uniqueLetterArray = uniqueLettersArray(inputWord);

        int index = 0;
        while (true) {
            for (int i = 0; i < line.length(); i++) {
                char letter = Character.toLowerCase(line.charAt(i));
                for (int x = 0; x < uniqueLetterArray.length; x++) {
                    if (letter == uniqueLetterArray[x] && letterCountArray[x] > 0) {
                        letterCountArray[x]--;
                        break;
                    } else if (letter == uniqueLetterArray[x] && letterCountArray[x] <= 0) {
                        return false;
                    }
                    if (x == uniqueLetterArray.length - 1 && letter != uniqueLetterArray[x]) {
                        return false;
                    }
                }
            }
            break;
        }
        return true;
    }

    public static void checkFile(char[] inputWord) {
        try {
            File file = new File("E:\\JavaCoding\\WordsFormingProgram\\src\\random_words.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (compareArrays(line, inputWord)) {
                    System.out.println(line);
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}