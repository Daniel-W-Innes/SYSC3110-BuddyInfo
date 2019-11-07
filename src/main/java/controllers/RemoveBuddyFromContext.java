package controllers;

import helpers.BuddyInfo;
import models.AddressBook;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RemoveBuddyFromContext implements ActionListener {
    private final AddressBook addressBook;
    private final JList jList;

    public RemoveBuddyFromContext(AddressBook addressBook, JList jList) {
        this.addressBook = addressBook;
        this.jList = jList;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        addressBook.removeBuddy((BuddyInfo) jList.getSelectedValue());
    }
}
