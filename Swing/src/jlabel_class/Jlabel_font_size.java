package jlabel_class;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Jlabel_font_size extends JFrame {

    private Container c;
    private JLabel userLabel, passLabel;
    private Font f;

    Jlabel_font_size() {
        initComponents();
    }

    public void initComponents() {
        c = this.getContentPane();
        c.setLayout(null);//relation add()
        c.setBackground(Color.pink);

        //Font(font_name,font_style,font_size)
        f = new Font("Arial", Font.BOLD, 18);

        userLabel = new JLabel();
        userLabel.setText("Enter your user name : ");
        userLabel.setBounds(50, 20, 250, 50);
        userLabel.setFont(f);//relation font
        c.add(userLabel);

        passLabel = new JLabel("Enter your password");
        passLabel.setBounds(50, 70, 250, 50);
        passLabel.setFont(f);
        c.add(passLabel);

    }

    public static void main(String[] args) {
        Jlabel_font_size frame = new Jlabel_font_size();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200, 50, 500, 400);
        frame.setTitle("Label Demo title");
    }
}
