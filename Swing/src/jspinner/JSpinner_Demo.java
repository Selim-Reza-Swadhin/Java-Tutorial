package jspinner;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class JSpinner_Demo extends JFrame {

    private Container c;
    private JSpinner spinner;

    JSpinner_Demo() {

        initContents();
    }

    public void initContents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 450, 450);
        this.setTitle("This ia spinner title");

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.pink);

//        spinner = new JSpinner();
//        spinner.setBounds(100, 100, 70, 50);
//        c.add(spinner);
//SpinnerNumberModel(default, min, max, step)
        SpinnerNumberModel value = new SpinnerNumberModel(10, -30, 30, 3);

        spinner = new JSpinner(value);
        spinner.setBounds(100, 100, 70, 50);
        c.add(spinner);

    }

    public static void main(String[] args) {
        JSpinner_Demo frame = new JSpinner_Demo();
        frame.setVisible(true);
    }

}
