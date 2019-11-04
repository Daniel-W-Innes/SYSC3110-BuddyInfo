package helpers;

import com.google.common.base.Joiner;
import com.google.common.collect.Iterables;
import com.google.common.collect.Sets;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class BuddyInfoTest {
    private final Set<Integer> ages = IntStream.rangeClosed(0, 100).boxed().collect(Collectors.toUnmodifiableSet());
    private final Set<Character> alphabet = IntStream.rangeClosed('A', 'Z').mapToObj(var -> (char) var).collect(Collectors.toUnmodifiableSet());
    private final Set<String> strings = Sets.combinations(alphabet, 5).stream().map(Joiner.on("")::join).collect(Collectors.toUnmodifiableSet());
    private BuddyInfo buddyInfo;

    @BeforeEach
    void setUp() {
        buddyInfo = new BuddyInfo("John Doe", "1125 Colonel By Dr, Ottawa, ON K1S 5B6", "911", 18);
    }

    @Test
    void getAge() {
        assertEquals(18, buddyInfo.getAge());
        for (int age : ages) {
            buddyInfo.setAge(age);
            assertEquals(age, buddyInfo.getAge());
        }
    }

    @Test
    void setAge() {
        for (int age : ages) {
            buddyInfo.setAge(age);
            assertEquals(age, buddyInfo.getAge());
        }
    }

    @Test
    void isOver18() {
        assertFalse(buddyInfo.isOver18());
        for (int age : ages) {
            buddyInfo.setAge(age);
            assertEquals(age > 18, buddyInfo.isOver18());
        }
    }

    @Test
    void getName() {
        assertEquals("John Doe", buddyInfo.getName());
        for (String string : strings) {
            buddyInfo.setName(string);
            assertEquals(string, buddyInfo.getName());
        }
    }

    @Test
    void setName() {
        for (String string : strings) {
            buddyInfo.setName(string);
            assertEquals(string, buddyInfo.getName());
        }
    }

    @Test
    void getHomeAddress() {
        assertEquals("1125 Colonel By Dr, Ottawa, ON K1S 5B6", buddyInfo.getHomeAddress());
        for (String string : strings) {
            buddyInfo.setHomeAddress(string);
            assertEquals(string, buddyInfo.getHomeAddress());
        }
    }

    @Test
    void setHomeAddress() {
        for (String string : strings) {
            buddyInfo.setHomeAddress(string);
            assertEquals(string, buddyInfo.getHomeAddress());
        }
    }

    @Test
    void getPhoneNumber() {
        assertEquals("911", buddyInfo.getPhoneNumber());
        for (String string : strings) {
            buddyInfo.setPhoneNumber(string);
            assertEquals(string, buddyInfo.getPhoneNumber());
        }
    }

    @Test
    void setPhoneNumber() {
        for (String string : strings) {
            buddyInfo.setPhoneNumber(string);
            assertEquals(string, buddyInfo.getPhoneNumber());
        }
    }

    @Test
    void getGreeting() {
        Calendar c = Calendar.getInstance();
        int timeOfDay = c.get(Calendar.HOUR_OF_DAY);
        for (String string : strings) {
            buddyInfo.setName(string);
            assertEquals(timeOfDay < 12 ? "Good Morning " + string + "," :
                    timeOfDay < 16 ? "Good Afternoon " + string + "," :
                            timeOfDay < 21 ? "Good Evening " + string + "," :
                                    "Good Night " + string + ",", buddyInfo.getGreeting());
        }
    }

    @Test
    void testToString() {
        for (int age : ages) {
            for (String name : Iterables.limit(strings, 50)) {
                for (String homeAddress : Iterables.limit(strings, 50)) {
                    for (String phoneNumber : Iterables.limit(strings, 50)) {
                        buddyInfo = new BuddyInfo(name, homeAddress, phoneNumber, age);
                        assertEquals("Name: " + name + ", Phone Number: " + phoneNumber + ", Home Address: " + homeAddress + ", Home Address: " + age,
                                buddyInfo.toString());
                    }
                }
            }
        }
    }

    @Test
    void testEquals() {
        for (int age : ages) {
            for (String name : Iterables.limit(strings, 50)) {
                for (String homeAddress : Iterables.limit(strings, 50)) {
                    for (String phoneNumber : Iterables.limit(strings, 50)) {
                        buddyInfo = new BuddyInfo(name, homeAddress, phoneNumber, age);
                        assertEquals(buddyInfo, new BuddyInfo(name, homeAddress, phoneNumber, age));
                        assertNotEquals(buddyInfo, new BuddyInfo("abcdef", "abcdef", "abcdef", 10000));
                    }
                }
            }
        }
    }
}