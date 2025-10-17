public class StandardDeviation {
    private double[] partialArray;
    private int positionsUsed;

    public StandardDeviation(double[] partialArray, int positionsUsed) {
        this.partialArray = partialArray;
        this.positionsUsed = positionsUsed;
    }

    public void setPartialArray(double[] partialArray) {
        this.partialArray = partialArray;
    }

    public double[] getPartialArray() {
        return partialArray;
    }

    public void setPositionsUsed(int positionsUsed) {
        this.positionsUsed = positionsUsed;
    }

    public int getPositionsUsed() {
        return positionsUsed;
    }

    public static double standardDeviationCalc(double[] partialArray, int positionsUsed) {
        double average = 0;
        double SD = 0;
        for (int i = 0; i < positionsUsed; i++) {
            average += partialArray[i];
        }
        average = average / positionsUsed;

        for (int i = 0; i < positionsUsed; i++) {
            SD += Math.pow((partialArray[i] - average), 2);
        }
        SD = SD / positionsUsed;
        return Math.sqrt(SD);
    }
}