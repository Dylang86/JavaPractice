public class Temperature {
    private float temperatureValue;
    private char scale;

    public Temperature() {
        temperatureValue = 0;
        scale = 'C';
    }

    public Temperature(float temperatureValue, char scale) {
        setTempAndScale(temperatureValue, scale);
    }

    public Temperature(float temperatureValue) {
        setTemperature(temperatureValue);
        scale = 'C';
    }

    public Temperature(char scale) {
        temperatureValue = 0;
        setScale(scale);
    }

    public void setTempAndScale(float temperatureValue, char scale) {
        this.temperatureValue = temperatureValue;
        this.scale = scale;
    }

    public void setTemperature(float temperatureValue) {
        this.temperatureValue = temperatureValue;
    }

    public void setScale(char scale) {
        this.scale = scale;
    }

    public float getTemperatureValue() {
        return temperatureValue;
    }

    public char getScale() {
        return scale;
    }

    public float getFahrenheit() {
        if (getScale() == 'F') {
            return getTemperatureValue();
        }
        float fahrenheit = (9 * (getTemperatureValue()) / 5) + 32;
        return Math.round(fahrenheit * 10f) / 10f;
    }

    public float getCelsius() {
        if (getScale() == 'C') {
            return getTemperatureValue();
        }
        float celsius = 5 * (getTemperatureValue() - 32) / 9;
        return Math.round(celsius * 10f) / 10f;
    }

    @Override
    public boolean equals(Object thatObj) {
        if (this == thatObj) {
            return true;
        }
        if (thatObj == null || getClass() != thatObj.getClass()) {
            return false;
        }
        return this.getCelsius() == ((Temperature) thatObj).getCelsius();
    }

    public boolean isGreaterThan(Temperature other) {
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        return this.getCelsius() > other.getCelsius();
    }

    public boolean isLessThan(Temperature other) {
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        return this.getCelsius() < other.getCelsius();
    }

    @Override
    public String toString() {
        return "The temperature is " + getTemperatureValue() + getScale() + ".";
    }

}