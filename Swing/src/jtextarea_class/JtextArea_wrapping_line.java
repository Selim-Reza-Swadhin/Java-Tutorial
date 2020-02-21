package jtextarea_class;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class JtextArea_wrapping_line extends JFrame {
    
    private Container c;
    private JTextArea ta;
    private Font f;
    
    JtextArea_wrapping_line() {
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
        //ta.setLineWrap(true);
        ta.setWrapStyleWord(true);
        c.add(ta);
    }
    
    public static void main(String[] args) {
        JtextArea_wrapping_line frame = new JtextArea_wrapping_line();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200, 50, 500, 400);
        frame.setTitle("TextArea Demo title");
    }
}
