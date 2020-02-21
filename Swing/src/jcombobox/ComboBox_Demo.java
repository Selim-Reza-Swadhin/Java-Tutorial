package jcombobox;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class ComboBox_Demo extends JFrame {

    private Container c;
    private Font f;
    private JComboBox cb;
    private String[] proLanguage = {"HTML5", "CSS3", "Sass", "Less", "Bootstrap", "JavaScript", "PHP", "C", "C++", "C#", "Java","Python"};

    ComboBox_Demo() {
        initContents();
    }

    public void initContents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 500, 500);
        this.setTitle("This is a combobox title");

        f = new Font("Arial", Font.BOLD + Font.ITALIC, 20);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.pink);

        cb = new JComboBox(proLanguage);
        cb.setBounds(50, 150, 100, 50);
        cb.setEditable(true);
        c.add(cb);

    }

    public static void main(String[] args) {
        ComboBox_Demo frame = new ComboBox_Demo();
        frame.setVisible(true);
    }

}
