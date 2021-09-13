class Scratch {
    public static void main(String[] args) {

        double a = 1.423;
        double b = 1.45;
        double c = 1.45;

        double[] array = new double[]{a,b,c
        };

       if(ifAllTheSame(array)){
           System.out.println("All numbers are same");
       } else {
           System.out.println("All numbers are not same");
       };

        if(ifAllNumbersDifferent(array)){
            System.out.println("All numbers are different");
        } else {
            System.out.println("Not all numbers are different");
        };


        if(ifAllNumbersSorted(array)){
            System.out.println("All numbers are sorted");
        } else {
            System.out.println("Numbers are not sorted");
        };

    }

    private static boolean ifAllNumbersSorted(double[] array) {

        boolean isEqual = false;

        for (int i = 0; i < array.length ; i++) {
            for (int j = i+1 ; j < array.length; j++) {
                if(array[i] > array[j]){
                    return false;
                } else {
                    isEqual = true;
                }
            }
        }

        return isEqual;
    }

    private static boolean ifAllNumbersDifferent (double[] array) {
        boolean isEqual = false;

        for (int i = 0; i < array.length ; i++) {
            for (int j = i+1 ; j < array.length; j++) {
                if(array[i] == array[j]){
                    return false;
                } else {
                    isEqual = true;
                }
            }
        }

        return isEqual;
    }

    private static boolean ifAllTheSame(double[] array) {

        boolean isEqual = false;

        for (int i = 0; i < array.length ; i++) {
            for (int j = i+1 ; j < array.length; j++) {
                if(array[i] == array[j]){
                    isEqual = true;
                } else {
                    isEqual = false;
                }
            }
        }

        return isEqual;
    }
}