import javax.swing.*;

public class Lecture2 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("Hello World!");//set up title for window
                frame.setSize(600,500);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//click exit Jframe stop running
                frame.setVisible(true);//Jframe is unvisible default, set it to visible
            }
        });
    }

}
