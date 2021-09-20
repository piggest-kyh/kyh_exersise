import java.util.Arrays;

class Scratch {
    public static void main(String[] args) {
        int[] arr = {1,4,9,16,9,7,4,9,11};


        reverseArray(arr);
    }

    private static void reverseArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
        int j = arr.length;
        int[] reverseArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reverseArray[j - 1] = arr[i];
            j = j - 1;
        }
        System.out.println(Arrays.toString(reverseArray));
    }
}