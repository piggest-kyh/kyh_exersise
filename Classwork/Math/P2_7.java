class Scratch {
    public static void main(String[] args) {
        String s = "Hello";
        String t = "World";

        int a = s.length() + t.length();
        String b = s.substring(1,2);
        String c =  s.substring(s.length()/2, t.length());
        String d = s + t;
        String e = t + s;

        System.out.println("a = " + a + "\n" + "b = " + b + "\n" +"c = " + c + "\n" +"d = " + d + "\n" +"e = " + e + "\n");
    }
}