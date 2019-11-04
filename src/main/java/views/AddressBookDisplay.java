package views;

import javax.swing.*;

public class AddressBookDisplay<T> extends JPanel {
    private static final long serialVersionUID = 1L;

    public AddressBookDisplay(ListModel<T> addressBook) {
        JList<T> list = new JList<>(addressBook);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane scrollPane = new JScrollPane(list);
        add(scrollPane);
    }
}
