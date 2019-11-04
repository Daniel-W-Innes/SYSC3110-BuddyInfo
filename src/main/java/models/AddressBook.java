package models;

import helpers.BuddyInfo;

import javax.swing.*;
import javax.swing.event.ListDataEvent;
import javax.swing.event.ListDataListener;
import java.util.ArrayList;
import java.util.List;

public class AddressBook implements ListModel<BuddyInfo> {
    private final List<BuddyInfo> buddies;
    private final List<ListDataListener> listeners;

    public AddressBook() {
        buddies = new ArrayList<>();
        listeners = new ArrayList<>();
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");
        addBuddy(buddy);
        addBuddy(new BuddyInfo("Ben", "Carleton", "613"));
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.addBuddy(new BuddyInfo("Ben", "Carleton", "613"));
        System.out.print(addressBook.toString());
        addressBook.removeBuddy(0);
    }

    public void addBuddy(BuddyInfo buddyInfo) {
        if (buddyInfo != null) {
            buddies.add(buddyInfo);
            updateListeners();
        }
    }

    private void removeBuddy(int index) {
        buddies.remove(index);
        updateListeners();
    }

    public void removeBuddy(BuddyInfo buddyInfo) {
        buddies.remove(buddyInfo);
        updateListeners();
    }

    private void updateListeners() {
        ListDataEvent le = new ListDataEvent(this, ListDataEvent.CONTENTS_CHANGED, 0, buddies.size());
        for (ListDataListener l : listeners) {
            l.contentsChanged(le);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AddressBook)) return false;
        return super.equals(o);
    }

    @Override
    public void addListDataListener(ListDataListener l) {
        listeners.add(l);
    }

    @Override
    public BuddyInfo getElementAt(int index) {
        return buddies.get(index);
    }

    @Override
    public int getSize() {
        return buddies.size();
    }

    @Override
    public void removeListDataListener(ListDataListener l) {
        listeners.remove(l);
    }
}
