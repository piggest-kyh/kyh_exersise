class Scratch {
    public static void main(String[] args) {
//        a.
        int n =1;
        int k = 2;
        int r = n;

        if (k < n) {
            r = k;
        }

        System.out.println("a) \n"+"n = " + n + "\n" + "k = " + k + "\n" + " r = " + r);

//        b.
         if (n < k) {
             r = k;
         } else {
             r = k + n;
         }

        System.out.println("b) \n"+ "n = " + n + "\n" + "k = " + k + "\n" + " r = " + r);

//         c.

        r = k;
        if (r < k) {
            n = r;
        } else {
            k = n;
        }

        System.out.println("c) \n" + "n = " + n + "\n" + "k = " + k + "\n" + " r = " + r);

        //    d.

        n = 1;
        k = 2;
        r = 3;

        if (r < k + n) {
            r =  2 * n;
        } else {
            k = 2 * r;
        }

        System.out.println("d) \n" + "n = " + n + "\n" + "k = " + k + "\n" + " r = " + r);

    }




}