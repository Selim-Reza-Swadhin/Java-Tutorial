package joptionpane_class;

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

 public class MessageDialog3 {

    public static void main(String[] args) {
        ImageIcon img = new ImageIcon("src/images/pencil.png");
        JOptionPane.showMessageDialog(null, "Enter correct password", "This is a title", JOptionPane.PLAIN_MESSAGE,img);
    }

}

