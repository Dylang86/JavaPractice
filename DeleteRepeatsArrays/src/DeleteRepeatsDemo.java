public class DeleteRepeatsDemo {
    public static void main(String[] agr) {
        char[] charArray = new char[7];
        charArray[0] = 'a';
        charArray[1] = 'a';
        charArray[2] = 'b';
        charArray[3] = 'c';
        charArray[4] = 'b';
        charArray[5] = 'b';
        System.out.println(deleteRepeats(charArray, 6));
        System.out.println();

        char[] charArrayTwo = new char[62];
        charArrayTwo[0] = 'c';
        charArrayTwo[1] = 'b';
        charArrayTwo[2] = 'd';
        charArrayTwo[3] = 'd';
        charArrayTwo[4] = 'b';
        charArrayTwo[5] = 'c';
        System.out.println(deleteRepeats(charArrayTwo, 6));
        System.out.println();

        char[] charArrayThree = new char[0];
        System.out.println(deleteRepeats(charArrayThree, 0));
        System.out.println();

        char[] charArrayFour = new char[3];
        charArrayFour[0] = 'a';
        charArrayFour[1] = 'a';
        System.out.println(deleteRepeats(charArrayFour, 2));
        System.out.println();


    }

    public static int deleteRepeats(char[] charArray, int positionsFilled) {
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == '\u0000') {
                break;
            }
            char mainChar = charArray[i];
            for (int x = i + 1; x < charArray.length - 1; x++) {
                if (charArray[x] == mainChar) {
                    for (int z = x; z < charArray.length - 1; z++) {
                        if (z == charArray.length - 2) {
                            x--;
                        }
                        char temp = charArray[z + 1];
                        charArray[z] = temp;
                    }
                }
            }
        }
        positionsFilled = 0;
        for (char index : charArray) {
            if (index == '\u0000') {
                break;
            }
            positionsFilled++;
        }
        return positionsFilled;
    }
}