package jtextfield_class;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Jtextfield_actionlistener_2 extends JFrame {

    private Container c;
    private JTextField tf1, tf2;
    private Font f;

    Jtextfield_actionlistener_2() {
        initComponents();
    }

    public void initComponents() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.orange);

        f = new Font("Arial", Font.ITALIC + Font.BOLD, 22);

        tf1 = new JTextField();
        tf1.setBounds(50, 50, 200, 50);
        tf1.setFont(f);
        tf1.setForeground(Color.red);
        tf1.setBackground(Color.green);
        tf1.setHorizontalAlignment(JTextField.CENTER);
        c.add(tf1);

        tf2 = new JTextField();
        //tf2.setText("anisul");
        tf2.setFont(f);
        tf2.setBounds(50, 110, 200, 50);
        tf2.setForeground(Color.green);
        tf2.setBackground(Color.red);
        tf2.setHorizontalAlignment(JTextField.CENTER);
        c.add(tf2);

        //actionlistener formula one
        Handler handler = new Handler();
        tf1.addActionListener(handler);
        tf2.addActionListener(handler);
    }

    class Handler implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == tf1) {
                String s = tf1.getText();
                if (s.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please enter something");
                } else {
                    JOptionPane.showMessageDialog(null, "tf1 = " + s);
                }
            } else {
                String s = tf2.getText();
                if (s.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please enter something");
                } else {
                    JOptionPane.showMessageDialog(null, "tf2 = " + s);
                }
            }

        }
    ;

    }

    public static void main(String[] args) {
        Jtextfield_actionlistener_2 frame = new Jtextfield_actionlistener_2();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 50, 500, 400);
        frame.setTitle("This is a jtextfeild actionlistener 2 title");
    }
}
