package jscrollpane;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ScrollPane_Demo extends JFrame {

    private Container c;
    private JTextArea ta;
    private Font f;
    private JScrollPane scroll;

    ScrollPane_Demo() {
        initComponents();
    }

    public void initComponents() {
        c = this.getContentPane();
        c.setLayout(null);//relation add()
        c.setBackground(Color.pink);

        f = new Font("Arial", Font.BOLD, 18);

        ta = new JTextArea("This is a text area");
        ta.setFont(f);
        ta.setBackground(Color.red);
        ta.setForeground(Color.white);
        //ta.setLineWrap(true);
        //ta.setWrapStyleWord(true);
        
        
        //scroll = new JScrollPane(ta);//vertical bar
        //scroll = new JScrollPane(ta, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scroll = new JScrollPane(ta, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setBounds(50, 50, 300, 200);
        c.add(scroll);
    }

    public static void main(String[] args) {
        ScrollPane_Demo frame = new ScrollPane_Demo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200, 50, 500, 400);
        frame.setTitle("TextArea Demo title");
    }
}
