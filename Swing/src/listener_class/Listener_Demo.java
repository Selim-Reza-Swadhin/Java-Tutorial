package listener_class;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Listener_Demo extends JFrame {

    private Container c;
    private JButton redButton, greenButton, blueButton;
    private Font f;

    Listener_Demo() {
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

        
        redButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c.setBackground(Color.red);
            }

        });

        blueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c.setBackground(Color.blue);
            }

        });

        greenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c.setBackground(Color.green);
            }

        });

    }

    public static void main(String[] args) {

        Listener_Demo frame = new Listener_Demo();
        frame.setVisible(true);
    }

}
