package jlogin_class;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LoginFrame_move_others_file extends JFrame {

    private final Container c;
    private final JLabel label;
    private final Font f;

    LoginFrame_move_others_file() {
        //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setBounds(620, 100, 400, 400);
        this.setTitle("This is a Login new frame title");

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.orange);
        
        f = new Font("Arial", Font.BOLD, 20);

        label = new JLabel("Welcome to the new frame.");
        label.setBounds(50, 50, 550, 50);
        label.setFont(f);
        c.add(label);
    }

    public static void main(String[] args) {

        LoginFrame_move_others_file frame = new LoginFrame_move_others_file();
        frame.setVisible(true);
    }
}
