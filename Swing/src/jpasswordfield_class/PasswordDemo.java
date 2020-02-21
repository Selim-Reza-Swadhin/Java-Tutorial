package jpasswordfield_class;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class PasswordDemo extends JFrame {

    private Container c;
    private JPasswordField pf;
    private Font f;

    PasswordDemo() {
        initComponents();
    }

    public void initComponents() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.pink);
        f = new Font("Arial",Font.BOLD + Font.ITALIC,18);

        pf = new JPasswordField();
        //pf.setEchoChar('*');
        pf.setEchoChar('s');
        pf.setForeground(Color.red);
        pf.setBackground(Color.green);
        pf.setFont(f);
        pf.setBounds(50, 50, 200, 50);
        c.add(pf);

    }

    public static void main(String[] args) {
        PasswordDemo frame = new PasswordDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 50, 500, 400);
        frame.setTitle("This is a jpasswordfeild title");
    }
}
