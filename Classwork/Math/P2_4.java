import javax.swing.*;
import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please write first integer");
        int intA = Integer.parseInt(sc.next());
        System.out.println("Please write second integer");
        int intB = Integer.parseInt(sc.next());


        int sum = intA + intB;
        int diff = intA - intB;
        int product = intA * intB;
        double avr = (intA+intB)/2;
        int maxInt = Math.max(intA, intB);
        int minInt = Math.min(intA, intB);
        int absDiff = Math.abs(diff);


        System.out.println("sum = " + sum + "\n"
                + "difference = " + diff + "\n"
                +"product = " + product + "\n"
                +"average  = " + avr + "\n"
                +"absolute difference  = " + absDiff + "\n"
                +"maximum integer  = " + maxInt + "\n"
                +"minimum integer  = " + minInt + "\n");
    }
}