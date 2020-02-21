package listener_class;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.KeyListener;

public class KeyListenerr extends JFrame {

    private Container c;
    private Font f;
    private JTextField tf;
    private JTextArea ta;

    KeyListenerr() {
        initContents();
    }

    public void initContents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 50, 500, 500);
        this.setTitle("This is a KeyListener title");

        f = new Font("Arial", Font.BOLD + Font.ITALIC, 20);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.green);

        tf = new JTextField();
        tf.setBounds(175, 50, 150, 50);
        c.add(tf);

        ta = new JTextArea();
        ta.setBounds(100, 110, 300, 300);
        ta.setBackground(Color.pink);
        ta.setFont(f);
        c.add(ta);

        tf.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                ta.append("Key Typed : " + e.getKeyChar()+"\n");
            }

            @Override
            public void keyPressed(KeyEvent e) {
                ta.append("Key Pressed : " + e.getKeyChar()+"\n");
            }

            @Override
            public void keyReleased(KeyEvent e) {
                ta.append("Key Released : " + e.getKeyChar()+"\n");
            }

        });

    }

    public static void main(String[] args) {

        KeyListenerr frame = new KeyListenerr();
        frame.setVisible(true);
    }

}
