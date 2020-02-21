package jspinner;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class JSpinner_ChangeListener extends JFrame implements ChangeListener {
    
    private Container c;
    private JSpinner spinner;
    private JLabel label;
    private Font f;
    
    JSpinner_ChangeListener() {
        
        initContents();
    }
    
    public void initContents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 450, 450);
        this.setTitle("This ia spinner title");
        
        f = new Font("Arial", Font.BOLD + Font.ITALIC, 20);
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.pink);

//SpinnerNumberModel(default, min, max, step)
        SpinnerNumberModel value = new SpinnerNumberModel(10, -30, 30, 3);
        
        spinner = new JSpinner(value);
        spinner.setBounds(100, 100, 70, 50);
        spinner.setFont(f);
        c.add(spinner);
        
        label = new JLabel("Current value : 10;");
        label.setBounds(100, 200, 200, 50);
        label.setFont(f);
        c.add(label);
        spinner.addChangeListener(this);
        
    }
    
    @Override
    public void stateChanged(ChangeEvent e) {
        String number = spinner.getValue().toString();
        int value = Integer.parseInt(number);
        label.setText("Current value = " + value+";");
    }
    
    public static void main(String[] args) {
        JSpinner_ChangeListener frame = new JSpinner_ChangeListener();
        frame.setVisible(true);
    }
    
}
