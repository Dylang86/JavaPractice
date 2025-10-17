public class ProductDRating {
    private int rating;
    private int totalRatings;

    public ProductDRating() {
        this.rating = 0;
        this.totalRatings = 0;
    }

    public ProductDRating(int rating, int totalRatings) {
        this.rating = rating;
        this.totalRatings = totalRatings;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setTotalRatings(int totalRatings) {
        this.totalRatings = totalRatings;
    }

    public int getRating() {
        return rating;
    }

    public int getTotalRatings() {
        return totalRatings;
    }

    public double getRatingAverage() {
        if (totalRatings == 0) {
            return 0;
        }
        return (double) rating / totalRatings;
    }
}
