package com.practicalunittesting.bdd;

import org.testng.annotations.Test;

import static com.googlecode.catchexception.CatchException.catchException;
import static com.googlecode.catchexception.CatchException.caughtException;
import static org.testng.Assert.assertTrue;

/**
 * Practical Unit Testing with TestNG and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class BDD {

    SUT sut = new SUT();

    @Test
    public void shouldThrowExceptions() throws MyException {
        catchException(sut).methodWhichShouldThrowMyException();

        final Exception e = caughtException();

        assertTrue(e instanceof MyException,
                "Should have thrown exception of MyException class");

    }

}
