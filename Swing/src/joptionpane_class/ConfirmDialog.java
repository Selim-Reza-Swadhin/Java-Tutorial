package joptionpane_class;

import javax.swing.JOptionPane;

public class ConfirmDialog {

    public static void main(String[] args) {
        int choice = JOptionPane.showConfirmDialog(null, "Do you want to quit yes option", "This is a title", JOptionPane.YES_NO_OPTION);

        if (choice == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else {
            System.out.println("You have no option");
        }
    }

}
