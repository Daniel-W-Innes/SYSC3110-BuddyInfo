package models;

import helpers.BuddyInfo;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import protos.AddressBookOuterClass;

import javax.swing.*;
import javax.swing.event.ListDataEvent;
import javax.swing.event.ListDataListener;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AddressBook implements ListModel<BuddyInfo> {
    private final List<BuddyInfo> buddies;
    private final List<ListDataListener> listeners;

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
        AddressBookOuterClass.AddressBook.newBuilder()
                .addAllBuddyInfo(buddies.stream()
                        .map(BuddyInfo::getProto)
                        .collect(Collectors.toList())).build()
                .writeTo(new FileOutputStream(filepath));
        exportToXmlFile(filepath);
    }

    public void load(String filename) throws IOException, ParserConfigurationException, SAXException {
        importFromXmlFile(filename);
//        buddies.addAll(AddressBookOuterClass.AddressBook.parseFrom(new FileInputStream(filename))
//                .getBuddyInfoList().stream()
//                .map(BuddyInfo::new)
//                .collect(Collectors.toList()));
//        updateListeners();
//        System.out.println(toXML());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (null == o || getClass() != o.getClass()) return false;
        AddressBook addressBook = (AddressBook) o;
        return buddies.equals(addressBook.buddies) && listeners.equals(addressBook.listeners);
    }

    private String toXML() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<AddressBook>");
        buddies.stream().map(BuddyInfo::toXML).forEach(stringBuilder::append);
        stringBuilder.append("</AddressBook>");
        return stringBuilder.toString();
    }

    private void exportToXmlFile(String filename) throws IOException {
        PrintWriter file = new PrintWriter(filename + ".xml", StandardCharsets.UTF_8);
        file.write(toXML());
        file.close();
    }

    private void importFromXmlFile(String filename) throws IOException, ParserConfigurationException, SAXException {
        SAXParser saxParser = SAXParserFactory.newDefaultInstance().newSAXParser();
        saxParser.parse(new FileInputStream(filename + ".xml"), new XmlHandler(this));
    }

    public static class XmlHandler extends DefaultHandler {
        private final AddressBook addressBook;
        private final List<BuddyInfo> buddies;
        private final Map<String, Boolean> buddyFlags = new HashMap<>(Map.of("Name", false, "PhoneNumber", false, "HomeAddress", false, "Age", false));
        private String name = null;
        private String phoneNumber = null;
        private String homeAddress = null;
        private Integer age = null;

        XmlHandler(AddressBook addressBook) {
            this.addressBook = addressBook;
            buddies = new ArrayList<>();
        }

        @Override
        public void startElement(String uri, String localName,
                                 String qName, Attributes attributes) {
            buddyFlags.put(qName, true);
        }

        @Override
        public void endElement(String uri, String localName, String qName) {
            if (qName.equals("BuddyInfo") && null != name && null != phoneNumber && null != homeAddress && null != age) {
                buddies.add(new BuddyInfo(name, phoneNumber, homeAddress, age));
            } else if (qName.equals("AddressBook")) {
                addressBook.buddies.addAll(buddies);
            }
            buddyFlags.forEach((key, value) -> buddyFlags.put(key, false));

        }

        @Override
        public void characters(char[] ch, int start, int length) {
            buddyFlags.entrySet().stream().filter(Map.Entry::getValue).forEach(entry -> {
                switch (entry.getKey()) {
                    case "Name":
                        name = new String(ch, start, length);
                        break;
                    case "PhoneNumber":
                        phoneNumber = new String(ch, start, length);
                        break;
                    case "HomeAddress":
                        homeAddress = new String(ch, start, length);
                        break;
                    case "Age":
                        age = Integer.parseInt(new String(ch, start, length));
                        break;
                }
            });
        }
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
