import java.util.Scanner;

class Scratch {

    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);

        System.out.println("Write something");
        String message = in.next();
        System.out.println("You write " + message);
    }
}