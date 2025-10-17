public class IntArray {
    private int[] intArray;

    public IntArray(int[] intArray) {
        this.intArray = intArray;
    }

    public void setIntArray(int[] intArray) {
        this.intArray = intArray;
    }

    public int[] getIntArray() {
        return intArray;
    }

    public static void printIntArray(IntArray object) {
        int[] array = object.getIntArray();
        for (int index : array) {
            System.out.print(index);
        }
    }

    public static void setIntArrayIndex(IntArray object, int index) {
    }
}