import java.util.Arrays;

class Scratch {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,4,3,2,1,0};

//        a
        for (int i = 1; i < 10; i++) { a[i] = a[i-1];} a = print(a);
//        b
        for (int i = 9; i >0; i--) { a[i] = a[i-1];} a = print(a);
//        c
        for (int i = 0; i < 9; i++) { a[i] = a[i+1];} a = print(a);
//        d
        for (int i = 8; i >= 0; i--) { a[i] = a[i+1]; } a = print(a);
//        e
        for (int i = 1; i < 10; i++) { a[i] = a[i]+a[i-1]; } a = print(a);
//        f
        for (int i = 1; i < 10; i+=2) { a[i] = 0; } a = print(a);
//        g
        for (int i = 0; i < 5; i++) { a[i+5] = a[i]; } a = print(a);
//        h
        for (int i = 1; i < 5; i++) { a[i] = a[9-i]; } a = print(a);
    }

    private static int[] print(int[] arr) {
        System.out.println(Arrays.toString(arr));
        return new int[]{1,2,3,4,5,4,3,2,1,0};
    }
}