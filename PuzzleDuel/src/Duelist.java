public class Duelist {
    private String name;
    private double accuracy;
    private boolean alive;

    public Duelist() {
        this.name = "";
        this.accuracy = 0;
        this.alive = false;
    }

    public Duelist(String name, double accuracy, boolean alive) {
        this.name = name;
        this.accuracy = accuracy;
        this.alive = alive;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAccuracy(double accuracy) {
        this.accuracy = accuracy;
    }

    public double getAccuracy() {
        return accuracy;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public boolean checkAlive() {
        return alive;
    }

    public void shootAtTarget(Duelist target) {
        double rollHit = (Math.random());
        if (rollHit <= this.getAccuracy()) {
            target.setAlive(false);
        }
    }
}