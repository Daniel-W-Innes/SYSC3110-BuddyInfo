package helpers;

import models.AddressBook;

import javax.swing.*;
import java.awt.event.ActionListener;

public abstract class BuddyActionListener implements ActionListener {
    protected final JFrame frame;
    protected final JPanel panel;
    protected final AddressBook addressBook;
    protected final JTextField username;
    protected final JTextField homeAddress;
    protected final JTextField phoneNumber;
    protected final JTextField age;

    protected BuddyActionListener(JFrame frame, AddressBook addressBook) {
        username = new JTextField();
        homeAddress = new JTextField();
        phoneNumber = new JTextField();
        age = new JTextField();
        panel = new BuddyPanel(username, homeAddress, phoneNumber, age);
        this.frame = frame;
        this.addressBook = addressBook;
    }
}
