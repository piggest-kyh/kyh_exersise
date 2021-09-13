class Scratch {
    public static void main(String[] args) {
        //a and b see R4.2

        //c.
        powersOf2();

//        d and e. See R4.2
    }

    public static void powersOf2() {

        for (int i = 0; i <= 20; i++) {
            int result  = (int) Math.pow(2, i);
            System.out.println(result);
        }
    }
}