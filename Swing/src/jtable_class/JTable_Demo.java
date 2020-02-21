package jtable_class;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTable_Demo extends JFrame {

    private Container c;
    private Font f;
    private JLabel label;
    private JScrollPane scroll;
    private JTable table;
    private String[] cols = {"ID", "Name", "GPA"};
    private String[][] rows = {
        {"100", "Selim", "3.43"},
        {"101", "Reza", "3.44"},
        {"102", "Swadhin", "3.45"},
        {"103", "Hamid", "3.46"},
        {"100", "Selim", "3.43"},
        {"101", "Reza", "3.44"},
        {"102", "Swadhin", "3.45"},
        {"103", "Hamid", "3.46"},
        {"100", "Selim", "3.43"},
        {"101", "Reza", "3.44"},
        {"102", "Swadhin", "3.45"},
        {"103", "Hamid", "3.46"}
    };

    JTable_Demo() {
        initContents();
    }

    public void initContents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 50, 600, 500);
        this.setTitle("Title name");

        f = new Font("Arial", Font.BOLD + Font.ITALIC, 20);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.green);

        label = new JLabel("Students Details :");
        label.setBounds(250, 20, 200, 50);
        label.setFont(f);
        c.add(label);

        table = new JTable(rows, cols);
        table.setBackground(Color.pink);
        table.setSelectionBackground(Color.white);
        //table.setEnabled(false);

        //scroll = new JScrollPane(ta);
        scroll = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setBounds(50, 80, 500, 200);
        c.add(scroll);
    }

    public static void main(String[] args) {

        JTable_Demo frame = new JTable_Demo();
        frame.setVisible(true);
    }

}
