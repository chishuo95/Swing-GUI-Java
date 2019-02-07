import javax.swing.*;
import javax.tools.Tool;
import java.awt.*;
import java.io.FileWriter;

public class ToolBar extends JPanel{
    private JButton helloButton;
    private JButton goodbyeButton;

    public ToolBar(){

        helloButton = new JButton("Hello");
        goodbyeButton = new JButton("Goodbye");
        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(helloButton);
        add(goodbyeButton);

    }
}
