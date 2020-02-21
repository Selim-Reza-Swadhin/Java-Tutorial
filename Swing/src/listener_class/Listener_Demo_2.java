package listener_class;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Listener_Demo_2 extends JFrame implements ActionListener {

    private Container c;
    private JButton redButton, greenButton, blueButton;
    private Font f;

    Listener_Demo_2() {
        initContents();
    }

    public void initContents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 600, 500);
        this.setTitle("This is a Listener title");

        f = new Font("Arial", Font.BOLD + Font.ITALIC, 20);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.pink);

        redButton = new JButton("Red");
        redButton.setBounds(50, 50, 100, 50);
        redButton.setFont(f);
        c.add(redButton);

        greenButton = new JButton("Green");
        greenButton.setBounds(50, 110, 100, 50);
        greenButton.setFont(f);
        c.add(greenButton);

        blueButton = new JButton("Blue");
        blueButton.setBounds(50, 180, 100, 50);
        blueButton.setFont(f);
        c.add(blueButton);

        redButton.addActionListener(this);
        greenButton.addActionListener(this);
        blueButton.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == redButton) {
            c.setBackground(Color.red);
        } else if (e.getSource() == greenButton) {
            c.setBackground(Color.green);
        } else {
            c.setBackground(Color.blue);
        }
    }

    public static void main(String[] args) {

        Listener_Demo_2 frame = new Listener_Demo_2();
        frame.setVisible(true);
    }

}
