package swing_pdf;

import javax.swing.*;
import java.awt.FlowLayout;

public class Flow_layout {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                JPanel panel = new JPanel();
                panel.setLayout(new FlowLayout());
                panel.add(new JButton("One"));
                panel.add(new JButton("Two"));
                panel.add(new JButton("Three"));
                panel.add(new JButton("Four"));
                panel.add(new JButton("Five"));
                
                JFrame frame = new JFrame();
                frame.setContentPane(panel);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }
}
