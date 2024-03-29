package controllers;

import helpers.BuddyActionListener;
import helpers.BuddyInfo;
import models.AddressBook;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class AddBuddy extends BuddyActionListener {
    private final AddressBook addressBook;

    public AddBuddy(Component parentComponent, AddressBook addressBook) {
        super(parentComponent);
        this.addressBook = addressBook;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(parentComponent, panel, "Add Buddy", JOptionPane.QUESTION_MESSAGE);
        if (!name.getText().equals("") && !homeAddress.getText().equals("") && !phoneNumber.getText().equals("") && !age.getText().equals(""))
            addressBook.addBuddy(new BuddyInfo(name.getText(), homeAddress.getText(), phoneNumber.getText(), Integer.parseInt(age.getText())));
    }

}
