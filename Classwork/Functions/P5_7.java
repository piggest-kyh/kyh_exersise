class Scratch {
    public static void main(String[] args) {

        String str = "Mary had a little lamb";

        System.out.println("Number of words in sentence  = " + countWords(str));
    }

    private static int countWords(String str) {

        int counter = 0;

        for (int i = 0; i < str.length() ; i++) {
            if(str.charAt(i) == ' ' && i != str.length()-1 && !str.isEmpty() && str.charAt(i+1) != ' '){
                counter++;
            }
        }

        counter +=1;
        return counter;
    }
}