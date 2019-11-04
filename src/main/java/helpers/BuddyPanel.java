package helpers;

import javax.swing.*;
import java.awt.*;

class BuddyPanel extends JPanel {
    private static final long serialVersionUID = 1L;

    BuddyPanel(JTextField username, JTextField homeAddress, JTextField phoneNumber, JTextField age) {
        super(new BorderLayout(5, 5));
        JPanel labels = new JPanel(new GridLayout(0, 1, 2, 2));
        labels.add(new JLabel("Name", SwingConstants.RIGHT));
        labels.add(new JLabel("Home Address", SwingConstants.RIGHT));
        labels.add(new JLabel("Phone Number", SwingConstants.RIGHT));
        labels.add(new JLabel("Age", SwingConstants.RIGHT));
        add(labels, BorderLayout.WEST);

        JPanel controls = new JPanel(new GridLayout(0, 1, 2, 2));
        controls.add(username);
        controls.add(homeAddress);
        controls.add(phoneNumber);
        controls.add(age);
        add(controls, BorderLayout.CENTER);
    }
}
