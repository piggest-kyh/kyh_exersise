import java.util.Random;

class Scratch {
    public static void main(String[] args) {
        int[] randomNumArray = new int[10];

        int[] numArray = fillArray(randomNumArray);

//        a

        String result = printAllElementInStringLine(numArray);
        System.out.println(result);

//        b

        int total = productOfAllElementIn(numArray);
        System.out.println(total);

        int numberOfNeg = numberOfNegElementIn(numArray);
        System.out.println(numberOfNeg);
    }

    private static int numberOfNegElementIn(int[] numArray) {

        int counter = 0;

        for (int val : numArray
                ) {
            if(val<0){
                counter++;
            }
        }
        return counter;
    }

    private static int productOfAllElementIn(int[] numArray) {

        int product = 1;

        for (int val: numArray
             ) {
            product *=val;
        }
        return product;
    }

    private static String printAllElementInStringLine(int[] numArray) {

        StringBuilder sb = new StringBuilder();

        for (int val: numArray
             ) {
            sb.append(val + " ");
        }
        return sb.toString();
    }


    private static int[] fillArray(int[] numArray) {

        for (int i = 0; i < numArray.length; i++) {
            int randomInt = getRandomInt();
            for (int j = 0; j <=i; j++) {
                if (randomInt == numArray[i]) {
                    numArray[i] = getRandomInt();
                } else {
                    numArray[i] = randomInt;
                }
            }
        }
        return numArray;
    }

    private static int getRandomInt() {
        Random rn = new Random();
        int ubound = 30;
        int randNegOrPos = rn.nextInt(ubound) * (rn .nextBoolean() ? -1 : 1);
        return randNegOrPos;
    }
}