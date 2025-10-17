public class Rational {
    private int numerator;
    private int denominator;

    public Rational() {
        this.numerator = 0;
        this.denominator = 1;
    }

    public Rational(int wholeNumber) {
        this.numerator = wholeNumber;
        this.denominator = 1;
    }

    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator < 0) {
            signNormalization();
            this.denominator = denominator * -1;
        } else {
            this.denominator = denominator;
        }
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setDenominator(int denominator) {
        if (denominator < 0) {
            signNormalization();
            this.denominator = denominator * -1;
        } else {
            this.denominator = denominator;
        }
    }

    public int getDenominator() {
        return denominator;
    }

    public void signNormalization() {
        setNumerator(getNumerator() * -1);
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        Rational o = (Rational) other;
        double thisFraction = (double) this.getNumerator() / (double) this.getDenominator();
        double otherFraction = (double) o.getNumerator() / (double) o.getDenominator();

        return thisFraction == otherFraction;
    }

    @Override
    public String toString() {
        return "The rational number is " + getNumerator() + "/" + getDenominator() + ".";
    }


    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }

    public static int findLCM(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        return Math.abs(a * b) / findGCD(a, b);
    }

    //static methods that return value of type rational, have two parameters of type rational

    public static Rational add(Rational a, Rational b) {
        int rationalLCM = findLCM(a.getDenominator(), b.getDenominator());
        int newNumeratorA = a.getNumerator() * (rationalLCM / a.getDenominator()) ;
        int newNumeratorB = b.getNumerator() * (rationalLCM / b.getDenominator());
        return new Rational(newNumeratorA + newNumeratorB, rationalLCM);
    }

    public static Rational subtraction(Rational a, Rational b) {
        int rationalLCM = findLCM(a.getDenominator(), b.getDenominator());
        int newNumeratorA = a.getNumerator() * (rationalLCM / a.getDenominator()) ;
        int newNumeratorB = b.getNumerator() * (rationalLCM / b.getDenominator());
        return new Rational(newNumeratorA - newNumeratorB, rationalLCM);
    }

    public static Rational multiplication(Rational a, Rational b) {
        int numerator = a.getNumerator() * b.getNumerator();
        int denominator = a.getDenominator() * b.getDenominator();
        return new Rational(numerator, denominator);
    }

    public static Rational division(Rational a, Rational b) {
        int numerator = a.getNumerator() * b.getDenominator();
        int denominator = a.getDenominator() * b.getNumerator();
        return new Rational(numerator, denominator);
    }

    public Rational add(Rational b) {
        int rationalLCM = findLCM(this.getDenominator(), b.getDenominator());
        int newNumeratorA = this.getNumerator() * (rationalLCM / this.getDenominator()) ;
        int newNumeratorB = b.getNumerator() * (rationalLCM / b.getDenominator());
        return new Rational(newNumeratorA + newNumeratorB, rationalLCM);
    }

    public Rational subtraction(Rational b) {
        int rationalLCM = findLCM(this.getDenominator(), b.getDenominator());
        int newNumeratorA = this.getNumerator() * (rationalLCM / this.getDenominator()) ;
        int newNumeratorB = b.getNumerator() * (rationalLCM / b.getDenominator());
        return new Rational(newNumeratorA - newNumeratorB, rationalLCM);
    }

    public Rational multiplication(Rational b) {
        int numerator = this.getNumerator() * b.getNumerator();
        int denominator = this.getDenominator() * b.getDenominator();
        return new Rational(numerator, denominator);
    }

    public Rational division(Rational b) {
        int numerator = this.getNumerator() * b.getDenominator();
        int denominator = this.getDenominator() * b.getNumerator();
        return new Rational(numerator, denominator);
    }
}