package joptionpane_class;

import javax.swing.JOptionPane;

public class InputDialog_2 {

    public static void main(String[] args) {
        //JOptionPane.showInputDialog("Enter your name : ", "Selim");
        String fname = JOptionPane.showInputDialog(null,"Enter your first name : ","This is a title",JOptionPane.QUESTION_MESSAGE);
        String lname = JOptionPane.showInputDialog("Enter your last name : ");
        
        String name = fname +" "+ lname;
        JOptionPane.showMessageDialog(null, "Your full name is "+name);
    }

}
