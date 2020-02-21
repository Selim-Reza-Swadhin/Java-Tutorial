package jlayout_class;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Slideshow_Demo extends JFrame implements ActionListener {

    private Container c;
    private Font f;
    private CardLayout cardLayout;
    private JPanel panel;
    private JLabel label;
    private JButton preButton, nextButton;
    private ImageIcon icon;

    Slideshow_Demo() {
        initContents();
        showImage();
    }

    public void showImage() {
        String[] imageName = {"baby-1.jpg", "baby-2.jpg", "baby-3.jpg", "baby-4.jpg", "baby-5.jpg", "baby-6.jpg"};
        for (String n : imageName) {
            icon = new ImageIcon("src/images/" + n);

            //resizing image
            Image img = icon.getImage();
            Image newImage = img.getScaledInstance(panel.getWidth(), panel.getHeight(), Image.SCALE_SMOOTH);
            icon = new ImageIcon(newImage);

            label = new JLabel(icon);
            panel.add(label);
        }
    }

    public void initContents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 600, 500);
        this.setTitle("This is a slide show layout title");

        f = new Font("Arial", Font.BOLD + Font.ITALIC, 15);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.green);
        cardLayout = new CardLayout();

        panel = new JPanel(cardLayout);
        panel.setBounds(10, 10, 560, 380);
        c.add(panel);

        preButton = new JButton("Previous");
        preButton.setBounds(10, 400, 100, 50);
        preButton.setFont(f);
        preButton.setBackground(Color.orange);
        c.add(preButton);

        nextButton = new JButton("Next");
        nextButton.setBounds(470, 400, 100, 50);
        nextButton.setFont(f);
        nextButton.setBackground(Color.yellow);
        c.add(nextButton);

        preButton.addActionListener(this);
        nextButton.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == preButton) {
            cardLayout.previous(panel);
        } else {
            cardLayout.next(panel);
        }
    }

    public static void main(String[] args) {

        Slideshow_Demo frame = new Slideshow_Demo();
        frame.setVisible(true);
    }

}
