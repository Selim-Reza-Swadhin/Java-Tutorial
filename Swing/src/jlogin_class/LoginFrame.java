package jlogin_class;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginFrame extends JFrame {

    private Container c;
    private JLabel userLabel, passLabel;
    private JTextField tf;
    private JPasswordField pf;
    private Font f;
    private JButton loginbtn, clearbtn;

    LoginFrame() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 50, 420, 350);
        this.setTitle("This is a Login frame title");

        initComponents();
    }

    public void initComponents() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.pink);

        f = new Font("Arial", Font.BOLD, 20);

        //user name or jlabel part
        userLabel = new JLabel("User Name : ");
        userLabel.setBounds(50, 50, 150, 50);
        userLabel.setFont(f);
        c.add(userLabel);

        //Text field area
        tf = new JTextField();
        tf.setBounds(170, 50, 200, 50);
        tf.setFont(f);
        c.add(tf);

        //password or jpassword field part
        passLabel = new JLabel("Password : ");
        passLabel.setBounds(50, 120, 150, 50);
        passLabel.setFont(f);
        c.add(passLabel);

        //Text field area
        pf = new JPasswordField();
        pf.setBounds(170, 120, 200, 50);
        pf.setFont(f);
        pf.setEchoChar('*');
        c.add(pf);

        //submit button part
        loginbtn = new JButton("Login");
        loginbtn.setBounds(170, 190, 90, 50);
        loginbtn.setFont(f);
        c.add(loginbtn);

        //clear button part
        clearbtn = new JButton("Clear");
        clearbtn.setBounds(280, 190, 90, 50);
        clearbtn.setFont(f);
        c.add(clearbtn);

        //add actionlistener clear button
        clearbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText("");
                pf.setText("");
            }
        });

        //add actionlistener login button
        loginbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userName = tf.getText();
                String password = pf.getText();

                if (userName.equals("selim") && password.equals("123")) {
                    JOptionPane.showMessageDialog(null, "You are successfully login.");
                    //dispose();//vanice before frame
                    
                    //LoginFrame_move_others_file
                    LoginFrame_move_others_file frame = new LoginFrame_move_others_file();
                    frame.setVisible(true);

                } else {
                    JOptionPane.showMessageDialog(null, "Invalid username or password");
                }
            }
        });
    }

    public static void main(String[] args) {
        LoginFrame frame = new LoginFrame();
        frame.setVisible(true);
    }

}
