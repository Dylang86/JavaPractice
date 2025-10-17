public class BoxOfProduce {
    private String bundleOne;
    private String bundleTwo;
    private String bundleThree;

    public BoxOfProduce() {
    }

    public BoxOfProduce(String bundleOne, String bundleTwo, String bundleThree) {
        setBundleOne(bundleOne);
        setBundleTwo(bundleTwo);
        setBundleThree(bundleThree);
    }

    public void setBundleOne(String bundleOne) {
        this.bundleOne = bundleOne;
    }

    public void setBundleTwo(String bundleTwo) {
        this.bundleTwo = bundleTwo;
    }

    public void setBundleThree(String bundleThree) {
        this.bundleThree = bundleThree;
    }

    public String getBundleOne() {
        return bundleOne;
    }

    public String getBundleTwo() {
        return bundleTwo;
    }

    public String getBundleThree() {
        return bundleThree;
    }

    public String getRandomItems(String[] produceArray) {
        int randomNum = (int)(Math.random() * (3)) + 1;
        return produceArray[randomNum];
    }

    @Override
    public String toString() {
        return "Box contents, bundle one " + getBundleOne() + ", bundle two " + getBundleTwo() + ", bundle three " +
                getBundleThree();
    }


}