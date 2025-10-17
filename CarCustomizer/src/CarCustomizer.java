
import java.awt.*;
import java.util.Scanner;
//change how switch works, I want to display the options then allow someone to set them and return the total cost as
// well as set the object value
//save objects and create as many new objects as they want.
public class CarCustomizer {
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);
        System.out.println("Welcome to the car configurator, this app will allow you to configure your own car, " +
                "then allow you to choose flexible financing options");
        Car car1 = new Car();
        customizationMenu(getInput, car1);
    }

    public static void customizationMenu(Scanner getInput, Car car1) {
        System.out.println("This is the customization menu:");
        System.out.println("1: Create new vehicle");
        System.out.println("2: Show saved vehicles");
        System.out.println("3: Paint color options");
        System.out.println("4: Body style options");
        System.out.println("5: Trim level options");
        System.out.println("6: Interior material options");
        System.out.println("7: Engine configuration");
        System.out.println("0: Exit customizer");
        System.out.println("Input the corresponding number to go to a specific option, or input 0 to exit");

        int userInput = getInput.nextInt();
        if (userInput < 0 || userInput > 7) {
            System.out.println("Error, input error, please try again");
            customizationMenu(getInput, car1);
        }
        switch (userInput) {
            case 1:
                createNewVehicle(getInput, car1);
                break;
            case 2:
                displaySavedVehicles(getInput, car1);
                break;
            case 3:
                paintColorOptions(getInput, car1);
                break;
            case 4:
                bodyStyleOptions(getInput, car1);
                break;
            case 5:
                trimLevelOptions(getInput, car1);
                break;
            case 6:
                interiorMaterialOptions(getInput, car1);
                break;
            case 7:
                engineOptions(getInput, car1);
                break;
            default:
                System.out.println("Thank you, goodbye");
                break;
        }
    }

    public static void createNewVehicle(Scanner getInput, Car car1) {
        System.out.println("You are creating a new customized vehicle.");
        int totalOptionsCost = 0;
        int basePrice = 22500;
        totalOptionsCost += bodyStyleOptions(getInput, car1);
        totalOptionsCost += paintColorOptions(getInput, car1);
        totalOptionsCost += trimLevelOptions(getInput, car1);
        totalOptionsCost += interiorMaterialOptions(getInput, car1);
        totalOptionsCost += engineOptions(getInput, car1);
        car1.setTotalCost(totalOptionsCost + basePrice);

        displaySavedVehicles(getInput, car1);

    }

    public static void displaySavedVehicles(Scanner getInput, Car car1) {
        System.out.println(car1.toString());
    }

    public static int bodyStyleOptions(Scanner getInput, Car car1) {
        System.out.println();
        System.out.println("In this section you will chose the body style options:");
        System.out.println("Current selection is: " + car1.getBodyStyle());
        System.out.println("Coupe: + $0");
        System.out.println("Sedan: + $1550");
        System.out.println("Input Coupe or Sedan: ");
        String bodyStyleChoice = getInput.next();

        if (bodyStyleChoice.equalsIgnoreCase("coupe")) {
            car1.setBodyStyle("Coupe");
            System.out.println();
            System.out.println("Coupe option added.");
            return 0;
        } else if (bodyStyleChoice.equalsIgnoreCase("sedan")) {
            car1.setBodyStyle("Sedan");
            System.out.println();
            System.out.println("Sedan option added");
            return 1500;
        } else {
            System.out.println("Error, incorrect input, please try again");
            return bodyStyleOptions(getInput, car1);
        }

    }

    public static int paintColorOptions(Scanner getInput, Car car1) {
        System.out.println();
        System.out.println("In this section you will choose the color options:");
        System.out.println("Current selection is: " + car1.getPaintColor());
        System.out.println("White: $0");
        System.out.println("Grey: $250");
        System.out.println("Blue: $250");
        System.out.println("Silver: $250");
        System.out.println("Black: $500");
        System.out.println("Brown: $500");
        System.out.println();

        String colorOptions = getInput.next();
        colorOptions = colorOptions.toLowerCase();

        switch(colorOptions) {
            case "white":
                System.out.println("White color chosen");
                car1.setPaintColor("White");
                return 0;

            case "grey":
                System.out.println("Grey color chosen");
                car1.setPaintColor("Grey");
                return 250;
            case "blue":
                System.out.println("Blue color chosen");
                car1.setPaintColor("Blue");
                return 250;
            case "silver":
                System.out.println("Silver color chosen");
                car1.setPaintColor("Silver");
                return 250;
            case "black":
                System.out.println("Black color chosen");
                car1.setPaintColor("Black");
                return 500;
            case "brown":
                System.out.println("Brown color chosen");
                car1.setPaintColor("Brown");
                return 500;
            default:
                System.out.println("Error, this choice is not available, please try again.");
                return paintColorOptions(getInput, car1);
        }
    }

    public static int trimLevelOptions(Scanner getInput, Car car1) {
        System.out.println();
        System.out.println("In this section you will choose the trim level of the vehicle");
        System.out.println("Current selection is: " + car1.getTrimLevel());
        System.out.println("Base: $0");
        System.out.println("Premium: $2500");
        System.out.println("Continental: $4500");
        System.out.println("Presidential: $6800");
        System.out.println();

        String trimChoice = getInput.next();
        trimChoice = trimChoice.toLowerCase();
        switch (trimChoice) {
            case "base":
                System.out.println("Base level chosen");
                car1.setTrimLevel("Base");
                return 0;
            case "premium":
                System.out.println("Premium level chosen");
                car1.setTrimLevel("Premium");
                return 2500;
            case "continental":
                System.out.println("Continental level chosen");
                car1.setTrimLevel("Continental");
                return 4500;
            case "presidential":
                System.out.println("Presidential level chosen");
                car1.setTrimLevel("Presidential");
                return 6800;
            default:
                System.out.println("Error, choice not available");
                return trimLevelOptions(getInput, car1);
        }
    }

    public static int interiorMaterialOptions(Scanner getInput, Car car1) {
        System.out.println();
        System.out.println("In this section you will choose the type of interior material the vehicle will have");
        System.out.println("Cloth: $0");
        System.out.println("Vinyl: $1250");
        System.out.println("Leather: $2800");
        System.out.println();

        String materialChoice = getInput.next();
        materialChoice = materialChoice.toLowerCase();

        switch (materialChoice) {
            case "cloth":
                System.out.println("Cloth material chosen");
                car1.setInteriorMaterial("Cloth");
                return 0;
            case "vinyl":
                System.out.println("Vinyl material chosen");
                car1.setInteriorMaterial("Vinyl");
                return 1250;
            case "leather":
                System.out.println("Leather material chosen");
                car1.setInteriorMaterial("Leather");
                return 2800;
            default:
                System.out.println("Error, choice not available");
                return interiorMaterialOptions(getInput, car1);
        }
    }

    public static int engineOptions(Scanner getInput, Car car1) {
        System.out.println();
        System.out.println("In this section you will choose the engine options for the vehicle");
        System.out.println("V6 298HP: $0");
        System.out.println("V8 440HP: $5500");
        System.out.println("V10 538HP: $12300");
        System.out.println("Input V6, V8, or V10.");
        System.out.println();

        String enginechoice = getInput.next();
        enginechoice = enginechoice.toLowerCase();

        switch (enginechoice) {
            case "v6":
                System.out.println("V6 option chosen");
                car1.setEngineConfiguration("V6");
                return 0;
            case "v8":
                System.out.println("V8 option chosen");
                car1.setEngineConfiguration("V8");
                return 5500;
            case "v10":
                System.out.println("V10 option chosen");
                car1.setEngineConfiguration("V10");
                return 12300;
            default:
                System.out.println("Error, choice not available");
                return engineOptions(getInput, car1);
        }
    }
}