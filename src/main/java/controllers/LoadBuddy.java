package controllers;

import models.AddressBook;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class LoadBuddy implements ActionListener {
    private final AddressBook addressBook;

    public LoadBuddy(AddressBook addressBook) {
        this.addressBook = addressBook;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            addressBook.load(JOptionPane.showInputDialog("Please inout a filename"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
