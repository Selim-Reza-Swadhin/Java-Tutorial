package jframe_class;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Jframe_icon extends JFrame {
    private ImageIcon icon;
    Jframe_icon(){
        initComponents();
    }
    
    public void initComponents(){
        //ImageIcon imageIcon = new ImageIcon(getClass().getResource("images.png"));
        //this.setIconImage(imageIcon.getImage());
        
        icon = new ImageIcon(getClass().getResource("images.png"));
        this.setIconImage(icon.getImage());
    }

    public static void main(String[] args) {
        Jframe_icon jframe = new Jframe_icon();
        jframe.setVisible(true);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //setSize+setLocation
        jframe.setBounds(200, 50, 400, 300);
        jframe.setTitle("This is title");
        jframe.setResizable(false);
    }
}
