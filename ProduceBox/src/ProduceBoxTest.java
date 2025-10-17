import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProduceBoxTest {
    public static void main(String[] args) {
        String[] produceArray = new String[5];
        File file = new File("E:/JavaCoding/ProduceBox/src/RandomProduce.txt");
        try (Scanner scanner = new Scanner(file)) {
            for (int i = 0; i < produceArray.length; i++) {
                produceArray[i] = scanner.nextLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        BoxOfProduce boxOne = new BoxOfProduce();
        boxOne.setBundleOne(boxOne.getRandomItems(produceArray));
        boxOne.setBundleTwo(boxOne.getRandomItems(produceArray));
        boxOne.setBundleThree(boxOne.getRandomItems(produceArray));

        System.out.println(boxOne.toString());
        System.out.println("Would you like to replace any of these items? Enter Y or N");
        Scanner getInput = new Scanner(System.in);
        String userInput = getInput.nextLine();
        changeBox(getInput, userInput, boxOne, produceArray);
    }

    public static void displayBundleOptions(String[] produceArray) {
        System.out.println("Here are the options:");
        for (int i = 0; i < produceArray.length; i++) {
            System.out.println(produceArray[i]);
        }
    }

    public static void changeBox(Scanner getInput, String userInput, BoxOfProduce box, String[] produceArray) {
        if (userInput.equalsIgnoreCase("n")) {
            System.out.println("Thank you for your order, your box will contain " + box.getBundleOne() + ", " +
                    box.getBundleTwo() + ", " + box.getBundleThree());
        } else if (userInput.equalsIgnoreCase("y")) {
            System.out.println("Which item would you like to replace?");
            String replaceItem = getInput.nextLine();
            if (replaceItem.equalsIgnoreCase(box.getBundleOne())) {
                System.out.println("What item would you like instead?");
                displayBundleOptions(produceArray);
                userInput = getInput.nextLine();
                box.setBundleOne(userInput);
                System.out.println(box.toString());
            } else if (replaceItem.equalsIgnoreCase(box.getBundleTwo())) {
                System.out.println("What item would you like instead?");
                displayBundleOptions(produceArray);
                userInput = getInput.nextLine();
                box.setBundleTwo(userInput);
                System.out.println(box.toString());
            } else if (replaceItem.equalsIgnoreCase(box.getBundleThree())) {
                System.out.println("What item would you like instead?");
                displayBundleOptions(produceArray);
                userInput = getInput.nextLine();
                box.setBundleTwo(userInput);
                System.out.println(box.toString());
            }
        }
    }

}