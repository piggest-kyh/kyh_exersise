import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please input integer");
        int x  = Integer.parseInt(sc.next());

        if (x < 0) {
            System.out.println("negative int");
        } else if (x > 0) {
            System.out.println("positive  int");
        } else if (x == 0) {
            System.out.println("0");
        }

    }
}