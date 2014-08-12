package com.practicalunittesting;

import org.testng.annotations.Test;

import static org.testng.Assert.assertNotEquals;

/**
 * Will usually fail.
 *
 * Practical Unit Testing with TestNG and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
@Test
public class SystemIdGeneratorTest {

    private final IdGenerator idGen = new SystemIdGenerator();
    
 	public void idsShouldBeUnique() {
		final Long idA = idGen.nextId();
		final Long idB = idGen.nextId();
		assertNotEquals(idA, idB, "idA " + idA + " idB " + idB);
	}
}
