import javax.swing.*;

class DialogViewer {
    static String name = "Denis";

    public static void main(String[] args) {
        showDialog(name);
    }

    private static void showDialog (String name) {
        String string = String.format("Hello, %s" , name);
        JOptionPane.showMessageDialog(null, "Hello, " + name + "!");
//        JOptionPane.showMessageDialog(null, string);

    }
}