package listener_class;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JScrollPane;

public class MouseListener_Demo extends JFrame {

    private Container c;
    private Font f;
    private JTextField tf;
    private JTextArea ta;
    private JScrollPane scroll;

    MouseListener_Demo() {
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
        tf.setBounds(175, 50, 150, 50);
        c.add(tf);

        ta = new JTextArea();
        ta.setBackground(Color.pink);
        ta.setFont(f);
        c.add(ta);

        //scroll = new JScrollPane(ta);
        scroll = new JScrollPane(ta, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setBounds(100, 110, 300, 300);
        c.add(scroll);

        tf.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ta.append("mouse Clicked\n");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                ta.append("mouse Pressed\n");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                ta.append("mouse Releaseed\n");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                ta.append("mouse Entered\n");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                ta.append("mouse Exited\n");
            }

        });

    }

    public static void main(String[] args) {

        MouseListener_Demo frame = new MouseListener_Demo();
        frame.setVisible(true);
    }

}
