import java.util.Scanner;

public class Trivia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TriviaGame[] game = setObjects();

        int totalPoints = 0;
        int round = 0;
        while (round != 5) {
            TriviaGame question = game[round];
            totalPoints += triviaGame(question, scanner);
            round++;
            System.out.println("Total Points: " + totalPoints);
            System.out.println();
        }
    }

    public static TriviaGame[] setObjects() {
        TriviaGame[] game = new TriviaGame[5];

        TriviaGame questionOne = new TriviaGame("What year was the USA founded?", "1776", 1);
        TriviaGame questionTwo = new TriviaGame("How old is Colton?", "18", 1);
        TriviaGame questionThree = new TriviaGame("What year in college is Dylan?", "Senior", 1);
        TriviaGame questionFour = new TriviaGame("What month is it?", "October", 1);
        TriviaGame questionFive = new TriviaGame("What month is Saleha's birthday?", "November",
                2);

        game[0] = questionOne;
        game[1] = questionTwo;
        game[2] = questionThree;
        game[3] = questionFour;
        game[4] = questionFive;
        return game;
    }


    public static int triviaGame(TriviaGame question, Scanner scanner) {
        System.out.println(question.getQuestion());
        System.out.println("Input your answer: ");
        String getInput = scanner.nextLine();

        if (getInput.equalsIgnoreCase(question.getAnswer())) {
            System.out.println("Correct!");
            return question.getPoints();
        } else {
            System.out.println("Incorrect");
            System.out.println("The answer is " + question.getAnswer());
        }
        return 0;
    }
}