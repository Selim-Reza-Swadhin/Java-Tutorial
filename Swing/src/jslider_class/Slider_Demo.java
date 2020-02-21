package jslider_class;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.JTextArea;

public class Slider_Demo extends JFrame {

    private Container c;
    private Font f;
    private JTextArea ta;
    private JSlider slider;

    Slider_Demo() {
        initContents();
    }

    public void initContents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 600, 400);
        this.setTitle("Title name");

        f = new Font("Arial", Font.BOLD + Font.ITALIC, 20);

        c = this.getContentPane();
        c.setLayout(null);
        //c.setBackground(Color.green);

        //JSlider(min,max,knock)
        //slider = new JSlider();
        slider = new JSlider(0, 30, 0);
        //slider = new JSlider(JSlider.VERTICAL, 0, 30, 0);
        //slider.setBounds(100, 50, 50, 300);
        slider.setBounds(100, 50, 300, 50);
        slider.setMinorTickSpacing(1);
        slider.setMajorTickSpacing(5);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        c.add(slider);
    }

    public static void main(String[] args) {

        Slider_Demo frame = new Slider_Demo();
        frame.setVisible(true);
    }

}
