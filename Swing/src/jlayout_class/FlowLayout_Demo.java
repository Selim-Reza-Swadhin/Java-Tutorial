package jlayout_class;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayout_Demo extends JFrame {

    private Container c;
    private FlowLayout fLayout;
    //private JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13;
    private JButton buttons[];//array

    FlowLayout_Demo() {
        initContents();
    }

    public void initContents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 450, 300);
        this.setTitle("This is Flow layout title");

        c = this.getContentPane();
        c.setBackground(Color.green);
        //fLayout = new FlowLayout();
        //fLayout = new FlowLayout(FlowLayout.LEADING);
        //fLayout = new FlowLayout(FlowLayout.TRAILING);
        //fLayout = new FlowLayout(FlowLayout.RIGHT);
        //fLayout = new FlowLayout(FlowLayout.LEFT,10,20);
        fLayout = new FlowLayout(FlowLayout.LEFT);
        fLayout.setHgap(10);
        fLayout.setVgap(20);
        c.setLayout(fLayout);

        /*
        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btn4 = new JButton("4");
        btn5 = new JButton("5");
        btn6 = new JButton("6");
        btn7 = new JButton("7");
        btn8 = new JButton("8");
        btn9 = new JButton("9");
        btn10 = new JButton("10");
        btn11 = new JButton("11");
        btn12 = new JButton("12");
        btn13 = new JButton("13");

        c.add(btn1);
        c.add(btn2);
        c.add(btn3);
        c.add(btn4);
        c.add(btn5);
        c.add(btn6);
        c.add(btn7);
        c.add(btn8);
        c.add(btn9);
        c.add(btn10);
        c.add(btn11);
        c.add(btn12);
        c.add(btn13);
         */
        buttons = new JButton[12]; //array

        for (int i = 0; i < 12; i++) {
            //buttons[i] = new JButton("Button number is " + (i + 1));
            buttons[i] = new JButton(" " + (i + 1));
            c.add(buttons[i]);
        }

    }

    public static void main(String[] args) {

        FlowLayout_Demo frame = new FlowLayout_Demo();
        frame.setVisible(true);
    }

}
