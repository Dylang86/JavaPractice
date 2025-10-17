public class Truck extends Vehicle {
    private double loadCapacity;
    private int towingCapactiy;

    public Truck(String manufacturer, int numCylinders, Person owner, double loadCapacity, int towingCapactiy) {
        super(manufacturer, numCylinders, owner);
        this.loadCapacity = loadCapacity;
        this.towingCapactiy = towingCapactiy;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setTowingCapactiy(int towingCapactiy) {
        this.towingCapactiy = towingCapactiy;
    }

    public int getTowingCapactiy() {
        return towingCapactiy;
    }

    @Override
    public String toString() {
        return "This is a truck manufactured by " + getManufacturer() + ". With a " + getNumCylinders() + " cylinder " +
                "motor, and a load capacity of " + getLoadCapacity() + " and a towing capacity of " +
                getTowingCapactiy() + ". Owned by " + getOwner();
    }
}