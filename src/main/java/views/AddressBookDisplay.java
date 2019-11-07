package views;

import controllers.EditBuddy;
import controllers.RemoveBuddyFromContext;
import models.AddressBook;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class AddressBookDisplay<T> extends JPanel {
    private static final long serialVersionUID = 1L;

    public AddressBookDisplay(ListModel<T> addressBook) {
        JList<T> list = new JList<>(addressBook);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        JPopupMenu popup = new JPopupMenu();

        JMenuItem removeBuddy = new JMenuItem("Remove Buddy", KeyEvent.VK_R);
        removeBuddy.addActionListener(new RemoveBuddyFromContext((AddressBook) addressBook, list));
        popup.add(removeBuddy);

        JMenuItem editBuddy = new JMenuItem("Edit Buddy", KeyEvent.VK_R);
        editBuddy.addActionListener(new EditBuddy(this, list));
        popup.add(editBuddy);

        list.setComponentPopupMenu(popup);

        JScrollPane scrollPane = new JScrollPane(list);
        add(scrollPane);
    }
}
