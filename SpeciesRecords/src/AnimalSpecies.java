public class AnimalSpecies {
    private String name;
    private int population;
    private double growthRate;

    public AnimalSpecies() {
        name = "";
        population = 0;
        growthRate = 0;
    }

    public AnimalSpecies(String name, int population, double growthRate) {
        setName(name);
        setPopulation(population);
        setGrowthRate(growthRate);

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setGrowthRate(double growthRate) {
        this.growthRate = growthRate;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public double getGrowthRate() {
        return growthRate;
    }

    public boolean endangered() {
        if (getGrowthRate() < 0) {
            return true;
        }
        return false;
    }

    public String checkEndangered () {
        if (endangered()) {
            return "";
        }
        return " not";
    }

    @Override
    public boolean equals(Object thatObj) {
        if (this == thatObj) {
            return true;
        }
        if (thatObj == null || getClass() != thatObj.getClass()) {
            return false;
        }
        if (this.getName() != ((AnimalSpecies) thatObj).getName()) {
            return false;
        }
        if (this.getPopulation() != ((AnimalSpecies) thatObj).getPopulation()) {
            return false;
        }
        if (this.getGrowthRate() != ((AnimalSpecies) thatObj).getGrowthRate()) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "The animal is named: " + getName() + " , the total population is " + getPopulation() + ". The" +
                " growth rate of the population is " + getGrowthRate() + "%." + " This animal is" + checkEndangered()
                + " endangered.";
    }
}