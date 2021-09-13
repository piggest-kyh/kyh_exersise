import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String notation = "";
        StringBuilder sb = new StringBuilder();

        System.out.println("Please input card notation(two letters)");
        char firstSymbol  = sc.next().charAt(0);
        char secondSymbol  = sc.next().charAt(1);
        char thirdSymbol = '0';
        if (secondSymbol == '0') {
            sb.append("ten");
            thirdSymbol = sc.next().charAt(2);
        }

        switch (firstSymbol){
            case '1':
                sb.append("One");
                break;
            case '2':
                sb.append("Two");
                break;
            case '3':
                sb.append("Three");
                break;
            case '4':
                sb.append("Four");
                break;
            case '5':
                sb.append("Five");
                break;
            case '6':
                sb.append("Six");
                break;
            case '7':
                sb.append("Seven");
                break;
            case '8':
                sb.append("Eight");
                break;
            case '9':
                sb.append("Nine");
                break;
            case 'A':
                sb.append("Ace");
                break;
            case 'J':
                sb.append("Jack");
                break;
            case 'Q':
                sb.append("Queen");
                break;
            case 'K':
                sb.append("King");
                break;

            default:
                System.out.println("Error while input, check notation format (Example: QS)");
                break;
        }

        switch ()


    }
}