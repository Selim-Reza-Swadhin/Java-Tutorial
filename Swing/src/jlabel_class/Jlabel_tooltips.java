package jlabel_class;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Jlabel_tooltips extends JFrame {

    private Container c;
    private JLabel userLabel, passLabel;
    private Font f;

    Jlabel_tooltips() {
        initComponents();
    }

    public void initComponents() {
        c = this.getContentPane();
        c.setLayout(null);//relation add()
        c.setBackground(Color.pink);

        //Font(font_name,font_style,font_size)
        f = new Font("Arial", Font.BOLD, 18);

        userLabel = new JLabel();
        userLabel.setText("Enter your user name : ");
        userLabel.setBounds(50, 20, 250, 50);
        userLabel.setFont(f);//relation font
        userLabel.setForeground(Color.black);
        userLabel.setOpaque(true);//relation JLabel
        userLabel.setBackground(Color.green);
        userLabel.setToolTipText("I am set tool tips text");
        c.add(userLabel);
        
        //System.out.println(""+userLabel.getText());//console
        String s = userLabel.getToolTipText();
        //System.out.println(s);//console
        //passLabel = new JLabel(s);
        
        passLabel = new JLabel("Enter your password");
        passLabel.setBounds(50, 70, 250, 50);
        passLabel.setFont(f);
        c.add(passLabel);

    }

    public static void main(String[] args) {
        Jlabel_tooltips frame = new Jlabel_tooltips();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200, 50, 500, 400);
        frame.setTitle("Label Demo title");
    }
}


