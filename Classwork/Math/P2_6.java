class Scratch {
    public static void main(String[] args) {
        int m = 18;
        int n = 17;


        double a =  n / 10 + n % 10;
        double b = n % 2 + m % 2;
        double c = (m+n)/2;
        double d =  ((m+n)/ 2.0);
        int e = (int) 0.5 * (m+n);
        int f = (int) Math.round(0.5 * (m+n));

        System.out.println("a = " + a + "\n" + "b = " + b + "\n" +"c = " + c + "\n" +"d = " + d + "\n" +"e = " + e + "\n" + "f = " + f + "\n");
    }
}