import java.util.Arrays;
import java.util.Random;

class Scratch {
    public static void main(String[] args) {

        int[] randomNumArray = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println(Arrays.toString(fillArray(randomNumArray)));
            randomNumArray = new int[]{0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0};
        }
    }

    private static int[] fillArray(int[] numArray) {

        for (int i = 0; i < numArray.length; i++) {
            int randomInt = getRandomInt();
            for (int j = 0; j <=i; j++) {
                if (randomInt == numArray[i]) {
                    numArray[i] = getRandomInt();
                } else {
                    numArray[i] = randomInt;
                }
            }
        }
        return numArray;
    }


    private static int getRandomInt() {
        Random rn = new Random();
        int ubound = 101;
        return rn.nextInt(ubound);
    }
}