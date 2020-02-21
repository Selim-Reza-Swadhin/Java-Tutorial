package jframe_class;

import javax.swing.JFrame;

public class JframeDemo_2 extends JFrame {

    JframeDemo_2() {//constructor
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setSize+setLocation
        setBounds(200, 50, 400, 300);
        //setTitle("This is title");
        setResizable(false);
    }

    public static void main(String[] args) {
        JframeDemo_2 jframe = new JframeDemo_2();
        jframe.setVisible(true);
    }
}
