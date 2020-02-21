package jtextfield_class;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Jtextfield_fg_bg extends JFrame {

    private Container c;
    private JTextField tf1, tf2;
    private Font f;

    Jtextfield_fg_bg() {
        initComponents();
    }

    public void initComponents() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.pink);

        f = new Font("Arial", Font.ITALIC + Font.BOLD, 22);

        tf1 = new JTextField("Selim");
        tf1.setBounds(50, 50, 200, 50);
        tf1.setFont(f);
        tf1.setForeground(Color.red);
        tf1.setBackground(Color.green);
        c.add(tf1);

        tf2 = new JTextField("Reza");
        //tf2.setText("anisul");
        tf2.setFont(f);
        tf2.setBounds(50, 110, 200, 50);        
        tf2.setForeground(Color.green);
        tf2.setBackground(Color.red);
        c.add(tf2);

    }

    public static void main(String[] args) {
        Jtextfield_fg_bg frame = new Jtextfield_fg_bg();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 50, 500, 400);
        frame.setTitle("This is a jtextfeild title");
    }
}
