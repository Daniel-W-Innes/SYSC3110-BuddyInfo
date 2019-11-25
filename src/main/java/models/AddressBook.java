package models;

import helpers.BuddyInfo;

import javax.swing.*;
import javax.swing.event.ListDataEvent;
import javax.swing.event.ListDataListener;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AddressBook implements ListModel<BuddyInfo>, Serializable {
    private final List<BuddyInfo> buddies;
    private final transient List<ListDataListener> listeners;

    public AddressBook() {
        buddies = new ArrayList<>();
        listeners = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddyInfo) {
        if (buddyInfo != null) {
            buddies.add(buddyInfo);
            updateListeners();
        }
    }

    public boolean contains(BuddyInfo buddyInfo) {
        return buddies.contains(buddyInfo);
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

    public void clear() {
        buddies.clear();
    }

    public void save(String filepath) throws IOException {
        FileOutputStream file = new FileOutputStream(filepath);
        ObjectOutputStream out = new ObjectOutputStream(file);
        out.writeObject(this);
    }

    public void load(String filepath) throws IOException, ClassNotFoundException {
        FileInputStream file = new FileInputStream(filepath);
        ObjectInputStream in = new ObjectInputStream(file);
        buddies.addAll(((AddressBook) in.readObject()).buddies);
        updateListeners();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (null == o || getClass() != o.getClass()) return false;
        AddressBook addressBook = (AddressBook) o;
        return buddies.equals(addressBook.buddies) && listeners.equals(addressBook.listeners);
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
