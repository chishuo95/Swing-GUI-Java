import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame{
    private JButton btn;
    private TextPanel textPanel;
    public MainFrame(){
        super("Hello World!");
        setLayout(new BorderLayout());
        textPanel = new TextPanel();
        btn = new JButton("Click Me!");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textPanel.appendText("Hello\n");
            }
        });
        add(textPanel,BorderLayout.CENTER);
        add(btn,BorderLayout.SOUTH);
        setSize(600,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//click exit Jframe stop running
        setVisible(true);//Jframe is unvisible default, set it to visible
    }
}
