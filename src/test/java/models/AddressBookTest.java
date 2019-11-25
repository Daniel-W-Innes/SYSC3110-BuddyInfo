package models;

import com.google.common.base.Joiner;
import com.google.common.collect.Iterables;
import com.google.common.collect.Sets;
import helpers.BuddyInfo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class AddressBookTest {
    private final Set<BuddyInfo> buddyInfos;
    private AddressBook addressBook;

    AddressBookTest() {
        Set<BuddyInfo> tempBuddyInfos = new HashSet<>();
        Set<Character> alphabet = IntStream.rangeClosed('A', 'Z').mapToObj(var -> (char) var).collect(Collectors.toUnmodifiableSet());
        Set<String> strings = Sets.combinations(alphabet, 5).stream().map(Joiner.on("")::join).limit(25).collect(Collectors.toUnmodifiableSet());
        Set<Integer> ages = IntStream.rangeClosed(0, 100).boxed().collect(Collectors.toUnmodifiableSet());
        for (int age : ages) {
            for (String name : strings) {
                for (String homeAddress : strings) {
                    for (String phoneNumber : strings) {
                        tempBuddyInfos.add(new BuddyInfo(name, homeAddress, phoneNumber, age));
                    }
                }
            }
        }
        buddyInfos = tempBuddyInfos.stream().limit(50).collect(Collectors.toUnmodifiableSet());
    }


    @BeforeEach
    void setUp() {
        addressBook = new AddressBook();
    }

    @Test
    void addBuddy() {
        for (BuddyInfo buddyInfo : buddyInfos) {
            addressBook.addBuddy(buddyInfo);
            assertTrue(addressBook.contains(buddyInfo));
        }
    }

    @Test
    void removeBuddy() {
        for (BuddyInfo buddyInfo : buddyInfos) {
            addressBook.addBuddy(buddyInfo);
        }
        for (BuddyInfo buddyInfo : buddyInfos) {
            addressBook.removeBuddy(buddyInfo);
            assertFalse(addressBook.contains(buddyInfo));
        }
    }

    @Test
    void clear() {
        for (BuddyInfo buddyInfo : buddyInfos) {
            addressBook.addBuddy(buddyInfo);
        }
        addressBook.clear();
        assertEquals(0, addressBook.getSize());
        for (BuddyInfo buddyInfo : buddyInfos) {
            assertFalse(addressBook.contains(buddyInfo));
        }
    }

    @Test
    void testEquals() {
        for (BuddyInfo buddyInfo : buddyInfos) {
            addressBook.addBuddy(buddyInfo);
        }
        AddressBook newAddressBook = new AddressBook();
        for (BuddyInfo buddyInfo : buddyInfos) {
            newAddressBook.addBuddy(buddyInfo);
        }
        assertEquals(addressBook, newAddressBook);
        newAddressBook.clear();
        for (BuddyInfo buddyInfo : Iterables.limit(buddyInfos, 5)) {
            newAddressBook.addBuddy(buddyInfo);
        }
        assertNotEquals(addressBook, newAddressBook);
    }

    @Test
    void getElementAt() {
        int i = 0;
        for (BuddyInfo buddyInfo : buddyInfos) {
            addressBook.addBuddy(buddyInfo);
            assertEquals(buddyInfo, addressBook.getElementAt(i));
            i++;
        }
    }

    @Test
    void getSize() {
        for (BuddyInfo buddyInfo : buddyInfos) {
            addressBook.addBuddy(buddyInfo);
        }
        assertEquals(buddyInfos.size(), addressBook.getSize());
        addressBook.clear();
        for (BuddyInfo buddyInfo : Iterables.limit(buddyInfos, 5)) {
            addressBook.addBuddy(buddyInfo);
        }
        assertEquals(5, addressBook.getSize());
    }

    @Test
    void testSaveAndLoad() {
        AddressBook addressBook = new AddressBook();
        for (BuddyInfo buddyInfo : buddyInfos) {
            addressBook.addBuddy(buddyInfo);
        }
        try {
            addressBook.save("test");
            AddressBook newAddressBook = new AddressBook();
            newAddressBook.load("test");
            assertEquals(newAddressBook, addressBook);
        } catch (IOException | ClassNotFoundException e) {
            fail();
        }
    }
}