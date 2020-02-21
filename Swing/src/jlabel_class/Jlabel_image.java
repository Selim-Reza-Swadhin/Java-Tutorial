package jlabel_class;

import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Jlabel_image extends JFrame {

    private Container c;
    private JLabel imgLabel;
    private ImageIcon img;

    Jlabel_image() {
        initComponents();
    }

    public void initComponents() {

        c = this.getContentPane();
        c.setLayout(null);//relation add()
        c.setBackground(Color.pink);

        img = new ImageIcon(getClass().getResource("images.png"));
        imgLabel = new JLabel("Text image Text image",img,JLabel.LEFT);
        imgLabel.setBounds(80, 50, 850, 250);
        //imgLabel = new JLabel(img);
        //imgLabel.setBounds(80, 50, 250, 250);
        //imgLabel.setBounds(80, 50, img.getIconWidth(), img.getIconHeight());
        c.add(imgLabel);

    }

    public static void main(String[] args) {
        Jlabel_image frame = new Jlabel_image();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setBounds(200, 50, 400, 400);
        frame.setBounds(200, 50, 500, 400);
        frame.setTitle("Label Demo title");
    }
}
