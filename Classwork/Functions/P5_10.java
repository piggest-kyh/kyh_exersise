import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        String promptString = "Please enter your salary in double value";

        System.out.println("Your salary in double is " +  realDouble(promptString));
    }

    private static double realDouble(String promtString) {

        double output = 0.0;
        Scanner scanner = new Scanner(System.in);

        System.out.println(promtString);


        try {
            output = scanner.nextDouble();
        } catch (Exception e) {
            System.out.println("Something go wrong");
        }
        return output;
    }
}