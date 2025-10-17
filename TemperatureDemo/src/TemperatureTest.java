public class TemperatureTest {
    public static void main(String[] args){
        Temperature tempOne = new Temperature();
        System.out.println(tempOne.getTemperatureValue());
        System.out.println(tempOne.getScale());

        Temperature tempTwo = new Temperature(12, 'C');
        System.out.println(tempTwo.getTemperatureValue());
        System.out.println(tempTwo.getScale());
        System.out.println(tempTwo.getFahrenheit());
        //tempTwo.setTemperature(43);
        System.out.println(tempTwo.getCelsius());

        Temperature tempThree = new Temperature(12, 'C');
        System.out.println(tempTwo.equals(tempThree));
        tempThree.setScale('F');
        System.out.println(tempTwo.equals(tempThree));
        tempThree.setScale('C');
        tempThree.setTemperature(42);
        System.out.println(tempThree.getFahrenheit());

        Temperature tempFour = new Temperature(12);
        System.out.println(tempFour.getScale());
        System.out.println(tempFour.equals(tempTwo));
        System.out.println(tempFour.equals(tempOne));

        Temperature tempFive = new Temperature('F');
        System.out.println(tempFive.getCelsius());
        System.out.println(tempFive.isGreaterThan(tempFour));
        System.out.println(tempFive.isLessThan(tempFour));
        System.out.println(tempFour.getTemperatureValue());
        tempFive.setScale(tempFour.getScale());
        tempFive.setTemperature(tempFour.getTemperatureValue());
        System.out.println(tempFive.isGreaterThan(tempFour));
        System.out.println(tempFive.isLessThan(tempFour));
        System.out.println(tempFive.toString());

        Temperature tempSix = new Temperature();
        tempSix.setTempAndScale(0, 'C');

        Temperature tempSeven = new Temperature(212, 'F');
        System.out.println(tempSeven.equals(tempSix));

        System.out.println(tempSeven.getCelsius());
    }
}