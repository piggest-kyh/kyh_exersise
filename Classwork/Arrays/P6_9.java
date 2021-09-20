class Scratch {
    public static void main(String[] args) {
        int[] a = {1,4,9,16,9,7,4,9,11};
        int[] b = {1,4,9,16,9,7,4,9,11};

        System.out.println("Is arrays equal: " + isArraysEquals(a,b));
    }

    private static boolean isArraysEquals(int[] a , int[] b) {

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]){
                return false;
            }
        }
        return true;
    }
}