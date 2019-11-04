package helpers;

import controllers.AddBuddy;
import controllers.RemoveBuddy;
import models.AddressBook;
import views.AddressBookDisplay;

import javax.swing.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class GUI extends JFrame {
    private static final long serialVersionUID = 1L;

    private GUI() {
        AddressBook addressBook = new AddressBook();

        JMenuBar menuBar = new JMenuBar();
        JMenu editMenu = new JMenu("edit");
        editMenu.setMnemonic(KeyEvent.VK_E);
        menuBar.add(editMenu);

        JMenuItem addBuddy = new JMenuItem("Add new Buddy", KeyEvent.VK_A);
        addBuddy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, InputEvent.ALT_DOWN_MASK));
        addBuddy.addActionListener(new AddBuddy(this, addressBook));
        editMenu.add(addBuddy);

        JMenuItem removeBuddy = new JMenuItem("Remove Buddy", KeyEvent.VK_R);
        removeBuddy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2, InputEvent.ALT_DOWN_MASK));
        removeBuddy.addActionListener(new RemoveBuddy(this, addressBook));
        editMenu.add(removeBuddy);

        setJMenuBar(menuBar);
        setContentPane(new AddressBookDisplay<>(addressBook));
        setSize(400, 500);
        setVisible(true);
    }

    public static void main(String[] args) {
        new GUI();
    }
}
