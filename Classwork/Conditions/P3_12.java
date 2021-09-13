import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numericGrade = 0.0;

        System.out.println("Please input integer");
        String grade  = sc.next();

        switch (grade) {
            case "A+":
                numericGrade = 4;
                break;
            case "A":
                numericGrade = 4;
                break;
            case "A-":
                numericGrade = 3.7;
                break;
            case "B+":
                numericGrade = 3.3;
                break;
            case "B":
                numericGrade = 3;
                break;
            case "B-":
                numericGrade = 2.7;
                break;
            case "C+":
                numericGrade = 2.3;
                break;
            case "C":
                numericGrade = 2;
                break;
            case "C-":
                numericGrade = 1.7;
            case "D+":
                numericGrade = 1.3;
                break;
            case "D":
                numericGrade = 1;
                break;
            case "D-":
                numericGrade = 0.7;

            case "F":
                numericGrade = 0;
                break;
            default:
                System.out.println("Error");
        }

        System.out.println("The numeric value is " + numericGrade);
    }
}