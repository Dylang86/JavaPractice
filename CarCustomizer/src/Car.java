public class Car {
    private String paintColor;
    private String bodyStyle;
    private String trimLevel;
    private String interiorMaterial;
    private String engineConfiguration;
    private int totalCost;

    public Car() {
        this.paintColor = "Paint not chosen";
        this.bodyStyle = "Body style not chosen";
        this.trimLevel = "Trim level not chosen";
        this.interiorMaterial = "Interior material not chosen";
        this.engineConfiguration = "Engine configuration not chosen";
        this.totalCost = 0;
    }

    public Car(String paint, String body, String trim, String interior, String engine, int cost) {
        this.paintColor = paint;
        this.bodyStyle = body;
        this.trimLevel = trim;
        this.interiorMaterial = interior;
        this.engineConfiguration = engine;
        this.totalCost = cost;
    }

    public void setPaintColor(String paint) {
        this.paintColor = paint;
    }

    public String getPaintColor() {
        return paintColor;
    }

    public void setBodyStyle(String body) {
        this.bodyStyle = body;
    }

    public String getBodyStyle() {
        return bodyStyle;
    }

    public void setTrimLevel(String trim) {
        this.trimLevel = trim;
    }

    public String getTrimLevel() {
        return trimLevel;
    }

    public void setInteriorMaterial(String interior) {
        this.interiorMaterial = interior;
    }

    public String getInteriorMaterial() {
        return interiorMaterial;
    }

    public void setEngineConfiguration(String engine) {
        this.engineConfiguration = engine;
    }

    public String getEngineConfiguration() {
        return engineConfiguration;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }

    public int getTotalCost() {
        return totalCost;
    }

    @Override
    public String toString() {
        return "The vehicle is a " + getBodyStyle()+ " " + getTrimLevel() + " model, with " + getPaintColor() + " paint" +
                ", a " + getInteriorMaterial() + " interior, and equipped with a " + getEngineConfiguration() + "." +
                " The total cost of this vehicle is $" + getTotalCost() + ".";
    }
}