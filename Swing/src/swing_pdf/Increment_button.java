package swing_pdf;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

/**
 * A very simple Swing example.
 */
public class Increment_button {

    /**
     * The number of times the user has clicked the button.
     */
    private long clickCount;

    /**
     * The main method: starting point of this application.
     *
     *
     * @param arguments the unused command-line arguments.
     */
    public static void main(final String[] arguments) {
        new Increment_button().run();
    }

    /**
     * Schedule a job for the event-dispatching thread: create and show this
     * application's GUI.
     */
    private void run() {
        SwingUtilities.invokeLater(this::createAndShowGui);
    }

    /**
     * Create the simple GUI for this application and make it visible.
     */
    private void createAndShowGui() {
        // Create the frame and make sure the application exits when the user closes
        // the frame.

        JFrame mainFrame = new JFrame("Counter");
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // Add a simple button and label.
        JPanel panel = new JPanel();
        JButton button = new JButton("Click me!");
        JLabel label = new JLabel("Click count: " + clickCount);

        panel.add(button);
        panel.add(label);
        mainFrame.getContentPane().add(panel);
        // Add an action listener to the button to increment the count displayed by
        // the label.

        button.addActionListener(actionEvent -> {
            clickCount++;
            label.setText("Click count: " + clickCount);
        });

        // Size the frame.
        mainFrame.setBounds(80, 60, 400, 300);

        //Center on screen
        mainFrame.setLocationRelativeTo(null);

        //Display frame
        mainFrame.setVisible(true);
    }
}
