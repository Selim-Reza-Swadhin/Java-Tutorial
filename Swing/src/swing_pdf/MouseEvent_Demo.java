package swing_pdf;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MouseEvent_Demo {

    public static void main(String[] args) {
        JFrame frame = new JFrame(); //creates the frame
        frame.setSize(300, 300);
        frame.setVisible(true);

        JButton B = new JButton("Say Hello World");
        B.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent arg0) {
                System.out.println("Hello World");
            }
        });
        B.setBounds(0, 0, frame.getHeight(), frame.getWidth());
        B.setVisible(true);
        frame.add(B);
    }
}
