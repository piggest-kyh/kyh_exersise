import java.util.Arrays;
import java.util.Random;

class Scratch {
    public static void main(String[] args) {

    int[] ranArray = new int[10];

    ranArray = fillArray(ranArray);

    System.out.println(Arrays.toString(ranArray));

    printNumWithEvenIndex(ranArray);

    printEvenNumInArray(ranArray);

    printElementsInReverseOrder(ranArray);

    printFirstAndLastElement(ranArray);

    }

    private static void printFirstAndLastElement(int[] arr) {
        StringBuilder sb = new StringBuilder();

        sb.append(arr[0]).append(" ").append(arr[arr.length - 1]).append(" ");

        System.out.println(sb.toString());
    }

    private static void printElementsInReverseOrder(int[] ranArray) {
        int j = ranArray.length;
        int[] reverseArray = new int[10];
        for (int i = 0; i < ranArray.length; i++) {
            reverseArray[j - 1] = ranArray[i];
            j = j - 1;
        }
        System.out.println(Arrays.toString(reverseArray));
    }

    private static void printEvenNumInArray(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2 == 0){sb.append(arr[i]+ " ");};
        }
        System.out.println(sb.toString());
    }

    private static void printNumWithEvenIndex(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i+=2) {
            sb.append(arr[i] + " ");
        }
        System.out.println(sb.toString());
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
        int ubound = 30;
//        int randNegOrPos = rn.nextInt(ubound) * (rn .nextBoolean() ? -1 : 1);
        return rn.nextInt(ubound);
    }
}