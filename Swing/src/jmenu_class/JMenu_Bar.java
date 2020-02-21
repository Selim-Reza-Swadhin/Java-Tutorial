package jmenu_class;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class JMenu_Bar extends JFrame implements ActionListener {

    private ImageIcon cutIcon, newIcon;
    private Container c;
    private JMenuBar menubar;
    private JMenu file, edit, help;
    private JMenuItem newItem, openItem, exitItem, cutItem, copyItem, pasteItem, selectAllItem;

    JMenu_Bar() {
        initContents();
    }

    public void initContents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 600, 500);
        this.setTitle("This is a jmenubar title");

        menubar = new JMenuBar();
        this.setJMenuBar(menubar);
        menubar.setBackground(Color.green);

        //adding menu bar
        file = new JMenu("File ");
        edit = new JMenu("Edit ");
        help = new JMenu(" Help");

        menubar.add(file);
        menubar.add(edit);
        menubar.add(help);

        cutIcon = new ImageIcon("src/images/cut.png");
        newIcon = new ImageIcon("src/images/edit.png");

        //adding menu item
        newItem = new JMenuItem("New");
        newItem.setIcon(newIcon);//add icon
        newItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));//add short cut key

        openItem = new JMenuItem("Open");
        exitItem = new JMenuItem("Exit");
        copyItem = new JMenuItem("Copy");
        cutItem = new JMenuItem("Cut");
        cutItem.setIcon(cutIcon);

        pasteItem = new JMenuItem("Paste");
        selectAllItem = new JMenuItem("Select All");

        file.add(newItem);
        file.addSeparator();
        file.add(openItem);
        file.add(exitItem);

        edit.add(cutItem);
        edit.addSeparator();
        edit.add(copyItem);
        edit.addSeparator();
        edit.add(pasteItem);
        edit.add(selectAllItem);

        newItem.addActionListener(this);
        exitItem.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == newItem) {
            JFrame newframe = new JFrame();
            newframe.setVisible(true);
            newframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            newframe.setBounds(700, 100, 600, 500);
            newframe.setTitle("This is a created new frame");

            c = this.getContentPane();
            c.setLayout(null);
            c.setBackground(Color.orange);

        } else if (e.getSource() == exitItem) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        JMenu_Bar frame = new JMenu_Bar();
        frame.setVisible(true);
    }

}
