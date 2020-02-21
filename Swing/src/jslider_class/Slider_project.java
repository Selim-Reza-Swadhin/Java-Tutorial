package jslider_class;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Slider_project extends JFrame implements ChangeListener {

    private Container c;
    private Font f;
    private JSlider redSlider, greenSlider, blueSlider;
    private JLabel redLabel, greenLabel, blueLabel, previewLabel;
    private JTextField redTf, greenTf, blueTf;
    private JPanel panel;

    Slider_project() {
        initContents();
    }

    public void initContents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 800, 350);
        this.setTitle("This is a Slider project title");

        c = this.getContentPane();
        c.setLayout(null);
        //c.setBackground(Color.green);
        f = new Font("Arial", Font.BOLD + Font.ITALIC, 20);

        redLabel = new JLabel("Red");
        redLabel.setBounds(20, 35, 80, 50);
        redLabel.setFont(f);
        c.add(redLabel);

        //JSlider(min,max,knock)
        redSlider = new JSlider(0, 255, 0);
        redSlider.setBounds(90, 50, 300, 50);
        //blueSlider.setMinorTickSpacing(1);
        //blueSlider.setMajorTickSpacing(5);
        //blueSlider.setPaintTicks(true);
        //blueSlider.setPaintLabels(true);
        c.add(redSlider);

        redTf = new JTextField();
        redTf.setHorizontalAlignment(JTextField.CENTER);
        redTf.setBounds(400, 35, 80, 40);
        c.add(redTf);

        greenLabel = new JLabel("Green");
        greenLabel.setBounds(20, 105, 80, 50);
        greenLabel.setFont(f);
        c.add(greenLabel);

        greenSlider = new JSlider(0, 255, 0);
        greenSlider.setBounds(90, 120, 300, 50);
        //blueSlider.setMinorTickSpacing(1);
        //blueSlider.setMajorTickSpacing(5);
        //blueSlider.setPaintTicks(true);
        //blueSlider.setPaintLabels(true);
        c.add(greenSlider);

        greenTf = new JTextField();
        greenTf.setHorizontalAlignment(JTextField.CENTER);
        greenTf.setBounds(400, 120, 80, 40);
        c.add(greenTf);

        blueLabel = new JLabel("Blue");
        blueLabel.setBounds(20, 175, 80, 50);
        blueLabel.setFont(f);
        c.add(blueLabel);

        blueSlider = new JSlider(0, 255, 0);
        blueSlider.setBounds(90, 190, 300, 50);
        //blueSlider.setMinorTickSpacing(1);
        //blueSlider.setMajorTickSpacing(5);
        //blueSlider.setPaintTicks(true);
        //blueSlider.setPaintLabels(true);
        c.add(blueSlider);

        blueTf = new JTextField();
        blueTf.setHorizontalAlignment(JTextField.CENTER);
        blueTf.setBounds(400, 190, 80, 40);
        c.add(blueTf);

        panel = new JPanel();
        panel.setBounds(550, 25, 200, 160);
        panel.setBackground(Color.pink);
        c.add(panel);

        previewLabel = new JLabel("Preview");
        previewLabel.setBounds(620, 200, 100, 50);
        previewLabel.setFont(f);
        c.add(previewLabel);

        redSlider.addChangeListener(this);
        greenSlider.addChangeListener(this);
        blueSlider.addChangeListener(this);

    }

    @Override
    public void stateChanged(ChangeEvent e) {
        int redValue = redSlider.getValue();
        int greenValue = greenSlider.getValue();
        int blueValue = blueSlider.getValue();

        redTf.setText("" + redValue);
        greenTf.setText("" + greenValue);
        blueTf.setText("" + blueValue);

        Color color = new Color(redValue, greenValue, blueValue);
        panel.setBackground(color);
    }

    public static void main(String[] args) {

        Slider_project frame = new Slider_project();
        frame.setVisible(true);
    }

}
