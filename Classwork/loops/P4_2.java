import javax.sql.rowset.spi.SyncResolver;
import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {

        System.out.println("Please enter a large number");
        Scanner scanner = new Scanner(System.in);
        String num = scanner.next();


        int[] numArray = new int[num.length()];
        for (int i = 0; i < num.length(); i++)
        {
            numArray[i] = num.charAt(i) - '0';
        }

        smallestAndLargestOfInputs(numArray);
        numberOfEvenAndOddsNumber(numArray);
        commutativeTotals(numArray);
        findDuplicatesNumber(numArray);

//        a.

    }

    public static void smallestAndLargestOfInputs(int[] numArray){

        int minNum = numArray[0];
        int maxNum = numArray[0];
        for (int num : numArray) {
            minNum = Math.min(num, minNum);
            maxNum = Math.max(num,maxNum);
        }

        System.out.println("Minimum number is " + minNum + "\n"+ "Maximum number is " + maxNum);
    }

    public static void numberOfEvenAndOddsNumber(int[] numArray){
        int sumOddsNumber = 0;
        int sumEvenNumber = 0;

        for (int num: numArray
             ) {

            if (num%2 == 0){
                sumEvenNumber += num;
            } else if (num%2 == 1){
                sumOddsNumber += num;
            }
        }
        System.out.println("Sum of even numbers is " + sumEvenNumber + "\n"+"Sum of odds numbers is "+ sumOddsNumber + "\n");
    }

    public static void commutativeTotals(int[] numArray){
        int cumulative = 0;

        for (int num: numArray
             ) {
            cumulative += num;
            System.out.println("Cumulative totals now is " + cumulative);
        }
    }

    public static void findDuplicatesNumber(int[] numArray) {
        for (int i = 0; i < numArray.length; i++) {
            for (int x = i + 1 ; x < numArray.length; x++) {
                if (numArray[i] == (numArray[x])) {
                    System.out.println("Duplicate number is "+ numArray[i]);
                }
            }
        }
    }
}