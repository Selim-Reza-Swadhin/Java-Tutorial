package swing_pdf;

import javax.swing.*;
import java.awt.GridLayout;

public class Grid_layout {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(Grid_layout::createAndShowJFrame);

    }

    private static void createAndShowJFrame() {

        JFrame jFrame = new JFrame("Grid Layout Example");
        // Create layout and add buttons to show restraints
        JPanel jPanel = new JPanel(new GridLayout(2, 2));

        jPanel.add(new JButton("x=0, y=0"));
        jPanel.add(new JButton("x=1, y=0"));
        jPanel.add(new JButton("x=0, y=1"));
        jPanel.add(new JButton("x=1, y-1"));
        jFrame.setContentPane(jPanel);
        jFrame.pack();
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }
}
