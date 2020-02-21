package multiplication_table;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Test extends JFrame {

    private Container c;
    private JTextArea ta;
    private JTextField tf;
    private Font f;
    private JButton clearButton;
    private JLabel imgLabel, textLabel;
    private ImageIcon img;
    private Cursor cursor;

    Test() {
        initComponents();
    }

    public void initComponents() {
        c = this.getContentPane();
        c.setLayout(null);//relation add()
        c.setBackground(Color.pink);

        f = new Font("Tahoma", Font.BOLD+Font.ITALIC, 22);
        cursor = new Cursor(Cursor.HAND_CURSOR);
        
        img = new ImageIcon(getClass().getResource("download.png"));
        imgLabel = new JLabel(img);
        imgLabel.setBounds(20,10,img.getIconWidth(), img.getIconHeight());
        c.add(imgLabel);
        
        textLabel = new JLabel("Enter any number : ");
        textLabel.setBounds(18,200,225, 50);
        textLabel.setFont(f);
        textLabel.setForeground(Color.MAGENTA);
        c.add(textLabel);
        
        tf = new JTextField();
        tf.setBounds(230, 200, 90, 50);
        tf.setBackground(Color.green);
        tf.setHorizontalAlignment(JTextField.CENTER);
        tf.setFont(f);
        c.add(tf);
        
        clearButton = new JButton("Clear");
        clearButton.setBounds(230,260,90,50);
        clearButton.setBackground(Color.green);
        clearButton.setCursor(cursor);
        c.add(clearButton);
        
        
        ta = new JTextArea("This is a text area");
        ta.setFont(f);
        ta.setBackground(Color.green);
        ta.setForeground(Color.white);
        ta.setBounds(20,335,300, 310);
        c.add(ta);
        
        

    }

    public static void main(String[] args) {
        Test frame = new Test();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(300, 20, 360, 700);
        frame.setTitle("Multiplication table title");
    }

}
