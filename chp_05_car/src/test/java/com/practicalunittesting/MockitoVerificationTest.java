package com.practicalunittesting;

import org.testng.annotations.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Practical Unit Testing with TestNG and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
@Test
public class MockitoVerificationTest {

    private final Car myFerrari = mock(Car.class);

    @Test
    public void testVerification() {
        myFerrari.driveTo("Sweet home Alabama");
        myFerrari.needsFuel();
        verify(myFerrari).driveTo("Sweet home Alabama");
        verify(myFerrari).needsFuel();
    }
}
