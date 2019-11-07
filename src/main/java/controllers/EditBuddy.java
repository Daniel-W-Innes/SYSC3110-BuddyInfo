package controllers;

import helpers.BuddyActionListener;
import helpers.BuddyInfo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class EditBuddy extends BuddyActionListener {
    private final JList jList;

    public EditBuddy(Component parentComponent, JList jList) {
        super(parentComponent);
        this.jList = jList;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(parentComponent, panel, "Edit Buddy", JOptionPane.QUESTION_MESSAGE);
        if (!name.getText().equals("")) {
            ((BuddyInfo) jList.getSelectedValue()).setName(name.getText());
        }
        if (!homeAddress.getText().equals("")) {
            ((BuddyInfo) jList.getSelectedValue()).setHomeAddress(homeAddress.getText());
        }
        if (!phoneNumber.getText().equals("")) {
            ((BuddyInfo) jList.getSelectedValue()).setPhoneNumber(phoneNumber.getText());
        }
        if (!age.getText().equals("")) {
            ((BuddyInfo) jList.getSelectedValue()).setAge(Integer.parseInt(age.getText()));
        }
    }
}
