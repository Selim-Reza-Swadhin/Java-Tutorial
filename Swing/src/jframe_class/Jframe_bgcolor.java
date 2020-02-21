package jframe_class;

import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Jframe_bgcolor extends JFrame {

    private ImageIcon icon;//relation imageicon
    private Container c;//relation bgcolor

    Jframe_bgcolor() {
        initComponents();
    }

    public void initComponents() {
        c = this.getContentPane();
        c.setBackground(Color.MAGENTA);

        icon = new ImageIcon(getClass().getResource("images.png"));
        this.setIconImage(icon.getImage());
    }

    public static void main(String[] args) {
        Jframe_bgcolor jframe = new Jframe_bgcolor();
        jframe.setVisible(true);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //setSize+setLocation
        jframe.setBounds(200, 50, 400, 300);
        jframe.setTitle("This is title");
        jframe.setResizable(false);
    }
}
