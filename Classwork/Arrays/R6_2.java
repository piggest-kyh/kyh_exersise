class Scratch {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,4,3,2,1,0};
        int total = 0;

//        a
        for (int i = 0; i < 10; i++) {
            total += a[i];
        }
        total = print(total);
//      b
        for (int i = 0; i < 10; i+=2) {
            total += a[i];
        }
        total = print(total);
//        c
        for (int i = 1; i < 10; i+=2) {
            total += a[i];
        }
        total = print(total);
//        d
//        for (int i = 2; i <= 10; i++) {
//            total += a[i];
//        }
//        total = print(total);
//        ERROR!
//        e
        for (int i = 1; i < 10; i*=2) {
            total += a[i];
        }
        total = print(total);

//        f
        for (int i = 9; i >= 0; i--) {
            total += a[i];
        }
        total = print(total);
//        g
        for (int i = 9; i >= 0; i-=2) {
            total += a[i];
        }
        total = print(total);
//        h
        for (int i = 0; i < 10; i++) {
            total -= a[i];
        }
        total = print(total);
    }

    private static int print(int total) {
        System.out.println(total);
         return total = 0;
    }


}