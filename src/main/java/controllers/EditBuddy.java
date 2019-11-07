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
        name.setText(((BuddyInfo) jList.getSelectedValue()).getName());
        homeAddress.setText(((BuddyInfo) jList.getSelectedValue()).getHomeAddress());
        phoneNumber.setText(((BuddyInfo) jList.getSelectedValue()).getPhoneNumber());
        age.setText(String.valueOf(((BuddyInfo) jList.getSelectedValue()).getAge()));
        JOptionPane.showMessageDialog(parentComponent, panel, "Edit Buddy", JOptionPane.QUESTION_MESSAGE);
        ((BuddyInfo) jList.getSelectedValue()).setName(name.getText());
        ((BuddyInfo) jList.getSelectedValue()).setHomeAddress(homeAddress.getText());
        ((BuddyInfo) jList.getSelectedValue()).setPhoneNumber(phoneNumber.getText());
        ((BuddyInfo) jList.getSelectedValue()).setAge(Integer.parseInt(age.getText()));
    }
}
