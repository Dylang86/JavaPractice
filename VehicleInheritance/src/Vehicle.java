public class Vehicle {
    private String manufacturer;
    private int numCylinders;
    private Person owner;

    public Vehicle () {
        this.manufacturer = "";
        this.numCylinders = 0;
        this.owner = null;
    }

    public Vehicle(String manufacturer, int numCylinders, Person owner) {
        this.manufacturer = manufacturer;
        this.numCylinders = numCylinders;
        this.owner = owner;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setNumCylinders(int numCylinders) {
        this.numCylinders = numCylinders;
    }

    public int getNumCylinders() {
        return numCylinders;
    }

    public void setOwner(Person owner){
        this.owner = owner;
    }

    public Person getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return "This vehicle was built by " + getManufacturer()  + " with a " + getNumCylinders() +
                " cylinder motor, and is owned by" + getOwner();
    }

    public static void main(String[] args) {
        Person dylan = new Person("Dylan");
        Vehicle vehicleOne = new Vehicle("Ford", 8, dylan);
        Truck truckOne = new Truck(vehicleOne.getManufacturer(), vehicleOne.getNumCylinders(), vehicleOne.getOwner(),
                1200, 5500);
        System.out.println(truckOne);
    }
}
