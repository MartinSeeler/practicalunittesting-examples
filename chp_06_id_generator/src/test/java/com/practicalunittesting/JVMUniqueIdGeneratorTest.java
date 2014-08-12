package com.practicalunittesting;

import org.testng.annotations.Test;

import static org.testng.Assert.assertNotEquals;

/**
 * Will pass.
 *
 * Practical Unit Testing with TestNG and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
@Test
public class JVMUniqueIdGeneratorTest {

	private final IdGenerator idGen = new JVMUniqueIdGenerator();

	public void idsShouldBeUnique() {
		final Long idA = idGen.nextId();
		final Long idB = idGen.nextId();
		assertNotEquals(idA, idB);
	}
}
