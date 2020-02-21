package joptionpane_class;

import javax.swing.JOptionPane;

public class InputDialog {
    
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name : ");
        JOptionPane.showMessageDialog(null, name +" Welcome to swing");
    }
    
}
