package jtextarea_class;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class JtextAreaDemo extends JFrame {
    
    private Container c;
    private JTextArea ta;
    private Font f;
    
    JtextAreaDemo() {
        initComponents();
    }
    
    public void initComponents() {
        c = this.getContentPane();
        c.setLayout(null);//relation add()
        c.setBackground(Color.pink);
        
        f = new Font("Arial", Font.BOLD, 18);
        
        ta = new JTextArea("This is a text area");
        ta.setBounds(50, 50, 300, 200);
        ta.setFont(f);
        ta.setBackground(Color.red);
        ta.setForeground(Color.white);
        c.add(ta);
    }
    
    public static void main(String[] args) {
        JtextAreaDemo frame = new JtextAreaDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200, 50, 500, 400);
        frame.setTitle("TextArea Demo title");
    }
}
