public class CounterTest {
    public static void main(String[] args) {
        Counter startCount = new Counter();
        System.out.println(startCount.getCount());

        for (int x = 0; x < 14; x++) {
            startCount.increaseCountByOne();
        }
        startCount.displayCount();

        for (int i = 0; i < 8; i++) {
            startCount.decreaseCountByOne();
        }
        startCount.displayCount();
        System.out.println(startCount.toString());
    }
}