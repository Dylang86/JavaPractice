
public class StandardDeviationTest {
    public static void main(String[] args) {
        double[] sdArrayOne = new double[4];
        sdArrayOne[0] = 1.3;
        sdArrayOne[1] = 2.6;
        sdArrayOne[2] = 3.7;
        System.out.println(StandardDeviation.standardDeviationCalc(sdArrayOne, 3));

        double[] sdArrayTwo = new double[5];

        System.out.println(StandardDeviation.standardDeviationCalc(sdArrayTwo, 0));
    }
}