package jlayout_class;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class CardLayout_Demo extends JFrame implements ActionListener {

    private Container c;
    private Font f;
    private CardLayout cl;
    private JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;

    CardLayout_Demo() {
        initContents();
    }

    public void initContents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 50, 300, 300);
        this.setTitle("This is a card layout title");

        f = new Font("Arial", Font.BOLD + Font.ITALIC, 20);

        c = this.getContentPane();
        cl = new CardLayout(10, 10);
        c.setLayout(cl);
        c.setBackground(Color.green);

        btn1 = new JButton("1");
        //btn1.setFont(f);
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btn4 = new JButton("4");
        btn5 = new JButton("5");
        btn6 = new JButton("6");
        btn7 = new JButton("7");
        btn8 = new JButton("8");
        btn9 = new JButton("9");

        c.add("One", btn1);
        c.add("Two", btn2);
        c.add("Three", btn3);
        c.add("Four", btn4);
        c.add("Five", btn5);
        c.add("Six", btn6);
        c.add("Seven", btn7);
        c.add("Eight", btn8);
        c.add("Nine", btn9);
        cl.show(c, "Nine");

        btn1.addActionListener(this);
        btn1.setBackground(Color.red);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //cl.next(c);
        cl.previous(c);
        //cl.show(c, "Eight");
        //cl.first(c);
        //cl.last(c);
    }

    public static void main(String[] args) {

        CardLayout_Demo frame = new CardLayout_Demo();
        frame.setVisible(true);
    }

}
