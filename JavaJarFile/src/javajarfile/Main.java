package javajarfile;

import javax.swing.JFrame;

public class Main {
        public static void main(String[] args) {
        Test_Actionlistener frame = new Test_Actionlistener();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(300, 20, 360, 700);
        frame.setTitle("Multiplication table title");
    }
}
