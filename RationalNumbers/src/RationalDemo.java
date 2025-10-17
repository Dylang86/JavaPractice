
public class RationalDemo {
    public static void main(String[] args) {
        Rational rationalOne = new Rational(3,67);
        Rational rationalTwo = new Rational(300, 6700);
        System.out.println(rationalOne);
        System.out.println(rationalTwo);
        System.out.println(rationalOne.equals(rationalTwo));

        System.out.println(Rational.add(rationalOne, rationalTwo));
        System.out.println(Rational.subtraction(rationalOne, rationalTwo));
        System.out.println(Rational.multiplication(rationalOne, rationalTwo));
        System.out.println(Rational.division(rationalOne, rationalTwo));

        System.out.println();
        Rational wholeNumberOne = new Rational(5);
        Rational rationalThree = new Rational(3,2);
        System.out.println(Rational.add(wholeNumberOne, rationalThree));
        System.out.println(Rational.subtraction(wholeNumberOne, rationalThree));

        System.out.println();
        System.out.println(rationalOne.add(rationalTwo));
        System.out.println(rationalOne.subtraction((rationalTwo)));
        System.out.println(rationalOne.multiplication(rationalTwo));
        System.out.println(rationalOne.division(rationalTwo));
    }
}