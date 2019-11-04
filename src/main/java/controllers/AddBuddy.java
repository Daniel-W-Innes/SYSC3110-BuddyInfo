package controllers;

import helpers.BuddyActionListener;
import helpers.BuddyInfo;
import models.AddressBook;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class AddBuddy extends BuddyActionListener {

    public AddBuddy(JFrame frame, AddressBook addressBook) {
        super(frame, addressBook);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(frame, panel, "Add Buddy", JOptionPane.QUESTION_MESSAGE);
        if (!username.getText().equals("") && !homeAddress.getText().equals("") && !homeAddress.getText().equals("") && !age.getText().equals(""))
            addressBook.addBuddy(new BuddyInfo(username.getText(), homeAddress.getText(), phoneNumber.getText(), Integer.parseInt(age.getText())));
    }

}
