package com.practicalunittesting;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Practical Unit Testing with TestNG and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
@Test
public class AddressParsingManyAsserts {

    public void testAddressParsing() {
        final Address anAddress = new Address("ADDR1$CITY IL 60563$COUNTRY");
        assertEquals(anAddress.getAddr1(), "ADDR1");
        assertEquals(anAddress.getCsp(), "CITY IL 60563");
        assertEquals(anAddress.getCountry(), "COUNTRY");
    }
}
