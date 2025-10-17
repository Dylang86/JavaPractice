import java.util.Scanner;
public class FractionTest {
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);
        System.out.println("Numerator: ");
        int numerator = getInput.nextInt();
        System.out.println("Denominator: ");
        int denominator = getInput.nextInt();
        Fraction fractionOne = new Fraction( numerator, denominator);

        boolean checkQuit = false;
        while (!checkQuit) {
            System.out.println(fractionOne.equals(createFraction(getInput)));
            System.out.println("Continue; Y / N");
            String checkContinue = getInput.next();
            System.out.println();
            if (checkContinue.equalsIgnoreCase("n")) {
                checkQuit = true;
            } else if (checkContinue.equalsIgnoreCase("y")) {
                System.out.println();
            }
        }
    }

    public static Fraction createFraction(Scanner getInput) {
        System.out.println("Target Numerator: ");
        double numerator = getInput.nextDouble();
        System.out.println("Target Denominator: ");
        double denominator = getInput.nextDouble();
        return new Fraction(numerator, denominator);
    }
}