package com.practicalunittesting;

import org.testng.annotations.Test;

import static org.testng.Assert.assertNotEquals;

/**
 * Will usually pass.
 *
 * Practical Unit Testing with TestNG and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
@Test
public class AtomicIdGeneratorTest {

	private final IdGenerator idGen = new AtomicIdGenerator();

	public void idsShouldBeUnique() {
		final Long idA = idGen.nextId();
		final Long idB = idGen.nextId();
		assertNotEquals(idA, idB);
	}
}
