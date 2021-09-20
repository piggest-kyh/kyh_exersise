import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        int [][] magicSquare = new int[4][4];

        checkUserInput();
    }

    private static ArrayList<Integer> checkUserInput() {

        ArrayList<Integer> listOf16 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 15; i++) {

            System.out.println("enter");
            sc.nextLine();
            if(sc.hasNextInt()){
                int num = sc.nextInt();
            } else {
                System.out.println("ERROR");
                i--;
            }
        }

        return listOf16;
    }
}