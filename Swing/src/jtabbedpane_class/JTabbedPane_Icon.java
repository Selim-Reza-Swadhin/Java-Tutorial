package jtabbedpane_class;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class JTabbedPane_Icon extends JFrame {

    private Container c;
    private JPanel panel1, panel2, panel3;
    private Font f;
    private JLabel label1, label2, label3;
    private JTabbedPane tp;
    private ImageIcon homeIcon,helpIcon;

    JTabbedPane_Icon() {
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
        //tp = new JTabbedPane(JTabbedPane.LEFT);
        //tp = new JTabbedPane(JTabbedPane.RIGHT);
        //tp = new JTabbedPane(JTabbedPane.BOTTOM);
        //tp.setTabPlacement(JTabbedPane.RIGHT);
        tp.setBounds(50, 50, 300, 300);
        tp.setBackground(Color.red);
        c.add(tp);

        homeIcon = new ImageIcon("src/images/edit.png");
        helpIcon = new ImageIcon("src/images/pencil.png");

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

        tp.addTab("Home", homeIcon, panel1);
        tp.addTab("Help", helpIcon, panel2, "Hi, I am panel tab");
        tp.addTab("Edit", panel3);

    }

    public static void main(String[] args) {

        JTabbedPane_Icon frame = new JTabbedPane_Icon();
        frame.setVisible(true);
    }

}
