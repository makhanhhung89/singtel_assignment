package com.singtel.assignment.model;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

public class RoosterTest extends AbstractTest {

	@Test
	public void testRoosterSays_ReturnCorrectly() {
		Rooster rooster = new Rooster();
		rooster.sing();
		Assert.assertThat("rooster says ", systemOutRule.getLog(), Matchers.is("Cock-a-doodle-doo\n"));
	}
	
	@Test
	public void testRoosterCanSwim_ReturnFalse() {
		Rooster rooster = new Rooster();
		Assert.assertThat("roostercan swim? ", rooster.canSwim(), Matchers.is(false));
	}
	
	@Test
	public void testRoosterCanFly_ReturnFalse() {
		Rooster rooster = new Rooster();
		Assert.assertThat("rooster can fly? ", rooster.canFly(), Matchers.is(false));
	}
}
