class Scratch {
    public static void main(String[] args) {

        String[] testArray = {"Harry", "Hairy", "Hare", "The"};

        for (String str:testArray
             ) {
            int result = findNumbersOfSyllables(str);
            String output = String.format("In word %s is %o number(s) of syllables", str, result);
            System.out.println(output);
        }
    }

    private static int findNumbersOfSyllables(String str) {
        String lcStr = str.toLowerCase();
        int sylCounter = 0;

        for (int i = 0; i < lcStr.length(); i++) {
            char ch = lcStr.charAt(i);
            char nextChar = ' ';

            boolean isLastChar = false;

            if(i == lcStr.length()-1){
                isLastChar = true;
            }
            else {
                nextChar = lcStr.charAt(i+1);
            }

            if (charIsVowel(ch) && !isLastChar && !charIsVowel(nextChar)) {
                sylCounter ++;
            } else if (isLastChar) {
                if (charIsVowel(ch) && ch != 'e') { sylCounter++;}
            }

        }
        if(sylCounter == 0) {sylCounter = 1;}
        return sylCounter;
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
