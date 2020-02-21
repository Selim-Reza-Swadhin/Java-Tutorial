package jradiobutton_class;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class RadioButtonDemo extends JFrame {

    private Container c;
    private JRadioButton male, female;
    private ButtonGroup grp;
    private Font f;

    RadioButtonDemo() {
        initComponents();
    }

    public void initComponents() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 50, 500, 400);
        this.setTitle("This is a jradiobutton title");

        f = new Font("Arial", Font.BOLD + Font.ITALIC, 20);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.orange);

        male = new JRadioButton("Male");
        male.setBounds(50, 50, 100, 50);
        male.setBackground(Color.orange);
        male.setFont(f);
        c.add(male);

        female = new JRadioButton("Female");
        female.setBounds(160, 50, 100, 50);
        female.setBackground(Color.orange);
        female.setFont(f);
        female.setSelected(true);//internal selected
        female.setEnabled(false);//disable
        c.add(female);

        grp = new ButtonGroup();//select radio button
        grp.add(male);
        grp.add(female);
    }

    public static void main(String[] args) {
        RadioButtonDemo frame = new RadioButtonDemo();
        frame.setVisible(true);
    }

}
