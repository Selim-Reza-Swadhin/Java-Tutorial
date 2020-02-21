package jlayout_class;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayout_Demo extends JFrame {

    private Container c;
    private JButton btn1, btn2, btn3, btn4, btn5,btn6,btn7,btn8,btn9;
    private GridLayout gl;

    GridLayout_Demo() {
        initContents();
    }

    public void initContents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 300, 250);
        this.setTitle("This is a Grid Layout title");

        c = this.getContentPane();
        //gl = new GridLayout(3,3);
        gl = new GridLayout(3,3,10,10);
        c.setLayout(gl);
        c.setBackground(Color.green);

        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btn4 = new JButton("4");
        btn5 = new JButton("5");
        btn6 = new JButton("6");
        btn7 = new JButton("7");
        btn8 = new JButton("8");
        btn9 = new JButton("9");

        c.add(btn1);
        c.add(btn2);
        c.add(btn3);
        c.add(btn4);
        c.add(btn5);
        c.add(btn6);
        c.add(btn7);
        c.add(btn8);
        c.add(btn9);
    }

    public static void main(String[] args) {

        GridLayout_Demo frame = new GridLayout_Demo();
        frame.setVisible(true);
    }

}

