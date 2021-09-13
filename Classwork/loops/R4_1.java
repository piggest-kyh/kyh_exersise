import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please insert integer: ");
        int x = Integer.parseInt(sc.next());

        squares(x);
        dividedBy10(x);

        powerOf2LessThen(x);

    }

    private static void squares(int maxNum) {
        int x = 0;
        int resultOfSquare = 0;

        while (maxNum>resultOfSquare) {
            resultOfSquare = x*x;
            x++;
            System.out.println(resultOfSquare);
        }
    }

    private static void dividedBy10(int maxNum) {
        int x = maxNum;

        System.out.println("Numbers less then " + maxNum + "and divisible by 10");

        while (x > 0) {
            x--;

            if (x % 10 == 0){
                System.out.println(x);
            }
        }
    }

    public static void powerOf2LessThen( int maxNum){

        System.out.println("Print all powers of two less than " + maxNum);
        double x  = 2;
        double power  = 0;
        int result  = 0;

        while (result < maxNum) {
            result = (int) Math.pow(x, power);
            power++;
            if (result < maxNum) {
                System.out.println(result);
            }
        }
    }
}