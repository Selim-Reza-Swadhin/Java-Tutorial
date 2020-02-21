package listener_class;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class KeyListener_count_vowel extends JFrame {

    private Container c;
    private Font f;
    private JTextArea inputTextArea;
    private JLabel prompLabel, vowelLabel, aLabel, eLabel, iLabel, oLabel, uLabel;
    private JScrollPane scroll;

    int totalVowel = 0;
    int letter_a = 0;
    int letter_e = 0;
    int letter_i = 0;
    int letter_o = 0;
    int letter_u = 0;

    KeyListener_count_vowel() {
        initContents();
    }

    public void initContents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 600, 500);
        this.setTitle("This is a KeyListener Count vowel title");

        f = new Font("Arial", Font.BOLD + Font.ITALIC, 20);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.green);

        prompLabel = new JLabel("Enter the Test : ");
        prompLabel.setBounds(10, 20, 170, 30);
        prompLabel.setFont(f);
        c.add(prompLabel);

        inputTextArea = new JTextArea();
        inputTextArea.setLineWrap(true);
        inputTextArea.setWrapStyleWord(true);
        inputTextArea.setBackground(Color.pink);
        inputTextArea.setFont(f);
        c.add(inputTextArea);

        scroll = new JScrollPane(inputTextArea);
        scroll.setBounds(160, 20, 400, 100);
        c.add(scroll);

        //vowelLabel = new JLabel();
        vowelLabel = new JLabel("Total number of vowel : " + totalVowel);
        vowelLabel.setBounds(110, 150, 300, 30);
        vowelLabel.setFont(f);
        c.add(vowelLabel);

        //aLabel = new JLabel();
        aLabel = new JLabel("Total number of vowel a : " + letter_a);
        aLabel.setBounds(110, 190, 300, 30);
        aLabel.setFont(f);
        c.add(aLabel);

        //eLabel = new JLabel();
        eLabel = new JLabel("Total number of vowel e : " + letter_e);
        eLabel.setBounds(110, 230, 300, 30);
        eLabel.setFont(f);
        c.add(eLabel);

        //iLabel = new JLabel();
        iLabel = new JLabel("Total number of vowel i : " + letter_i);
        iLabel.setBounds(110, 270, 300, 30);
        iLabel.setFont(f);
        c.add(iLabel);

        oLabel = new JLabel("Total number of vowel o : " + letter_o);
        oLabel.setBounds(110, 310, 300, 30);
        oLabel.setFont(f);
        c.add(oLabel);

        uLabel = new JLabel("Total number of vowel u : " + letter_u);
        uLabel.setBounds(110, 350, 300, 30);
        uLabel.setFont(f);
        c.add(uLabel);

        inputTextArea.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getSource() == inputTextArea) {
                    if (e.VK_A == e.getKeyCode()) {
                        letter_a++;
                        totalVowel++;
                    }
                    if (e.VK_E == e.getKeyCode()) {
                        letter_e++;
                        totalVowel++;
                    }
                    if (e.VK_I == e.getKeyCode()) {
                        letter_i++;
                        totalVowel++;
                    }
                    if (e.VK_O == e.getKeyCode()) {
                        letter_o++;
                        totalVowel++;
                    }
                    if (e.VK_U == e.getKeyCode()) {
                        letter_u++;
                        totalVowel++;
                    }
                }
                vowelLabel.setText("Total number of vowel : " + totalVowel);
                aLabel.setText("Total number of vowel a : " + letter_a);
                eLabel.setText("Total number of vowel e : " + letter_e);
                iLabel.setText("Total number of vowel i : " + letter_i);
                oLabel.setText("Total number of vowel o : " + letter_o);
                uLabel.setText("Total number of vowel u : " + letter_u);
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }

        });

    }

    public static void main(String[] args) {

        KeyListener_count_vowel frame = new KeyListener_count_vowel();
        frame.setVisible(true);
    }

}
