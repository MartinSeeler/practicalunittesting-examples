package com.practicalunittesting;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

/**
 * Practical Unit Testing with TestNG and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class TDDNarrowingShortTest {

    class User {

        private final List<String> phones = new ArrayList<String>();

        public List<String> getPhones() {
        return phones;
        }

        public void addPhone(final String s) {
            phones.add(s);
        }
    }

    @Test
    public void shouldReturnUsersPhone() {
        final User user = new User();
        user.addPhone("123 456 789");

        final List<String> phones = user.getPhones();

        assertNotNull(phones);
        assertFalse(phones.isEmpty());
        assertEquals(phones.size(), 1);
        assertTrue(phones.contains("123 456 789"));
    }
}
