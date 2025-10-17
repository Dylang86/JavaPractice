public class CharArray {
    private char[] charArray;

    public CharArray(char[] charArray) {
        this.charArray = charArray;
    }

    public void setCharArray(char[] charArray) {
        this.charArray = charArray;
    }

    public char[] getCharArray() {
        return charArray;
    }

    public static void printCharArray(CharArray object) {
        char[] array = object.getCharArray();
        for (char index : array) {
            System.out.print(index);
        }
    }

    public static void setCharArrayIndex(CharArray object, int index) {
    }

}