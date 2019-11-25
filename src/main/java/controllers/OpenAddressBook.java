package controllers;

import helpers.ExitManager;
import helpers.GUI;
import models.AddressBook;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class OpenAddressBook implements ActionListener {
    private final ExitManager exitManager;

    public OpenAddressBook(ExitManager exitManager) {
        this.exitManager = exitManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            AddressBook addressBook = new AddressBook();
            addressBook.load(JOptionPane.showInputDialog("Please inout a filename"));
            new GUI(addressBook, exitManager);
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
