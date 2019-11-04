package helpers;

import javax.swing.*;
import java.awt.*;

public class BuddyPanel extends JPanel {
    private static final long serialVersionUID = 1L;

    public BuddyPanel(JTextField username, JTextField homeAddress, JTextField phoneNumber) {
        super(new BorderLayout(5, 5));
        JPanel labels = new JPanel(new GridLayout(0, 1, 2, 2));
        labels.add(new JLabel("Name", SwingConstants.RIGHT));
        labels.add(new JLabel("Home Address", SwingConstants.RIGHT));
        labels.add(new JLabel("Phone Number", SwingConstants.RIGHT));
        add(labels, BorderLayout.WEST);

        JPanel controls = new JPanel(new GridLayout(0, 1, 2, 2));
        controls.add(username);
        controls.add(homeAddress);
        controls.add(phoneNumber);
        add(controls, BorderLayout.CENTER);
    }
}
