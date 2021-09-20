import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

class Scratch {
    public static void main(String[] args) {

        ArrayList<Integer> randomList = random20Int();

        System.out.println(randomList);
        Collections.sort(randomList);
        System.out.println(randomList.toString());
    }

    private static ArrayList<Integer> random20Int() {
        Random rn = new Random();

        int high = 100;
        ArrayList<Integer> arr =  new ArrayList<>();

        for (int i = 0; i <= 20; i++) {
            arr.add( rn.nextInt(high));
        }
        return arr;
    }
}