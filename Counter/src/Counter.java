public class Counter {
    private int count;

    public Counter() {
        count = 0;
    }

    public int getCount() {
        return count;
    }

    public void resetCount(int count) {
        this.count = 0;
    }

    public int increaseCountByOne() {
        return count++;
    }

    public int decreaseCountByOne() {
        if (count - 1 == -1) {
            return count;
        } else {
            return count--;
        }
    }

    public void displayCount() {
        System.out.println(getCount());
    }

    @Override
    public String toString() {
        return Integer.toString(count);
    }

}