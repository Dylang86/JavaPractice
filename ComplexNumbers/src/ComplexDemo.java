public class ComplexDemo {
    public static void main(String[] args) {
        Complex complexOne = new Complex(4, 2);
        Complex complexTwo = new Complex(3, 5);

        System.out.println(complexOne);
        System.out.println(complexTwo);
        System.out.println(complexOne.equals(complexTwo));

        System.out.println(Complex.addition(complexOne, complexTwo));
        System.out.println(Complex.subtraction(complexOne, complexTwo));
        System.out.println(Complex.multiplication(complexOne, complexTwo));

        System.out.println();
        System.out.println(complexOne.addition(complexTwo));
        System.out.println(complexOne.subtraction(complexTwo));
        System.out.println(complexOne.multiplication(complexTwo));

        System.out.println(complexOne);
    }
}