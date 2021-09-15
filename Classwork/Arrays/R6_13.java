import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        int[] numArray = new int[10];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < numArray.length; i++) {
            System.out.println("Please enter integer for place # " + i);

            numArray[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(numArray));

        int[] oppositeArray = new int[10];
        int j = numArray.length;
        for (int i = 0; i < numArray.length; i++) {
            oppositeArray[j - 1] = numArray[i];
            j = j - 1;
        }

        System.out.println(Arrays.toString(oppositeArray));

    }
}

//    private static int[] fillArray(int[] numArray) {
//
//        for (int i = 0; i < numArray.length; i++) {
//            int randomInt = getRandomInt();
//            for (int j = 0; j <=i; j++) {
//                if (randomInt == numArray[i]) {
//                    numArray[i] = getRandomInt();
//                } else {
//                    numArray[i] = randomInt;
//                }
//            }
//        }
//        return numArray;
//    }
//
//    private static int getRandomInt() {
//        Random rn = new Random();
//        int ubound = 30;
//        int randNegOrPos = rn.nextInt(ubound) * (rn .nextBoolean() ? -1 : 1);
//        return randNegOrPos;
//    }
//}