package jtextfield_class;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class TextFieldDemo extends JFrame {

    private Container c;
    private JTextField tf1, tf2;

    TextFieldDemo() {
        initComponents();
    }

    public void initComponents() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.pink);

        tf1 = new JTextField("Enter first field");
        tf1.setBounds(50, 50, 200, 50);
        c.add(tf1);
        
        tf2 = new JTextField("Enter second field");
        //tf2.setText("Enter first field");
        tf2.setBounds(50, 110, 200, 50);
        c.add(tf2);

    }

    public static void main(String[] args) {
        TextFieldDemo frame = new TextFieldDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 50, 500, 400);
        frame.setTitle("This is a jtextfeild title");
    }
}
