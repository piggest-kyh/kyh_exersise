class Scratch {
    public static void main(String[] args) {

        String str = "HEllO world";
        System.out.println(numberOfVowelsIn(str));
    }

    private static int numberOfVowelsIn(String str) {

        int counter = 0;

        String lcSrt = str.toLowerCase();

        for (int i = 0; i < lcSrt.length(); i++) {

            if (charIsVowel(lcSrt.charAt(i))){
                counter++;
            }
        }
            return counter;

    }

    private static boolean charIsVowel(char ch) {
        boolean isCharIsVowel;

        switch (ch){
            case 'o':
            case 'a':
            case 'i':
            case 'u':
            case 'e':
            case 'y':
                isCharIsVowel = true;
                break;
            default:
                isCharIsVowel = false;
                break;
        }
        return isCharIsVowel;
    }
}
