package listener_class;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JScrollPane;

public class MouseMotionListener_Demo extends JFrame {

    private Container c;
    private Font f;
    private JTextField tf;
    private JTextArea ta;
    private JScrollPane scroll;

    MouseMotionListener_Demo() {
        initContents();
    }

    public void initContents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 50, 500, 500);
        this.setTitle("This is a Mouse Listener title");

        f = new Font("Arial", Font.BOLD + Font.ITALIC, 20);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.green);

        tf = new JTextField();
        tf.setBounds(30, 20, 400, 50);
        tf.setFont(f);
        c.add(tf);

        ta = new JTextArea();
        ta.setBackground(Color.pink);
        ta.setFont(f);
        c.add(ta);

        //scroll = new JScrollPane(ta);
        scroll = new JScrollPane(ta, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setBounds(30, 80, 400, 350);
        c.add(scroll);

        /*
        tf.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                ta.setText("mouse Dragged " + "x = " + e.getX() + " " + "y = " + e.getY());
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                ta.setText("mouse Moved " + "x = " + e.getX() + " " + "y = " + e.getY());
            }

        });*/
        ta.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                tf.setText("mouse Dragged " + "x = " + e.getX() + " " + "y = " + e.getY());
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                tf.setText("mouse Moved " + "x = " + e.getX() + " " + "y = " + e.getY());
            }

        });
    }

    public static void main(String[] args) {

        MouseMotionListener_Demo frame = new MouseMotionListener_Demo();
        frame.setVisible(true);
    }

}
