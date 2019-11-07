package helpers;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public abstract class BuddyActionListener implements ActionListener {
    protected final Component parentComponent;
    protected final JPanel panel;
    protected final JTextField name;
    protected final JTextField homeAddress;
    protected final JTextField phoneNumber;
    protected final JTextField age;

    protected BuddyActionListener(Component parentComponent) {
        name = new JTextField();
        homeAddress = new JTextField();
        phoneNumber = new JTextField();
        age = new JTextField();
        panel = new BuddyPanel(name, homeAddress, phoneNumber, age);
        this.parentComponent = parentComponent;
    }
}
