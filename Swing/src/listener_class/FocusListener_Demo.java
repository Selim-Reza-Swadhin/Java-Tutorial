package listener_class;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class FocusListener_Demo extends JFrame implements FocusListener {

    private Container c;
    private Font f;
    private JButton btn;
    private JTextArea ta;
    private JScrollPane scroll;

    FocusListener_Demo() {
        initContents();
    }

    public void initContents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 500, 400);
        this.setTitle("This is a Focus Listener title");

        f = new Font("Arial", Font.BOLD + Font.ITALIC, 20);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.orange);

        btn = new JButton("Button");
        btn.setBounds(10, 50, 80, 50);
        c.add(btn);

        ta = new JTextArea();
        ta.setBackground(Color.pink);
        ta.setBounds(100, 30, 200, 200);
        ta.setFont(f);
        c.add(ta);

        btn.addFocusListener(this);
    }

    @Override
    public void focusGained(FocusEvent e) {
        ta.setText("Focus gained");
    }

    @Override
    public void focusLost(FocusEvent e) {
        ta.setText("Focus lost");
    }

    public static void main(String[] args) {

        FocusListener_Demo frame = new FocusListener_Demo();
        frame.setVisible(true);
    }

}
