package jcombobox;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Combobox_Actionlistener extends JFrame {
    
    private Container c;
    private Font f;
    private JComboBox cb;
    private String[] proLanguage = {"HTML5", "CSS3", "Sass", "Less", "Bootstrap", "JavaScript", "PHP", "C", "C++", "C#", "Java", "Python"};
    private JLabel label;
    private JButton btn;
    
    Combobox_Actionlistener() {
        initContents();
    }
    
    public void initContents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 500, 500);
        this.setTitle("This is a combobox title");
        
        f = new Font("Arial", Font.BOLD + Font.ITALIC, 20);
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.pink);
        
        cb = new JComboBox(proLanguage);
        cb.setBounds(50, 150, 100, 50);        
        c.add(cb);

        //ComboBox Method
        cb.setEditable(true);
        cb.addItem("Laravel");
        cb.addItem("JDango");
        
        label = new JLabel("Please selected !");
        label.setBounds(160, 150, 200, 50);
        c.add(label);
                
//        cb.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String s = cb.getSelectedItem().toString();
//                label.setText("You have selected : " + s);
//            }
//            
//        });


        btn = new JButton("Click me");
        btn.setBounds(50, 250, 80, 50);
        c.add(btn);
        
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = cb.getSelectedItem().toString();
                label.setText("You have selected : " + s);
            }
            
        });
        
    }
    
    public static void main(String[] args) {
        Combobox_Actionlistener frame = new Combobox_Actionlistener();
        frame.setVisible(true);
    }
    
}
