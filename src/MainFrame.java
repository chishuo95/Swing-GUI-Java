import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame{
    private JTextArea textArea;
    private JButton btn;
    public MainFrame(){
        super("Hello World!");
        setLayout(new BorderLayout( ));
        textArea = new JTextArea();
        btn = new JButton("Click Me!");
        add(textArea,BorderLayout.CENTER);
        add(btn,BorderLayout.SOUTH);
        setSize(600,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//click exit Jframe stop running
        setVisible(true);//Jframe is unvisible default, set it to visible
    }
}
