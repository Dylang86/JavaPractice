import java.util.Scanner;

public class JudgeScores {
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);
        float [] getScores = getJudgeScores(getInput);
        float difficultyScore = getDivingDifficultyModifier(getInput);
        System.out.println("Divers score is " + calculateDivingScore(getScores, difficultyScore));
    }

    public static float getDivingDifficultyModifier(Scanner getInput) {
        System.out.println("Input the degree of difficulty for the dive between 1.2 and 3.8 points.");
        float score = getInput.nextFloat();
        if (score > 3.8 || score < 1.2) {
            System.out.println("Score out of bounds.");
            return getDivingDifficultyModifier(getInput);
        }
        return score;
    }

    public static float[] getJudgeScores(Scanner getInput) {
        float[] judgeScoresArray = new float[7];
        int i = 0;
        while (i != 7) {
            System.out.println("Input a score between 0 and 10. Judge " + (i + 1));
            float judgeInput = getInput.nextFloat();
            if (judgeInput < 0 || judgeInput > 10) {
                System.out.println("Error, score out of bounds.");
                continue;
            } else {
                judgeScoresArray[i] = judgeInput;
                i++;
            }
        }
        return judgeScoresArray;
    }

    public static float calculateDivingScore(float[] getScores, float divingDifficultyScore) {
        float min = getScores[0];
        float max = 0;
        float total = 0;

        for (float score : getScores) {
            total += score;
            if (score > max) {
                max = score;
            }
            if (score < min) {
                min = score;
            }
        }
        return ((total - (max + min)) * divingDifficultyScore) * (float) .6;
    }
}