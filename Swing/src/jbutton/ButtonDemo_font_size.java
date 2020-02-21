package jbutton;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonDemo_font_size extends JFrame {

    private Container c;
    private JButton btn1, btn2;
    private Font f;

    ButtonDemo_font_size() {
        initComponents();
    }

    public void initComponents() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.pink);

        f = new Font("Arial", Font.BOLD, 20);

        btn1 = new JButton("Submit");
        btn1.setBounds(100, 50, 120, 50);
        btn1.setBackground(Color.black);
        btn1.setForeground(Color.white);
        btn1.setFont(f);
        c.add(btn1);

        btn2 = new JButton("Clear");
        btn2.setBounds(250, 50, 100, 50);
        btn2.setFont(f);
        btn2.setBackground(Color.blue);
        btn2.setForeground(Color.white);
        c.add(btn2);
    }

    public static void main(String[] args) {
        ButtonDemo_font_size frame = new ButtonDemo_font_size();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 50, 500, 400);
        frame.setTitle("This is a jpasswordfeild title");
    }

}
