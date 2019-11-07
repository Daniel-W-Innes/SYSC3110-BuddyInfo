package controllers;

import models.AddressBook;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class SaveBuddy implements ActionListener {
    private final AddressBook addressBook;

    public SaveBuddy(AddressBook addressBook) {
        this.addressBook = addressBook;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            addressBook.save(JOptionPane.showInputDialog("Please inout a filename"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
