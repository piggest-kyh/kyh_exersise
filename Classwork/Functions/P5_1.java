class Scratch {
    public static void main(String[] args) {

        double a = 1.45;
        double b = 5.3532;
        double c = 7.23124;

        double[] array = new double[]{a,b,c
        };

        System.out.println("Smallest double is "+ smallest(array));

        System.out.println("The average double is " + (averageOfArg(array)));
    }

    private static double averageOfArg(double[] array) {
        double sum = 0.0;

        for (double x: array
             ) {
            sum += x;
        }

        return(sum/array.length);

    }

    private static double smallest(double[] array) {

        double smallest = array[0];

        for (int i = 0; i < array.length ; i++) {
            for (int j = i+1 ; j < array.length; j++) {
                if(array[i]>array[j]){
                    smallest = array[j];
                }
            }
        }

        return smallest;

    }
}