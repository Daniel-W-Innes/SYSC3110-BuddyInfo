package helpers;

import controllers.*;
import models.AddressBook;
import views.AddressBookDisplay;

import javax.swing.*;
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class GUI extends JFrame {
    private static final long serialVersionUID = 1L;
    private final ExitManager exitManager;


    private GUI() {
        exitManager = new ExitManager();
        setup(new AddressBook());
    }

    private GUI(ExitManager exitManager) {
        this.exitManager = exitManager;
        setup(new AddressBook());
    }

    public GUI(AddressBook addressBook, ExitManager exitManager) {
        this.exitManager = exitManager;
        setup(addressBook);
    }

    private void setup(AddressBook addressBook) {
        exitManager.addObject(this);
        setLayout(new BorderLayout());
        setJMenuBar(getNewMenuBar(addressBook));
        add(new AddressBookDisplay<>(addressBook), BorderLayout.CENTER);
        pack();
        setTitle("Address Book");
        addWindowListener(exitManager);
        setVisible(true);
    }

    private JMenuBar getNewMenuBar(AddressBook addressBook) {
        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("file");
        fileMenu.setMnemonic(KeyEvent.VK_F);
        menuBar.add(fileMenu);

        JMenuItem newAddressBook = new JMenuItem("New", KeyEvent.VK_N);
        newAddressBook.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
        newAddressBook.addActionListener(e -> new GUI(exitManager));
        fileMenu.add(newAddressBook);

        JMenuItem saveAddressBook = new JMenuItem("Save", KeyEvent.VK_S);
        saveAddressBook.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK));
        saveAddressBook.addActionListener(new SaveAddressBook(addressBook));
        fileMenu.add(saveAddressBook);

        JMenuItem loadAddressBook = new JMenuItem("Load", KeyEvent.VK_L);
        loadAddressBook.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, InputEvent.CTRL_DOWN_MASK));
        loadAddressBook.addActionListener(new LoadAddressBook(addressBook));
        fileMenu.add(loadAddressBook);

        JMenuItem openAddressBook = new JMenuItem("Open", KeyEvent.VK_O);
        openAddressBook.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK));
        openAddressBook.addActionListener(new OpenAddressBook(exitManager));
        fileMenu.add(openAddressBook);

        JMenu editMenu = new JMenu("edit");
        editMenu.setMnemonic(KeyEvent.VK_E);
        menuBar.add(editMenu);

        JMenuItem addBuddy = new JMenuItem("Add new Buddy", KeyEvent.VK_A);
        addBuddy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, InputEvent.ALT_DOWN_MASK));
        addBuddy.addActionListener(new AddBuddy(this, addressBook));
        editMenu.add(addBuddy);

        JMenuItem removeBuddy = new JMenuItem("Remove Buddy", KeyEvent.VK_R);
        removeBuddy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2, InputEvent.ALT_DOWN_MASK));
        removeBuddy.addActionListener(new RemoveBuddyFromDialog(this, addressBook));
        editMenu.add(removeBuddy);
        return menuBar;
    }

    public static void main(String[] args) {
        new GUI();
    }
}
