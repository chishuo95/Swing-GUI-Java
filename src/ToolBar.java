import javax.swing.*;
import javax.tools.Tool;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;

public class ToolBar extends JPanel implements ActionListener {
    private JButton helloButton;
    private JButton goodbyeButton;
    private TextPanel textPanel;

    public ToolBar(){

        helloButton = new JButton("Hello");
        goodbyeButton = new JButton("Goodbye");
        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(helloButton);
        add(goodbyeButton);

        helloButton.addActionListener(this);
        goodbyeButton.addActionListener(this);

    }

    public void setTextPanel(TextPanel tex){
        this.textPanel = tex;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clicked = (JButton) e.getSource();

        if(clicked == helloButton){
            textPanel.appendText("Hello\n");
        }else if(clicked == goodbyeButton){
            textPanel.appendText("Goodbye\n");
        }

    }
}
