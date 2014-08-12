package com.practicalunittesting.parallel;

import com.practicalunittesting.IdGenerator;
import com.practicalunittesting.JVMUniqueIdGenerator;
import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Set;

import static org.testng.Assert.assertTrue;

/**
 * Will pass.
 *
 * Practical Unit Testing with TestNG and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
@Test
public class JVMUniqueIdGeneratorParallelTest {

	private final IdGenerator idGen = new JVMUniqueIdGenerator();

	private final Set<Long> ids = new HashSet<Long>(100);

	@Test(threadPoolSize = 7, invocationCount = 100)
	public void idsShouldBeUnique() {
		assertTrue(ids.add(idGen.nextId()));
	}
}
