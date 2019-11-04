package controllers;

import helpers.BuddyActionListener;
import helpers.BuddyInfo;
import models.AddressBook;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class RemoveBuddy extends BuddyActionListener {

    public RemoveBuddy(JFrame frame, AddressBook addressBook) {
        super(frame, addressBook);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(frame, panel, "Remove Buddy", JOptionPane.QUESTION_MESSAGE);
        if (!username.getText().equals("") && !homeAddress.getText().equals("") && !homeAddress.getText().equals(""))
            addressBook.removeBuddy(new BuddyInfo(username.getText(), homeAddress.getText(), phoneNumber.getText()));
    }

}