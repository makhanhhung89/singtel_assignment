package com.singtel.assignment.model;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

public class ChickenTest extends AbstractTest {

	@Test
	public void testChickenSays_ReturnCorrectly() {
		Chicken chicken = new Chicken();
		chicken.sing();
		Assert.assertThat("chicken says ", systemOutRule.getLog(), Matchers.is("Cluck, cluck\n"));
	}
	
	@Test
	public void testChickenCanSwim_ReturnFalse() {
		Chicken chicken = new Chicken();
		Assert.assertThat("chicken can swim? ", chicken.canSwim(), Matchers.is(false));
	}
	
	@Test
	public void testChickenCanFly_ReturnFalse() {
		Chicken chicken = new Chicken();
		Assert.assertThat("chicken can fly? ", chicken.canFly(), Matchers.is(false));
	}
}
