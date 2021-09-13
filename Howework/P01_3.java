class Scratch {
    static int[] myArray = {1,2,3,4,5,6,7,8,9,10};

    public static void main(String[] args) {

        multiplyNumbersInArray(myArray);
        }

        private static void multiplyNumbersInArray (int [] numArray) {

            int product = numArray[0];

            for (int i = 1; i < numArray.length ; i++) {
                product = product * numArray[i];
            }
            System.out.println(product);
        }
    }
