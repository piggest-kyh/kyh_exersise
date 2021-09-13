import java.lang.reflect.Array;

class Scratch {
    public static void main(String[] args) {
//        a
        largeOfTwo();
//        b
        smallestOfTreeFloat();
//        c
        int numberC = 3;

        boolean resultC = isNumberPrime(numberC);
        if(resultC){
            System.out.println("Number " + numberC + "is prime");
        } else {
            System.out.println("Number " + numberC + " is not prime");
        }

//        d
        
        String bigString = "";
        String insideString = "";
        ifStringHaveAnotherStringInside(bigString, insideString);
//        e
        

        float balanceE = 10000f;
        float interestRate = 3.3f;
        float years = 10f;

        calculateBankBalance(balanceE, interestRate, years);
        
//        f
//        ??
//        g
        
        String month = "September";
        int year = 2020;
        int day = 8;
        
        printCalendaerFor(month, year);
        
//        h
        weekDayForGivenDay(day, month, year);
        
//        i
        
        int n = 10000
        generateRandomInt(1, n);
    }

    private static void generateRandomInt(int i , int n) {
    }

    private static void weekDayForGivenDay(int day , String month , int year) {
    }

    private static void printCalendaerFor(String month , int year) {
    }

    private static void ifStringHaveAnotherStringInside(String bigString , String insideString) {
    }

    private static void calculateBankBalance(float balance , float interestRate , float years) {
        float result = (balance * (interestRate/100) * years)+balance;
        String string = String.format("Balance over %s, with %s interest rate with initial balance %s is %s", years, interestRate, balance, result);
                System.out.println(string);

    }


    private static boolean isNumberPrime(int numberC) {

        if (numberC <= 1)
            return false;


        for (int i = 2; i < numberC; i++)
            if (numberC % i == 0)
                return false;

        return true;
    }

    private static void smallestOfTreeFloat() {

        float a = 1.5f;
        float b = 2.3f;
        float c = 5.7f;

        float smallest = a;

        if( b < a ) {
            smallest = b;
        } else if  (c < a) {
            smallest = c;
        }

        if (c < b) {
            smallest = c;
        }

        System.out.println("Smallest float is " + smallest);
    }

    private static void largeOfTwo(){
        int a = 5;
        int b = 10;

        if( a > b) {
            System.out.println(a + "is largest");
        } else {
            System.out.println(b + "is largest");
        }
    }
}