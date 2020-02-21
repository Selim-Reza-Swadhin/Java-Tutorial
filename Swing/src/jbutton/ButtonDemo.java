package jbutton;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonDemo extends JFrame {

    private Container c;
    private JButton btn1,btn2;

    ButtonDemo() {
        initComponents();
    }

    public void initComponents() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.pink);
        
        btn1 = new JButton("Submit");
        btn1.setBounds(100,50,100,50);
        c.add(btn1);
        
        btn2 = new JButton("Clear");
        btn2.setBounds(250,50,100,50);
        c.add(btn2);
    }

    public static void main(String[] args) {
        ButtonDemo frame = new ButtonDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 50, 500, 400);
        frame.setTitle("This is a jpasswordfeild title");
    }

}
