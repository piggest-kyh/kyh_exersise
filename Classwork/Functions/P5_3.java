class Scratch {
    public static void main(String[] args) {


        int testInt = 1729;

        String temp = Integer.toString(testInt);
        int[] intArray = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++)
        {
            intArray[i] = temp.charAt(i) - '0';
        }

        int res1 = firstDigit(intArray);
        int res2 = lastDigit(intArray);
        int res3 = totalNumberOfDigits(intArray);

        System.out.println("First Digit is " + res1 + " last digit is " + res2 +  " number of digits is " + res3);
    }

    private static int totalNumberOfDigits(int[] intArray) {
        return intArray.length;
    }

    private static int lastDigit(int[] intArray) {
        int result;

        result = intArray[intArray.length-1];
        return result;
    }

    private static int firstDigit(int[] intArray) {
        return intArray[0];
    }

}