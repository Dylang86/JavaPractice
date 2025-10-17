public class Fraction {
    private double numerator;
    private double denominator;

    public Fraction () {
        this.numerator = 0;
        this.denominator = 0;
    }

    public Fraction(double numerator, double denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public void setNumerator(double numerator) {
        this.numerator = numerator;
    }

    public double getNumerator() {
        return numerator;
    }

    public void setDenominator(double denominator) {
        this.denominator = denominator;
    }

    public double getDenominator() {
        return denominator;
    }

    public void displayFraction() {
        System.out.println((int) getNumerator() + "/" + (int) getDenominator());
    }

    @Override
    public boolean equals(Object otherFraction) {
        Fraction other = (Fraction) otherFraction;
        if (this == otherFraction) {
            return true;
        }
        if (otherFraction == null || getClass() != otherFraction.getClass()) {
            return false;
        }
        return this.numerator * other.denominator == other.numerator * this.denominator;
    }
}