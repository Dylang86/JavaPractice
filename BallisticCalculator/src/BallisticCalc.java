public class BallisticCalc {
    public static void main(String[] args) {
        Cartridge sixFiveCreedmoor = new Cartridge(.48, 127, 2800, 100, "6.5 Creedmoor");
        System.out.println(sixFiveCreedmoor);
        Environmental environmentOne = new Environmental(33, 1253, 4, "NE");
        System.out.println(environmentOne.getAirDrag());
        System.out.println(environmentOne.calculateAirDensity(33, 1253));
    }
}