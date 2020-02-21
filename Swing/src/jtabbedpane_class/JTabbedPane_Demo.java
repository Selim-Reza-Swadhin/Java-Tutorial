package jtabbedpane_class;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class JTabbedPane_Demo extends JFrame {

    private Container c;
    private JPanel panel1, panel2, panel3;
    private Font f;
    private JButton btn1, btn2, btn3;
    private JLabel label1, label2, label3;
    private JTabbedPane tp;

    JTabbedPane_Demo() {
        initContents();
    }

    public void initContents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 450, 450);
        this.setTitle("This is a JTabbedPane title");

        f = new Font("Arial", Font.BOLD + Font.ITALIC, 20);

        c = this.getContentPane();
        c.setLayout(null);
        c.setFont(f);
        c.setBackground(Color.pink);

        tp = new JTabbedPane();
        tp.setBounds(50, 50, 300, 300);
        tp.setBackground(Color.red);
        c.add(tp);

        label1 = new JLabel("This ia label one");
        label2 = new JLabel("This ia label two");
        label3 = new JLabel("This ia label three");

        panel1 = new JPanel();
        panel1.add(label1);
        panel1.setBackground(Color.orange);
        panel2 = new JPanel();
        panel2.add(label2);
        panel2.setBackground(Color.red);
        panel3 = new JPanel();
        panel3.add(label3);
        panel3.setBackground(Color.MAGENTA);

        tp.addTab("Home", panel1);
        tp.addTab("Help", panel2);
        tp.addTab("Edit", panel3);

    }

    public static void main(String[] args) {

        JTabbedPane_Demo frame = new JTabbedPane_Demo();
        frame.setVisible(true);
    }

}
