package jlayout_class;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayout_Demo extends JFrame {
    
    private Container c;
    private JButton btn1, btn2, btn3, btn4, btn5;
    private BorderLayout bLayout;
    
    BorderLayout_Demo() {
        initContents();
    }
    
    public void initContents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 500, 500);
        this.setTitle("This is border layout title");
        
        c = this.getContentPane();
        //bLayout = new BorderLayout(Horizontal, Vertical Gap);
        bLayout = new BorderLayout();
        //bLayout = new BorderLayout(10,5);
        bLayout.setHgap(10);
        bLayout.setVgap(5);
        c.setLayout(bLayout);
        
        btn1 = new JButton("NORTH");
        btn2 = new JButton("WEST");
        btn3 = new JButton("CENTER");
        btn4 = new JButton("EAST");
        btn5 = new JButton("SOUTH");
        
        c.add(btn1, BorderLayout.NORTH);
        c.add(btn2, BorderLayout.WEST);
        c.add(btn3, BorderLayout.CENTER);
        c.add(btn4, BorderLayout.EAST);
        c.add(btn5, BorderLayout.SOUTH);
        
    }
    
    public static void main(String[] args) {
        
        BorderLayout_Demo frame = new BorderLayout_Demo();
        frame.setVisible(true);
    }
    
}
