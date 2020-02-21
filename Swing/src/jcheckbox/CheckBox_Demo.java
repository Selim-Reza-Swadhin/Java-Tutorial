package jcheckbox;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CheckBox_Demo extends JFrame {

    private Container c;
    private JCheckBox javaCheckbox, ccheckbox, mysqlCheckbox;
    private JLabel label;
    private ButtonGroup grp;
    private Font f;

    CheckBox_Demo() {
        initComponents();
    }

    public void initComponents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(200, 100, 500, 400);
        this.setTitle("Thia is a checkbox title");

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.pink);

        grp = new ButtonGroup();
        f = new Font("Arial", Font.BOLD + Font.ITALIC, 20);

        javaCheckbox = new JCheckBox("Java");
        javaCheckbox.setBounds(50, 50, 100, 30);
        javaCheckbox.setBackground(Color.pink);
        javaCheckbox.setFont(f);
        c.add(javaCheckbox);

        ccheckbox = new JCheckBox("C");
        //ccheckbox = new JCheckBox("C",true);//select button
        ccheckbox.setBounds(50, 80, 100, 30);
        ccheckbox.setBackground(Color.pink);
        ccheckbox.setFont(f);
        //ccheckbox.setSelected(true);
        c.add(ccheckbox);

        mysqlCheckbox = new JCheckBox("Mysql");
        mysqlCheckbox.setBounds(50, 110, 100, 30);
        mysqlCheckbox.setBackground(Color.pink);
        mysqlCheckbox.setFont(f);
        c.add(mysqlCheckbox);

        grp.add(javaCheckbox);
        grp.add(ccheckbox);
        grp.add(mysqlCheckbox);

        label = new JLabel("You have no selected anything.");
        label.setBounds(50, 200, 300, 30);
        label.setFont(f);
        c.add(label);

        Handler handler = new Handler();

        javaCheckbox.addActionListener(handler);
        ccheckbox.addActionListener(handler);
        mysqlCheckbox.addActionListener(handler);

    }

    class Handler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
//            if (javaCheckbox.isSelected()) {
//                label.setText("You have selected Java.");
//            } else if (ccheckbox.isSelected()) {
//                label.setText("You have selected C.");
//            } else {
//                label.setText("You have selected Mysql.");
//            }

            if (e.getSource() == javaCheckbox) {
                label.setText("You have selected Java.");
            } else if (e.getSource() == ccheckbox) {
                label.setText("You have selected C.");
            } else {
                label.setText("You have selected Mysql.");
            }
        }

    }

    public static void main(String[] args) {
        CheckBox_Demo frame = new CheckBox_Demo();
        frame.setVisible(true);
    }
}
