class Scratch {
    public static void main(String[] args) {

        String testString = "middle";

       System.out.println(middle(testString));
    }

    private static String middle(String testString) {

        StringBuilder sb = new StringBuilder();

        int sl = testString.length();
        if(sl%2 == 0){
            char char1 = testString.charAt(sl/2);
            char char2 = testString.charAt(sl/2-1);
            sb.append(char1);
            sb.append(char2);
            return sb.toString();
        } else {
            return String.valueOf(testString.charAt(sl/2));
        }
    }
}