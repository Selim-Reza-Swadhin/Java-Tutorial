package jcombobox;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class JCombobox_varius_method extends JFrame {

    private Container c;
    private Font f;
    private JComboBox cb;
    private String[] proLanguage = {"HTML5", "CSS3", "Sass", "Less", "Bootstrap", "JavaScript", "PHP", "C", "C++", "C#", "Java","Python"};

    JCombobox_varius_method() {
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
        //cb.setSelectedIndex(4);
        //cb.setSelectedItem("Bootstrap");
        cb.addItem("Laravel");
        cb.addItem("JDango");
        //cb.removeItem("Laravel");
        //cb.removeItemAt(12);
        cb.removeAllItems();
        System.out.println("Total item = "+cb.getItemCount());

    }

    public static void main(String[] args) {
        JCombobox_varius_method frame = new JCombobox_varius_method();
        frame.setVisible(true);
    }

}

