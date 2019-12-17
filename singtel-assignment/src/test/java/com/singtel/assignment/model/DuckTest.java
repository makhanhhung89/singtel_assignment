package com.singtel.assignment.model;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

public class DuckTest extends AbstractTest {

	@Test
	public void testDuckSays_ReturnCorrectly() {
		Duck duck = new Duck();
		duck.sing();
		Assert.assertThat("duck says ", systemOutRule.getLog(), Matchers.is("Quack, quack\n"));
	}
	
	@Test
	public void testDuckCanSwim_ReturnTrue() {
		Duck duck = new Duck();
		Assert.assertThat("duck can swim? ", duck.canSwim(), Matchers.is(true));
	}
	
	@Test
	public void testDuckCanFly_ReturnFalse() {
		Duck duck = new Duck();
		Assert.assertThat("duck can fly? ", duck.canFly(), Matchers.is(false));
	}
	
}
