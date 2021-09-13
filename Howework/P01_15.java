import javax.swing.*;

class DialogViewer {

    public static void main(String[] args) {
        showGreetingsDialog();
    }
    private static void showGreetingsDialog() {

        String name = JOptionPane.showInputDialog("What is your name");
        String string = String.format("Hello, %s!", name);
        JOptionPane.showMessageDialog(null, string);
    }
}