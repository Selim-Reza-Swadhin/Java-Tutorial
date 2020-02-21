package jframe_class;

import javax.swing.JFrame;

/*
public class JframeDemo {

    public static void main(String[] args) {
        JFrame jframe = new JFrame();
        jframe.setVisible(true);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //jframe.setSize(400, 300);
        //jframe.setLocationRelativeTo(null);
        //jframe.setLocation(200, 50);

        //setSize+setLocation
        jframe.setBounds(200, 50, 400, 300);
        jframe.setTitle("This is title");
        jframe.setResizable(false);
    }
}*/


public class JframeDemo extends JFrame {

    public static void main(String[] args) {
         //JFrame jframe = new JFrame("Super Awesome Window Title!");
        //jframe.setTitle("Super Awesome Window Title!");
        
        JframeDemo jframe = new JframeDemo();
        jframe.setVisible(true);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //jframe.setSize(400, 300);
        //jframe.setLocationRelativeTo(null);
        //jframe.setLocation(200, 50);

        //setSize+setLocation
        jframe.setBounds(200, 50, 400, 300);
        jframe.setTitle("This is title");
        jframe.setResizable(false);
    }
}
