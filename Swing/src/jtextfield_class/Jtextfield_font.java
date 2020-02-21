package jtextfield_class;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Jtextfield_font extends JFrame {

    private Container c;
    private JTextField tf1, tf2;
    private Font f;

    Jtextfield_font() {
        initComponents();
    }

    public void initComponents() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.pink);

        f = new Font("Arial", Font.ITALIC + Font.BOLD, 22);

        tf1 = new JTextField();
        tf1.setBounds(50, 50, 200, 50);
        tf1.setFont(f);
        c.add(tf1);

        tf2 = new JTextField();
        tf2.setText("anisul");
        tf2.setFont(f);
        tf2.setBounds(50, 110, 200, 50);
        c.add(tf2);

    }

    public static void main(String[] args) {
        Jtextfield_font frame = new Jtextfield_font();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 50, 500, 400);
        frame.setTitle("This is a jtextfeild title");
    }
}
