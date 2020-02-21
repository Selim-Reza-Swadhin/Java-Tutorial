package jpanel_class;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JPanel_Demo extends JFrame {

    private Container c;
    private JPanel panel1, panel2;
    private Font f;
    private JButton btn1, btn2, btn3;
    private JLabel label;

    JPanel_Demo() {
        initContents();
    }

    public void initContents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 670, 500);
        this.setTitle("This is a Jpanel title");

        f = new Font("Arial", Font.BOLD + Font.ITALIC, 20);

        c = this.getContentPane();
        c.setLayout(null);
        c.setFont(f);
        c.setBackground(Color.pink);
        
        label = new JLabel("JPanel Create");
        label.setBounds(50, 20, 200, 50);
        c.add(label);
        
        btn1 = new JButton("One");
        btn2 = new JButton("Two");
        btn3 = new JButton("Three");

        panel1 = new JPanel();
        panel1.setBounds(100, 100, 250, 300);
        panel1.setBackground(Color.red);
        panel1.setFont(f);
        c.add(panel1);

        panel2 = new JPanel();
        panel2.setBounds(360, 100, 250, 300);
        panel2.setBackground(Color.green);
        panel2.setFont(f);
        c.add(panel2);
        
        panel1.add(btn1);
        panel1.add(btn3);
        panel2.add(btn2);

    }

    public static void main(String[] args) {

        JPanel_Demo frame = new JPanel_Demo();
        frame.setVisible(true);
    }

}
