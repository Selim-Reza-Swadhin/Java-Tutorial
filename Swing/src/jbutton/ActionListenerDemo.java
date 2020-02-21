package jbutton;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ActionListenerDemo extends JFrame {
    
    private Container c;
    private JTextField tf;
    private JButton btn;
    
    ActionListenerDemo() {
        initComponents();
    }
    
    public void initComponents() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);
        
        tf = new JTextField();
        tf.setBounds(50, 50, 150, 50);
        c.add(tf);
        
        btn = new JButton("Clear");
        btn.setBounds(50, 110, 80, 50);
        c.add(btn);
        
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf.setText("");
            }
        });
    }
    
    public static void main(String[] args) {
        ActionListenerDemo frame = new ActionListenerDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 50, 500, 400);
        frame.setTitle("This is a JButton ActionListener");
    }
}
