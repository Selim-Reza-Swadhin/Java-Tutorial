package jradiobutton_class;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class RadioButton_ActionListener extends JFrame {

    private Container c;
    private JRadioButton male, female;
    private ButtonGroup grp;
    private Font f;
    private JTextArea ta;

    RadioButton_ActionListener() {
        initComponents();
    }

    public void initComponents() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 50, 500, 400);
        this.setTitle("This is a jradiobutton title");

        f = new Font("Arial", Font.BOLD + Font.ITALIC, 20);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.orange);

        male = new JRadioButton("Male");
        male.setBounds(50, 50, 100, 50);
        male.setBackground(Color.orange);
        male.setFont(f);
        c.add(male);

        female = new JRadioButton("Female");
        female.setBounds(160, 50, 100, 50);
        female.setBackground(Color.orange);
        female.setFont(f);
        //female.setSelected(true);//internal selected
        //female.setEnabled(false);//disable
        c.add(female);

        grp = new ButtonGroup();//select radio button
        grp.add(male);
        grp.add(female);

        //Text Area
        ta = new JTextArea();
        ta.setBounds(40, 110, 400, 200);
        ta.setFont(f);
        ta.setBackground(Color.pink);
        c.add(ta);

        Handler handler = new Handler();
        male.addActionListener(handler);
        female.addActionListener(handler);
    }

    class Handler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            /*
            if (e.getSource() == male) {
                //ta.setText("You have selcted male");
                ta.append("You have selcted male\n");
            } else {
                //ta.setText("You have selcted female");
                ta.append("You have selcted female\n");
            }
             */

            if (male.isSelected()) {
                //ta.setText("You have selcted male");
                ta.append("You have selcted male\n");
            } else {
                //ta.setText("You have selcted female");
                ta.append("You have selcted female\n");
            }
        }

    }

    public static void main(String[] args) {
        RadioButton_ActionListener frame = new RadioButton_ActionListener();
        frame.setVisible(true);
    }

}
