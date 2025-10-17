
public class Environmental {
    private final double GRAVITY = 9.80665; // m/s^2
    private final double ABSOLUTE_KELVIN = 288.15;
    private double airDrag;
    private double temperature;
    private double altitude;
    private double windSpeed;
    private String windDirection; //N, E, S, W, Se, Sw, NW, NNE, ENE;

    public Environmental() {
        this.temperature = 0;
        this.altitude = 0;
        this. windSpeed = 0;
        this.windDirection = "Null";
    }

    public Environmental(double temperature, double altitude, double windSpeed, String windDirection) {
        this.temperature = temperature;
        this.altitude = altitude;
        this.windSpeed = windSpeed;
        this.windDirection = windDirection;
        this.airDrag = calculateAirDrag(temperature, altitude, windSpeed);
    }

    public void setAirDrag(double airDrag) {
        this.airDrag = airDrag;
    }

    public double getAirDrag() {
        return airDrag;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }

    public double getAltitude() {
        return altitude;
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public void setWindDirection(String windDirection) {
        this.windDirection = windDirection;
    }

    public String getWindDirection() {
        return windDirection;
    }

    public double calculateAirDrag(double temperature, double altitude, double windSpeed) {
        return 0.0;
    }

    //Fix math
    public double calculateAirDensity(double temperature, double altitude) {
        altitude = feetToMeters(altitude);
        double atmopshereicPressure = Math.pow((101325 * (1 - (0.0065 * altitude) / 288.15)), 5.2559);
        return atmopshereicPressure / ABSOLUTE_KELVIN * airTempToKelvin(temperature);
    }

    public double convertWindSpeedDirection(String windDirection) {
        return 0.0;
    }

    public double airTempToKelvin(double temperature) {
        return (temperature - 32) * 5/9 + 273.15;
    }

    public static double feetToMeters(double feet) {
        return feet / 3.281;
    }

}