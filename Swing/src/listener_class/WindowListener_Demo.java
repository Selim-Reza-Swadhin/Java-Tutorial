package listener_class;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;

public class WindowListener_Demo extends JFrame implements WindowListener {

    private Container c;
    private Font f;

    WindowListener_Demo() {
        initContents();
    }

    public void initContents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 500, 500);
        this.setTitle("This is a Window Listener title");

        f = new Font("Arial", Font.BOLD + Font.ITALIC, 20);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.green);

        this.addWindowListener(this);
    }

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("window Opened");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("window Closing");
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("window Closed");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("window Iconified");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("window Deiconified");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("window Activated");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("window Deactivated");
    }

    public static void main(String[] args) {

        WindowListener_Demo frame = new WindowListener_Demo();
        frame.setVisible(true);
    }

}
