public class Complex {
    private double real;
    private double imaginary;

    public Complex() {
        this.real = 0.0;
        this.imaginary = 0.0;
    }

    public Complex(double realPart) {
        this.real = realPart;
        this.imaginary = 0.0;
    }

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getReal() {
        return real;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    public double getImaginary() {
        return imaginary;
    }

    @Override
    public String toString() {
        String plusOrMinus = " + ";
        if(getImaginary() < 0) {
            plusOrMinus = " - ";
        }
        return getReal() + plusOrMinus + Math.abs(getImaginary())+ "i";
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        Complex otherObject = (Complex) other;
        return real == otherObject.real && imaginary == otherObject.imaginary;
    }

    public static Complex addition(Complex a, Complex b) {
        return new Complex(a.getReal() + b.getReal(), a.getImaginary() + b.getImaginary());
    }

    public static Complex subtraction(Complex a, Complex b) {
        return new Complex(a.getReal() - b.getReal(), a.getImaginary() - b.getImaginary());
    }

    public static Complex multiplication(Complex a, Complex b) {
        return new Complex(a.getReal() * b.getReal() - a.getImaginary() * b.getImaginary(),
                 a.getReal() * b.getImaginary() + a.getImaginary() * b.getReal());
    }

    public Complex addition(Complex other) {
        return new Complex (this.getReal() + other.getReal(), this.getImaginary() + other.getImaginary());
    }

    public Complex subtraction(Complex other) {
        return new Complex(this.getReal() - other.getReal(), this.getImaginary() - other.getImaginary());
    }

    public Complex multiplication (Complex other) {
        return new Complex(this.getReal() * other.getReal() - this.getImaginary() * other.getImaginary(),
                this.getReal() * other.getImaginary() + this.getImaginary() * other.getReal());
    }
}