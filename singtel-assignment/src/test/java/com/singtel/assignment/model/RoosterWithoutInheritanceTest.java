package com.singtel.assignment.model;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

import com.singtel.assignment.rooster.without.inheritance.Chicken.ChickenType;

public class RoosterWithoutInheritanceTest extends AbstractTest {

	@Test
	public void testRoosterWithoutInheritanceSays_ReturnCorrectly() {
		com.singtel.assignment.rooster.without.inheritance.Chicken rooster = new com.singtel.assignment.rooster.without.inheritance.Chicken(ChickenType.ROOSTER);
		rooster.sing();
		Assert.assertThat("rooster says ", systemOutRule.getLog(), Matchers.is("Cock-a-doodle-doo\n"));
	}
	
	@Test
	public void testRoosterCanSwim_ReturnFalse() {
		com.singtel.assignment.rooster.without.inheritance.Chicken rooster = new com.singtel.assignment.rooster.without.inheritance.Chicken(ChickenType.ROOSTER);
		Assert.assertThat("v can swim? ", rooster.canSwim(), Matchers.is(false));
	}
	
	@Test
	public void testRoosterCanFly_ReturnFalse() {
		com.singtel.assignment.rooster.without.inheritance.Chicken rooster = new com.singtel.assignment.rooster.without.inheritance.Chicken(ChickenType.ROOSTER);
		Assert.assertThat("rooster can fly? ", rooster.canFly(), Matchers.is(false));
	}
	
}
