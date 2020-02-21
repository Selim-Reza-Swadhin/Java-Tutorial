package jbutton;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;

public class JButton_cursor extends JFrame {

    private Container c;
    private JButton btn1, btn2;
    private Font f;
    private Cursor cursor1,cursor2;

    JButton_cursor() {
        initComponents();
    }

    public void initComponents() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.pink);

        f = new Font("Arial", Font.BOLD, 20);
        cursor1 = new Cursor(Cursor.HAND_CURSOR);
        cursor2 = new Cursor(Cursor.MOVE_CURSOR);

        btn1 = new JButton("Submit");
        btn1.setBounds(100, 50, 120, 50);
        btn1.setBackground(Color.black);
        btn1.setForeground(Color.white);
        btn1.setFont(f);
        btn1.setCursor(cursor1);
        c.add(btn1);

        btn2 = new JButton("Clear");
        btn2.setBounds(250, 50, 100, 50);
        btn2.setFont(f);
        btn2.setBackground(Color.blue);
        btn2.setForeground(Color.white);
        btn2.setCursor(cursor2);
        c.add(btn2);
    }

    public static void main(String[] args) {
        JButton_cursor frame = new JButton_cursor();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 50, 500, 400);
        frame.setTitle("This is a jpasswordfeild title");
    }

}
