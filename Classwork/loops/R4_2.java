import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        System.out.println("All even numbers between 2 to 100");
        int a = 2;
        int aSum = 0;

        do {
            if ( a % 2 == 0) {
                aSum += a;
            }
            a++;
        }
        while ( a <= 100);

        System.out.println("Sum = " + aSum);

        int b = 1;
        int bSum = 0;

        do {
            bSum += (int) Math.pow(b, 2);
            b++;
        }
        while ( b <= 100);

        System.out.println("Sum off all squares from 1 to 100 = " + bSum);



        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert first number:");
        int m = Integer.parseInt(scanner.next());
        System.out.println("Insert second  number:");
        int n = Integer.parseInt(scanner.next());

        oddNumBetween(m,n);

        sumOfOddDigitsOfn();

    }

    public static void oddNumBetween(int a, int b){

        int x = a;
        int y = b;
        int sum = 0;
        if (a > b) { x = b; y = a;}

        for ( int i = x; i <= y; i++) {
            if (i%2 == 1) {
                sum +=i;
                System.out.println(sum);
            }
        }

        System.out.println("Sum of odd numbers between two numbers = " + sum);
    }

    private static void sumOfOddDigitsOfn() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert big number");

        String number = scanner.next();


        int sum = 0;

        for (int i = 0; i < number.length(); i++) {

            char n =  number.charAt(i);

            int x = Integer.parseInt(String.valueOf(n));

            if (x%2 == 1) {
                sum += x;
            }

        }

        System.out.println("Sum of odd numbers in number = " + sum);
    }

}

