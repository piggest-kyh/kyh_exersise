import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        System.out.println("Please enter a string");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();

        char [] charArray = new char[string.length()];

        for (int i = 0; i < string.length(); i++) {
            charArray[i] = string.charAt(i);
        }

        upperCaseFall(charArray);
        everySecondLetter(charArray);
        replaceVowelsWithUnderscoreAndCountOfVowels(charArray);
        printEveryLetterSeparate(charArray);
    }

    private static void printEveryLetterSeparate(char[] charArray) {
        for (char ch: charArray
             ) {
            System.out.println(ch);
        }
    }

    public static void upperCaseFall (char[] charArray) {

        for (char ch: charArray
             ) {

            if (Character.isUpperCase(ch)){
                System.out.println(ch);
            }
        }
    }

    public static void everySecondLetter (char[] charArray) {

        for (int i = 0; i < charArray.length; i++) {
            if (i%2==0) {
                System.out.println(charArray[i]);
            }
        }
    }

    public static void replaceVowelsWithUnderscoreAndCountOfVowels(char[] charArray){

        char[] array = charArray;
        int vowelsNumber = 0;

        for (int i = 0; i < array.length ; i++) {
            char ch = Character.toLowerCase(array[i]);
            switch (ch) {
                case 'a':
                case 'i':
                case 'o':
                case 'y':
                case 'e':
                case 'u':
                    ch = '_';
                    vowelsNumber ++;
                    System.out.println("Position of vowel is " + (i+1));
                    break;

            }
            array[i] = ch;
        }

        System.out.println(array);
        System.out.println("number of vowels  = " + vowelsNumber);
    }

}