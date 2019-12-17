package com.singtel.assignment.model;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

public class CatTest extends AbstractTest {

	@Test
	public void testCatSays_ReturnCorrectly() {
		Cat cat = new Cat();
		cat.sing();
		Assert.assertThat("cat says ", systemOutRule.getLog(), Matchers.is("Meow\n"));
	}
	
	@Test
	public void testCatCanSwim_ReturnFalse() {
		Cat cat = new Cat();
		Assert.assertThat("cat can swim? ", cat.canSwim(), Matchers.is(false));
	}
	
	@Test
	public void testCatCanFly_ReturnFalse() {
		Cat cat = new Cat();
		Assert.assertThat("cat can swim? ", cat.canFly(), Matchers.is(false));
	}
}
