class Scratch {
    public static void main(String[] args) {

        String str = "ho";
        int times = 3;
        System.out.println(repeatStringGivenTimes(str, times));
    }

    private static String repeatStringGivenTimes(String str , int times) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < times; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
}