package jlayout_class;

import java.awt.Color;
import java.awt.Container;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BoxLayout_Demo extends JFrame {

    private Container c;
    private JButton btn1, btn2, btn3, btn4, btn5;
    private BoxLayout box;

    BoxLayout_Demo() {
        initContents();
    }

    public void initContents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 10, 350, 300);
        this.setTitle("This is a Box Layout title");

        c = this.getContentPane();
        //box = new BoxLayout(c, BoxLayout.LINE_AXIS);
        //box = new BoxLayout(c, BoxLayout.X_AXIS);
        //box = new BoxLayout(c, BoxLayout.Y_AXIS);
        box = new BoxLayout(c, BoxLayout.PAGE_AXIS);
        c.setLayout(box);
        c.setBackground(Color.green);

        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btn4 = new JButton("4");
        btn5 = new JButton("5");

        c.add(btn1);
        c.add(Box.createVerticalStrut(14));
        c.add(btn2);
        c.add(btn3);
        c.add(btn4);
        c.add(Box.createVerticalStrut(14));
        c.add(btn5);
    }

    public static void main(String[] args) {

        BoxLayout_Demo frame = new BoxLayout_Demo();
        frame.setVisible(true);
    }

}
