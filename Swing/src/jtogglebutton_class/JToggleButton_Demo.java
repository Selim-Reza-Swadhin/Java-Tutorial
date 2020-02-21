package jtogglebutton_class;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JToggleButton;

public class JToggleButton_Demo extends JFrame implements ActionListener {
    
    private Container c;
    private Font f;
    private JToggleButton tb;
    private JLabel label;
    private ImageIcon offIcon,onIcon;
    
    JToggleButton_Demo() {
        initContents();
    }
    
    public void initContents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 400, 300);
        this.setTitle("This is a toggle button title");
        
        f = new Font("Arial", Font.BOLD + Font.ITALIC, 20);
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.green);
        
        onIcon = new ImageIcon("src/images/edit.png");
        offIcon = new ImageIcon("src/images/pencil.png");

        //tb = new JToggleButton();
        //tb = new JToggleButton("Click");
        tb = new JToggleButton(offIcon);
        tb.setBounds(145, 70, 90, 90);
        c.add(tb);
        
        label = new JLabel("Hi, There");
        label.setBounds(160, 150, 150, 50);
        label.setVisible(false);
        c.add(label);
        
        tb.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (tb.isSelected()) {
            //tb.setText("ON");
            tb.setIcon(offIcon);
            label.setVisible(true);
        } else {
            //tb.setText("OFF");
            tb.setIcon(onIcon);
            label.setVisible(false);
        }
    }
    
    public static void main(String[] args) {
        
        JToggleButton_Demo frame = new JToggleButton_Demo();
        frame.setVisible(true);
    }
    
}
