package joptionpane_class;

import javax.swing.JOptionPane;

public class MessageDialog1 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Wrong password");//midle possition dialog box
        JOptionPane.showMessageDialog(null, "Wrong password","Warning",JOptionPane.ERROR_MESSAGE);
        JOptionPane.showMessageDialog(null, "Wrong password","Selim",JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, "Wrong password","Selim",JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Wrong password","Selim",JOptionPane.PLAIN_MESSAGE);
    }
 
}
