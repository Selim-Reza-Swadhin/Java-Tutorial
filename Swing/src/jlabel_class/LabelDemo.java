package jlabel_class;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LabelDemo extends JFrame {

    private Container c;
    private JLabel userLabel;

    LabelDemo() {
        initComponents();
    }

    public void initComponents() {
        c = this.getContentPane();
        c.setLayout(null);//relation add()
        c.setBackground(Color.pink);

        userLabel = new JLabel();//for image and text visible
        userLabel.setText("Enter your user name : ");
        userLabel.setBounds(50, 20, 150, 50);
        c.add(userLabel);//default border

    }

    public static void main(String[] args) {
        LabelDemo frame = new LabelDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200, 50, 500, 400);
        frame.setTitle("Label Demo title");
    }
}
