package jcolorchoser;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;

class JColorChoser_Demo extends JFrame {

    private Container c;
    private JButton bt;

    JColorChoser_Demo() {
        initContents();
    }

    public void initContents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(200, 100, 500, 400);
        this.setTitle("This ia color title");

        c = this.getContentPane();
        c.setLayout(null);

        bt = new JButton("Chose a color.");
        bt.setBounds(100, 50, 150, 50);
        c.add(bt);

        bt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color color = JColorChooser.showDialog(null, "Select a color : ", Color.YELLOW);
                c.setBackground(color);
            }

        });
    }

    public static void main(String[] args) {
        JColorChoser_Demo frame = new JColorChoser_Demo();
        frame.setVisible(true);
    }

}
