public class Cartridge {
    private double ballisticsCoefficent;
    private double bulletWeight;
    private double velocity;
    private double zeroDistance; //Yards
    private String name;

    public Cartridge() {
        this.ballisticsCoefficent = 0;
        this.bulletWeight = 0;
        this.velocity = 0;
        this.zeroDistance = 0;
        this.name = "null";
    }

    public Cartridge(double bC, double weight, double velocity, double zeroDistance, String name) {
        this.ballisticsCoefficent = bC;
        this.velocity = velocity;
        this.zeroDistance = zeroDistance;
        this.bulletWeight = weight;
        this.name = name;
    }

    public void setBallisticsCoefficent(double ballisticsCoefficent) {
        this.ballisticsCoefficent = ballisticsCoefficent;
    }

    public double getBallisticsCoefficent() {
        return ballisticsCoefficent;
    }

    public void setBulletWeight(double bulletWeight) {
        this.bulletWeight = bulletWeight;
    }

    public double getBulletWeight() {
        return bulletWeight;
    }

    public void setVelocity(double velocity) {
        this.velocity = velocity;
    }

    public void setZeroDistance(double zeroDistance) {
        this.zeroDistance = zeroDistance;
    }

    public double getZeroDistance() {
        return zeroDistance;
    }

    public double getVelocity() {
        return velocity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Cartridge: " + getName() + " . \n" + "Bullet Weight: " + getBulletWeight() + " Grains. \n" + "Velocity: "
                + getVelocity() + " FPS. \n" + "Ballistics Coefficent: " + getBallisticsCoefficent() + " . \n" +
                 "Zero Distance: " + getZeroDistance() + " Yards.";
    }


}