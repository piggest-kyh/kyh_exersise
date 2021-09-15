import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Scratch {
    public static void main(String[] args) {

        ArrayList<Integer> testArray = new ArrayList<>();
//        a

        printArray(fill0to10(testArray));
//        b
        printArray(fillEvenNumbers(testArray));
//        c
        printArray(fillSqurNum(testArray));
//        d
        printArray(fillWithZeros(testArray));
//        e
        printArray(fillWithRandom(testArray));
//        f.
        printArray(fillWith0And1(testArray));
//        g
        printArray(fillTwiceFrom0to4(testArray));


    }

    private static ArrayList<Integer> fillTwiceFrom0to4(ArrayList<Integer> testArray) {

        int counter = 2;

        do{
            for (int i = 0; i < 5; i++) {
                testArray.add(i);
            }
            counter--;
        } while (counter > 0);
        return testArray;
    }

    private static ArrayList<Integer> fillWith0And1(ArrayList<Integer> testArray) {

        boolean state = true;

        for (int i = 0; i < 10; i++) {
            if(state) {
                testArray.add(0);
                state = false;
            } else {
                testArray.add(1);
                state = true;
            }
        }

        return testArray;
    }

    private static ArrayList<Integer> fillWithRandom(ArrayList<Integer> testArray) {

        List<Integer> list = Arrays.asList(1,4,9,16,9,7,4,9,11);
        testArray.addAll(list);
        return testArray;
    }

    private static ArrayList<Integer> fillWithZeros(ArrayList<Integer> testArray) {
        for (int i = 0; i < 10; i++) {
            testArray.add(0);
        }

        return testArray;
    }

    private static ArrayList<Integer> fillSqurNum(ArrayList<Integer> testArray) {
        for (int i = 0; i < 10; i++) {
            testArray.add((int) Math.pow((i+1), 2));
        }

        return testArray;
    }

    private static ArrayList<Integer> fillEvenNumbers(ArrayList<Integer> testArray) {
        for (int i = 1; i < 20; i += 2) {
            testArray.add(i+1);
        }
        return testArray;
    }

    private static void printArray(ArrayList<Integer> testArray) {
        System.out.println(testArray.toString());
        testArray.clear();
    }

    private static ArrayList<Integer> fill0to10(ArrayList<Integer> testArray) {
        for (int i = 0; i < 10; i++) {
            testArray.add(i+1);
        }

        return testArray;
    }


}