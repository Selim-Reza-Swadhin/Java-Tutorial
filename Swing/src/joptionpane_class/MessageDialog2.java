package joptionpane_class;

import javax.swing.JOptionPane;

 public class MessageDialog2 {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Wrong password");
        JOptionPane.showMessageDialog(null, "Wrong password", "Plain", -1);
        JOptionPane.showMessageDialog(null, "Wrong password", "Information", 1);
        JOptionPane.showMessageDialog(null, "Wrong password", "Error", 0);
        JOptionPane.showMessageDialog(null, "Wrong password", "Warning", 2);
        JOptionPane.showMessageDialog(null, "Wrong password", "Question", 3);
    }

}
